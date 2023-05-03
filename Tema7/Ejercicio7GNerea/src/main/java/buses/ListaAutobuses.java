/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buses;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nerea
 */
public class ListaAutobuses {
    
    public static void main(String[] args) {
        List<String> lineas = leerFichero("autobuses.txt");
        List<Autobus> buses = crearListaBuses(lineas);
        buses.forEach(System.out::println);
    }
    
    public static List<String> leerFichero(String ruta) {
        List<String> lineas = new ArrayList<>();
        try {
            lineas = Files.readAllLines(Paths.get(ruta),
                    StandardCharsets.UTF_8);
        } catch (IOException ex) {
            System.out.println("Error leyendo el fichero");
        }
        return lineas;
    }
    
    public static List<Autobus> crearListaBuses(List<String> lineas) {
        List<Autobus> buses = new ArrayList<>();        
        for (String linea : lineas) {
            
            String[] partes = linea.split("\"");
            String[] ciudades = partes[3].split(" - ");
            String[] horasSalidaString = partes[4].split(" ");
            
            // La lista de horas
            List<LocalTime> horasSalida = new ArrayList<>();
            
            // Recorremos las horas a partir del 1, porque el 0 es ""
            for (int i = 1; i < horasSalidaString.length; i++) {
                
                // Separamos las horas de los minutos
                String[] horasCompletas = horasSalidaString[i].split(":");
                int horas = Integer.parseInt(horasCompletas[0]);
                int minutos = Integer.parseInt(horasCompletas[1]);
                
                // Añadimos un localtime con esas horas y minutos
                // Como los segundos no van a aparecer, los pongo a 0
                // No aparecen porque los tengo formateados en el toString del Autobus
                horasSalida.add(LocalTime.of(horas, minutos, 0));
            }
            
            // Añadimos los autobuses a la lista
            buses.add(new Autobus(partes[1], ciudades[0], ciudades[1], horasSalida));
        }
        return buses;
    }
    
}
