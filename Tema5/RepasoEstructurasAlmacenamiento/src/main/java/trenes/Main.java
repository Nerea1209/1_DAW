/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trenes;

import java.util.SortedMap;
import java.util.TreeMap;



/**
 *
 * @author Nerea
 */
public class Main {
    
    private static final int PASAJEROS_MAXIMOS_VAGON = 200;
    
    public static void main(String[] args) {
        
        // Tenemos una matriz
        // Cada fila es un tren
        // La primera columna es la id del tren
        // El resto guarda el numPasajeros de cada vagón
        // Si es 0, no existe ese vagón
        int[][] companiaTransporte = {{78, 195, 36, 0, 0, 0},
        {1988, 150, 67, 89, 0, 0},
        {2545, 176, 48, 95, 33, 56}};

        imprimirMatriz(companiaTransporte);

        System.out.println("\n La compañía de transporte tiene estos trenes:");
        generarTrenes(companiaTransporte).forEach((key, value) -> System.out.println("Tren " + key + ": " +value));
        
    }

    // Si el numero de cagón es mayor que cero, numVagones++
    private static int numVagones(int fila, int[][] matriz) {
        int numVagones = 0;
        // Empezamos a mirar desde i=1 porque matriz[0] es la id
        for (int i = 1; i < matriz[fila].length; i++) {
            if (matriz[fila][i] > 0) {
                numVagones++;
            }
        }
        return numVagones;
    }

    // Suma los pasajeros de cada vagón para saber el total
    private static int pasajerosABordo(int fila, int[][] matriz) {
        int pasajeros = 0;
        // Empezamos a mirar desde i=1 porque matriz[0] es la id
        for (int i = 1; i < matriz[fila].length; i++) {
            pasajeros += matriz[fila][i];
        }
        return pasajeros;
    }

//    public static Tren[] generarTrenes(int[][] matriz) {
//        Tren[] trenes = new Tren[matriz.length];
//        for (int i = 0; i < trenes.length; i++) {
//            trenes[i] = new Tren(i,
//                    numVagones(i, matriz),
//                    numVagones(i, matriz) * 200,
//                    pasajerosABordo(i, matriz));
//        }
//        return trenes;
//    }
    
    // Generamos un map con los datos del tren
    // key = idTren
    // value = datos del tren
    public static SortedMap<Integer, Tren> generarTrenes(int[][] matriz) {
        SortedMap<Integer, Tren> trenes = new TreeMap<>();
        for (int i = 0; i < matriz.length; i++) {
           trenes.put(i, new Tren(matriz[i][0],
                    numVagones(i, matriz),
                    numVagones(i, matriz) * PASAJEROS_MAXIMOS_VAGON,
                    pasajerosABordo(i, matriz)));
        }
        return trenes;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }

//    public static void imprimirArray(Tren[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//    }

}
