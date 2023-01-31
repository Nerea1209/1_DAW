/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package propuestas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class DiagonalesClase {

    // Creamos Scanner para pedir al usuario por teclado
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int tamañoMatriz = pedirNumero();
        int[][] matriz = new int[tamañoMatriz][tamañoMatriz];
        crearMatrizAleatorios(matriz);
        imprimirMatriz(matriz);
        List<Integer> diagonalPrincipal = elementoDiagonalPrincipal(matriz);
        diagonalPrincipal.forEach(System.out::println);
        System.out.println(Arrays.toString(elementoDiagonalSecundaria(matriz)));
        
    }

    public static int pedirNumero() {
        int numero = 0;
        do {
            try {
                System.out.println("Introduce un número entre 2 y 10:");
                numero = teclado.nextInt();

            } catch (InputMismatchException ime) {
                System.out.println("No has introducido un número entero");
                teclado.nextLine(); // Limpiamos buffer
            }
        } while (numero < 2 || numero > 10);
        return numero;
    }

    // Rellena la matriz pasada con enteros entre 0 y 20
    public static void crearMatrizAleatorios(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                Random aleatorio = new Random();
                matriz[i][j] = aleatorio.nextInt(0, 21);
            }
        }
    }

    // Imprime cualquier matriz de enteros
    public static void imprimirMatriz(int[][] matriz) {
        for (int [] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + "  ");
            } //j
            System.out.println("");
        } //i
    }

    public static List<Integer> elementoDiagonalPrincipal(int[][] matriz) {
        List<Integer> lista = new ArrayList<>();
        for(int i = 0; i > matriz.length; i++){
            lista.add(matriz[i][i]);
        }
        return lista;
    }
    
    public static int[] elementoDiagonalSecundaria(int[][] matriz){
        int[] array = new int[matriz.length]; // Por ser cuadrada, la diagonal vale igual
        for(int i = 0; i < matriz.length; i++){
             array[i] = matriz[i][matriz.length - 1 - i];
        }
        return array;
    }
 

    public static void diagonalSecundaria(int[][] matriz) {
        int ejeX = 0;
        int ejeY = matriz.length - 1; // Porque es cuadrada, sino no se podría hacer así
        System.out.print("La diagonal secundaria es ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == ejeX && j == ejeY) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            ejeX++;
            ejeY--;
        }
    }
    
//    public static void diagonalSecundaria(int[][] matriz) {
//        System.out.print("La diagonal secundaria es ");
//        for (int i = 0; i < matriz.length; i++) {
//                    System.out.print(matriz[i][matriz.length-1-i] + " ");
//        }
//    }

}
