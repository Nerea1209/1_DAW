/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binarios;

import java.util.Random;

/**
 *
 * @author Nerea
 */
public class NumerosBinarios {
    
    public static void main(String[] args) {
        int[][] matriz = {{0, 1, 1, 1},{0,0,0, 0},{1,1,1, 1}};
        int [][] matrizAleatoria = generarMatrizAleatoria(3);
        imprimirMatriz(matriz);
        System.out.println(buscarCeroConEsquinasUno(matriz));
    }
    
    public static int[][] generarMatrizAleatoria(int n){
        int[][] matriz = new int[n][n];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = new Random().nextInt(0, 2);
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
    
    public static Coordenada buscarCeroConEsquinasUno(int[][] matriz){
        Coordenada cero = new Coordenada(-1, -1);
        for (int i = 1; i < matriz.length - 1; i++) {
            for (int j = 1; j < matriz[i].length - 1; j++) {
                if (matriz[i][j] == 0
                        && matriz[i-1][j-1] == 1
                        && matriz[i+1][j+1] == 1
                        && matriz[i-1][j+1] == 1
                        && matriz[i+1][j-1] == 1) {
                    cero = new Coordenada(i, j);
                    break;
                }
            }
        }
        return cero;
    }
    
}
