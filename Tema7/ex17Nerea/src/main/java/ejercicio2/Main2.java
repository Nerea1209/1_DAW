/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import ejercicio1.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author nerea
 */
public class Main2 {
    
    public static void main(String[] args) throws IOException{
        List<String> lineas = leerFichero("RelEmpCenAus.txt");
        Trabajadores trabajadores = new Trabajadores(lineas);
        System.out.println(trabajadores.toString());
        Map<String, Integer> horasTotalesPorDni = mapDniHorasTotales(trabajadores.getTrabajadores());
        imprimirMap(horasTotalesPorDni);
        mapAJSON(horasTotalesPorDni);
    }
    
    public static List<String> leerFichero(String ruta) {
        List<String> lineas=new ArrayList<>();
        try {
            lineas = Files.readAllLines(Paths.get(ruta),
                    StandardCharsets.ISO_8859_1);
        } catch (IOException ex) {
            System.out.println("Error leyendo el fichero");
        }
//        for (String linea : lineas) {
//            System.out.println(linea);
//        }
        return lineas;
    }
    
    public static Map<String, Integer> mapDniHorasTotales (List<Trabajador> trabajadores) {
        Map<String, Integer> map = new TreeMap<>();
        Set<String> dni = new TreeSet<>();
        for (Trabajador trabajador : trabajadores) {
            if (!dni.contains(trabajador.getDni())) {
                map.put(trabajador.getDni(), trabajador.getTotalHoras().getHours());
            }
        }
        return map;
    }
    
    public static void imprimirMap (Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer val = entry.getValue();
            System.out.println("key: " + key + " -> Value: " + val);
        }
    }
    
    public static void mapAJSON (Map<String, Integer> map) throws IOException{
        ObjectMapper mapeador = new ObjectMapper();
        
        // Permite a mapeador usar fechas según java time
//        mapeador.registerModule(new JavaTimeModule());
        
        // Formato JSON bien formateado. Si se comenta, el fichero queda minificado
        mapeador.configure(SerializationFeature.INDENT_OUTPUT, true);

        // Escribe en un fichero JSON el catálogo de muebles
        mapeador.writeValue(new File("totalHorasPorTrabajador.json"), map);
    }
    
}
