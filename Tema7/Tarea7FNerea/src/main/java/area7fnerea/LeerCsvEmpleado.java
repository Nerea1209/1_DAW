/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package area7fnerea;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author nerea
 */
public class LeerCsvEmpleado {
    
    public static void main(String[] args) {
        List<String> lineas = leerFichero("RelPerCen.csv");
        List<Empleado> empleados = new ArrayList<>();
        
        for (int i = 1; i < lineas.size(); i++) {
            String[] datosEmpleado = lineas.get(i).split(",");
            empleados.add(new Empleado(datosEmpleado[0], datosEmpleado[1], datosEmpleado[2], 
                    LocalDate.parse(datosEmpleado[3]), LocalDate.parse(datosEmpleado[4]), 
                    pasarABoolean(datosEmpleado[5]), pasarABoolean(datosEmpleado[6])));
        }
        
        
    }
    
    public static List<String> leerFichero(String ruta) {
        List<String> lineas=new ArrayList<>();
        try {
            lineas = Files.readAllLines(Paths.get(ruta),
                    StandardCharsets.UTF_8);
        } catch (IOException ex) {
            System.out.println("Error leyendo el fichero");
            System.out.println(ex.toString());
        }
        for (String linea : lineas) {
            System.out.println(linea);
        }
        return lineas;
    }
    
    public static boolean pasarABoolean(String string) {
        if (string.equals("Sí")) {
            return true;
        } else {
            return false;
        }
    }
    
}
