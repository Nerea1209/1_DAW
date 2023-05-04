/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

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
public class Main {
    
    public static void main(String[] args) {
        List<String> lineas = leerFichero("concierto.txt");
        imprimirMatriz(arrayBidimensional(lineas));
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
    
    public static char[][] arrayBidimensional (List<String> lineas) {
        char[][] arrayBidimensional = new char[lineas.size()][20];
        for (int j = 0; j < lineas.size(); j++) {
            char[] array = new char[lineas.get(j).length()];
            for (int i = 0; i < lineas.get(j).length(); i++) {
                array[i] = lineas.get(j).charAt(i);
            }
            arrayBidimensional[j] = array;
        }
        return arrayBidimensional;
    }
    
    public static void imprimirMatriz (char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j] + "\t");
            }
        }
    }
    
}
