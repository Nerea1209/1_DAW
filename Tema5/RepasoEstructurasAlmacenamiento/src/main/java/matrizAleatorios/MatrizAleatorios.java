/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package matrizAleatorios;

import java.util.Collections;
import java.util.Random;

/**
 *
 * @author Nerea
 */
public class MatrizAleatorios {

    public static void main(String[] args) {
        imprimirMatriz(generarMatrizAleatoria(3));
    }
    
    public static int[][] generarMatrizAleatoria(int n){
        int[][] matriz = new int[n][n];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = new Random().nextInt(1, (int) (Math.pow(n, 2) + 1));
            }
        }
        return matriz;
    }
    
    public static void imprimirMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
}
