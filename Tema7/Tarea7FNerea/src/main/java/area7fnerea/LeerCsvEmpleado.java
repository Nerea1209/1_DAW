/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package area7fnerea;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author nerea
 */
public class LeerCsvEmpleado {

    public static void main(String[] args) throws IOException{

        // Leemos el fichero adjunto
        List<String> lineas = leerFichero("RelPerCen.csv");
        lineas.forEach(System.out::println);
        List<Empleado> empleados = new ArrayList<>();
        empleados.forEach(System.out::println);
        List<Empleado> veteranos = new ArrayList<>();
        veteranos.forEach(System.out::println);

        // Guardamos en una lista todos los empleados
        // y en otra, los que tienen entre 10 y 15 años de experiencia
        rellenarListas(lineas, empleados, veteranos);

        // Guardamos en un json los empleados que lleven trabajando más de 10 años
        // y menos de 15 años pasándole la lista de veteranos
        
        escribirJSON("empleadosVeteranos.json", veteranos);
        
        // a) SIN USAR API STREAM
        
        // Contar el número de profesores de Tecnología.
        
        System.out.println("Hay " + numProfesoresTecnologia(empleados) + " profesores de Tecnología");
        
        // Saber si algún profesor/a de Informática es también coordinador
        
        System.out.println("Hay " + numProfesoresInformaticaCoordinadores(empleados) + 
                " profesores de Informática que son coordinadores");
        
        // Obtener una lista ordenada alfabéticamente con todos los apellidos de 
        // los empleados cuyo NIF contenga la letra J.
        List<String> apellidos = apellidosDniJ(empleados);
        Collections.sort(apellidos);
        apellidos.forEach(System.out::println);
        
        // Verificar que ningún profesor se llama "Jonh".
        profesoresJohn(empleados);
        
        // b) USANDO STREAM
        
        // Contar el número de profesores de Tecnología.
        System.out.println("Hay " + empleados.stream()
                .filter(e -> e.getPuesto().contains("Tecnología"))
                .count() + " profesores de Tecnología");
        
        // Saber si algún profesor/a de Informática es también coordinador
        System.out.println("Hay " + empleados.stream()
                .filter(e -> e.getPuesto().contains("Informática"))
                .filter(e -> e.isEsCoordinador())
                .count() + " profesores de Informática que también son coordinadores");
                
        // Obtener una lista ordenada alfabéticamente con todos los apellidos de 
        // los empleados cuyo NIF contenga la letra J.
        empleados.stream()
                .filter(e -> e.getDni().contains("J"))
                .map(e -> e.getApellidos())
                .toList()
                .forEach(System.out::println);
        
        // Verificar que ningún profesor se llama "Jonh"
        System.out.println("Hay " + empleados.stream()
                .filter(e -> e.getNombre().equalsIgnoreCase("John"))
                .count() + " profesores que se llaman John");
        
    }

    public static List<String> leerFichero(String ruta) {
        List<String> lineas = new ArrayList<>();
        List<String> lineasSinComillas = new ArrayList<>();
        try {
            lineas = Files.readAllLines(Paths.get(ruta),
                    StandardCharsets.ISO_8859_1);
        } catch (IOException ex) {
            System.out.println("Error leyendo el fichero");
            System.out.println(ex.toString());
        }
        for (String linea : lineas) {
            lineasSinComillas.add(quitarComillas(linea));
        }
        return lineasSinComillas;
    }

    public static boolean pasarABoolean(String string) {
        if (string.equals("Sí")) {
            return true;
        } else {
            return false;
        }
    }

    public static LocalDate cambiarFormatoFecha(String string) {
        if (!string.equals("")) {
            String[] separado = string.split("/");
            String fecha = separado[2] + "-" + separado[1] + "-" + separado[0];
            return LocalDate.parse(fecha);
        } else {
            return null;
        }
    }
    
    public static void rellenarListas(List<String> lineas, List<Empleado> empleados, List<Empleado> veteranos) {
        for (int i = 1; i < lineas.size(); i++) {
            String[] datosEmpleado = lineas.get(i).split(",");
            LocalDate fecha1 = cambiarFormatoFecha(datosEmpleado[4]);
            LocalDate fecha2 = cambiarFormatoFecha(datosEmpleado[5]);
            
            empleados.add(new Empleado(datosEmpleado[0], datosEmpleado[1], datosEmpleado[2], datosEmpleado[3],
                    fecha1,
                    fecha2,
                    pasarABoolean(datosEmpleado[6]),
                    pasarABoolean(datosEmpleado[7])));
            
            if (fecha2 == null) {
                fecha2 = LocalDate.now();
            }
            if (fecha2.getYear() - fecha1.getYear() >= 10
                    && fecha2.getYear() - fecha1.getYear() <= 15) {
                
                if (fecha2.equals(LocalDate.now())) {
                    fecha2 = null;
                }
                veteranos.add(new Empleado(datosEmpleado[0], datosEmpleado[1], datosEmpleado[2], datosEmpleado[3],
                        cambiarFormatoFecha(datosEmpleado[4]),
                        cambiarFormatoFecha(datosEmpleado[5]),
                        pasarABoolean(datosEmpleado[6]),
                        pasarABoolean(datosEmpleado[7])));
            }
        }
    }
    
    public static void escribirJSON(String ruta, List<Empleado> veteranos) throws IOException{
        // Para ello creamos un mapeador
        ObjectMapper mapeador = new ObjectMapper();

        // Permite a mapeador usar fechas según java time
        mapeador.registerModule(new JavaTimeModule());

        // Formato JSON bien formateado. Si se comenta, el fichero queda minificado
        // (en una sola línea)
        mapeador.configure(SerializationFeature.INDENT_OUTPUT, true);

        // Escribe en un fichero JSON los veteranos
        mapeador.writeValue(new File(ruta), veteranos);
    }
    
    public static int numProfesoresTecnologia (List<Empleado> empleados) {
        int cont = 0;
        for (Empleado empleado : empleados) {
            if (empleado.getPuesto().contains("Tecnología")) {
                cont ++;
            }
        }
        return cont;
    }
    
    public static int numProfesoresInformaticaCoordinadores (List<Empleado> empleados) {
        int cont = 0;
        for (Empleado empleado : empleados) {
            if (empleado.getPuesto().contains("Informatica") && empleado.isEsCoordinador()) {
                cont ++;
            }
        }
        return cont;
    }
    
    public static List<String> apellidosDniJ (List<Empleado> empleados) {
        List<String> apellidos = new ArrayList<>();
        for (Empleado empleado : empleados) {
            if (empleado.getDni().contains("J")) {
                apellidos.add(empleado.getApellidos());
            }
        }
        return apellidos;
    }
    
    public static void profesoresJohn (List<Empleado> empleados) {
        int john = 0;
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equalsIgnoreCase("John")) {
                john++;
            }
        }
        if (john<=0) {
            System.out.println("No hay ningún profesor que se llame John");
        } else {
            System.out.println("Hay " + john + " profesores que se llaman John");
        }
    }
    
    public static String quitarComillas(String texto) {
        return texto.replace("\"", "");
    }

}
