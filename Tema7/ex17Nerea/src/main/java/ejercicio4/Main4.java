/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

import ejercicio3.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nerea
 */
public class Main4 {
    
    public static void main(String[] args) throws IOException {
        List<String> lineas = leerFichero("RelEmpCenAus.csv");
        Trabajadores trabajadores = new Trabajadores(lineas);
        System.out.println(trabajadores.toString());
        puestosDistintos(trabajadores.getTrabajadores());
        numTrabajadores(trabajadores.getTrabajadores());
        System.out.println(dniDiferentesNoActivos(trabajadores.getTrabajadores()));
        trabajadorConMasFaltas(trabajadores.getTrabajadores());
    }
    
    public static List<String> leerFichero(String ruta) {
        List<String> lineas = new ArrayList<>();
        try {
            lineas = Files.readAllLines(Paths.get(ruta),
                    StandardCharsets.ISO_8859_1);
        } catch (IOException ex) {
            System.out.println("Error leyendo el fichero");
        }
        return lineas;
    }
    
    public static void puestosDistintos (List<Trabajador> trabajadores) {
        // Imprime los puestos de trabajos distintos de la lista
        trabajadores.stream()
                .map(t -> t.getPuestoTrabajo())
                .distinct()
                .toList()
                .forEach(System.out::println);
    }
    
    public static void numTrabajadores (List<Trabajador> trabajadores) {
        // Imprime el numero de trabajadores que hay en el centro
        System.out.println(trabajadores.stream()
                .filter(t -> t.isEsActivo())
                .count());
    }
    
    public static List<String> dniDiferentesNoActivos (List<Trabajador> trabajadores) {
        // Obtiene una lista de dni diferentes de los trabajadores no activos ordenada alfabéticamente
        return trabajadores.stream()
                .filter(t -> t.isEsActivo() == false)
                .map(t -> t.getDni())
                .distinct()
                .sorted()
                .toList();
    }
    
    public static void trabajadorConMasFaltas (List<Trabajador> trabajadores) {
        // Imprime al trabajador que más horas ha faltado
        trabajadores.stream()
                .sorted((t1, t2) -> t2.getTotalHoras().compareTo(t1.getTotalHoras()))
                .limit(1)
                .forEach(System.out::println);
    }
    
    
    
}
