/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

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
public class Main3 {
    
    public static void main(String[] args) throws IOException{
        List<String> lineas = leerFichero("RelEmpCenAus.csv");
        Trabajadores trabajadores = new Trabajadores(lineas);
        System.out.println(trabajadores.toString());
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
    
}
