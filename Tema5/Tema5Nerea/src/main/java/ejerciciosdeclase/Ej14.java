/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosdeclase;

import java.util.Random;

/**
 *
 * @author nerea
 */
public class Ej14 {
    
    /*
    Escribe un programa que dada una matriz de 3x3 enteros y realice las siguientes funciones:
    Rellenar aleatoriamente todas las casillas de la matriz con números enteros entre 1 y 100
    Calcular la media de todos los valores
    Calcular el valor mínimo y el máximo de todos los valores
    */

    
    public static void main(String[] args) {
        // Variables
        final int MIN = 0;
        final int MAX = 10;
        int[][] matrizEnteros = new int[3][3];
        
        // Proceso
        rellenarMatrizEnterosAleatorio(matrizEnteros, MIN, MAX);
        imprimirMatriz(matrizEnteros);
        System.out.println("La media entre los enteros de la matriz es " +
                String.format("%.2f", mediaEnteroMatriz(matrizEnteros)));
        System.out.println("El mínimo es " + calcularMinimoEnteroMatriz(matrizEnteros));
        System.out.println("El máximo es " + calcularMaximoEnteroMatriz(matrizEnteros));
        
    }
    
    // Métodos
    // 
    public static void imprimirMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "  ");
                if(j == matriz[i].length -1){
                    System.out.println("");
                }
            } //j
        } //i
    }
    
    public static void rellenarMatrizEnterosAleatorio(int[][] matriz, int min, int max){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                Random aleatorio = new Random();
                matriz[i][j] = aleatorio.nextInt(min, ++max);
            }
        }
    }
    
    public static double mediaEnteroMatriz(int[][] matriz){
        double suma = 0;
        int cont = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                cont++;
                suma += matriz[i][j];
            }
        }
        return suma/cont;
    }
    
    public static int calcularMinimoEnteroMatriz(int[][] matriz){
        int minimo = Integer.MAX_VALUE;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] < minimo){
                    minimo = matriz[i][j];
                }
            }
        }
        return minimo;
    }
    
    public static int calcularMaximoEnteroMatriz(int[][] matriz){
        int maximo = Integer.MIN_VALUE;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] > maximo){
                    maximo = matriz[i][j];
                }
            }
        }
        return maximo;
    }
    
    // Creamos objeto Coordenada con atributos fila, columna, valor
}
