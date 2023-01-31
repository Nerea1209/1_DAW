/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package propuestas;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nerea
 */
public class Vecinas {
    
    // Creamos Scanner para pedir al usuario por teclado
    private static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        int tamañoMatriz = pedirNumero();
        int[][] matriz = new int[tamañoMatriz][tamañoMatriz];
        crearMatrizAleatorios(matriz);
        imprimirMatriz(matriz);
        Coordenada coordenada = pedirCoordenada(tamañoMatriz);
        buscarVecinas(matriz, coordenada);
        // List<Coordenada> listaCoordenadas = buscarVecinas(matriz, coordenada);
        /*
        for (Coordenada coordenada : listaCoordenadas){
            System.out.println()coordenada;
        }
        */
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
    public static void crearMatrizAleatorios(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                Random aleatorio = new Random();
                matriz[i][j] = aleatorio.nextInt(0, 21);
            }
        }
    }
    
    // Imprime cualquier matriz de enteros
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "  ");
                if (j == matriz[i].length - 1) { // Cuando imprima el último elemento de la fila
                    // Haz un salto de línea
                    System.out.println("");
                }
            } //j
        } //i
    }
    
    public static Coordenada pedirCoordenada(int numero){
        int fila = 0;
        int columna = 0;
        System.out.println("""
                           ------------ COORDENADAS VECINAS ------------
                           Este programa busca las coordenadas vecinas
                           de la coordenada insertada.
                           """);
        do {  
            System.out.println("¿Qué fila tiene la coordenada a la que que quiere buscar sus vecinas?");
            try {
                fila = teclado.nextInt();
            } catch (InputMismatchException ime) {
                teclado.nextLine();
                System.out.println("No has introducido un número entero");
            }
        } while (fila <= 0 || fila > numero);
        
        do {  
            System.out.println("¿Qué columna tiene esa misma coordenada?");
            try {
                columna = teclado.nextInt();
            } catch (InputMismatchException ime) {
                teclado.nextLine();
                System.out.println("No has introducido un número entero");
            }
        } while (columna <= 0 || columna > numero);
        
        return new Coordenada(--fila, --columna);
    }
    
    public static void buscarVecinas(int[][] matriz, Coordenada coordenada){
        System.out.print("Las coordenadas vecinas son: ");
        for (int i = coordenada.fila()-1; i <= coordenada.fila()+1; i++) {
            for (int j = coordenada.columna()-1; j <= coordenada.columna()+1; j++) {
                Coordenada aux = new Coordenada(i, j);
                if (i >= 0 && i < matriz.length && j >= 0 && j < matriz[i].length && !aux.equals(coordenada)){
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
    }
    
//    public static List<Integer> buscarVecinas(int[][] matriz, Coordenada coordenada){
//        List<Integer> lista = new ArrayList<>();
//        System.out.print("Las coordenadas vecinas son: ");
//        for (int i = coordenada.fila()-1; i <= coordenada.fila()+1; i++) {
//            for (int j = coordenada.columna()-1; j <= coordenada.columna()+1; j++) {
//                Coordenada aux = new Coordenada(i, j);
//                if (i >= 0 && i < matriz.length && j >= 0 && j < matriz[i].length && !aux.equals(coordenada)){
//                    System.out.print(matriz[i][j] + " ");
//                      lista.add(new Coordenada(i, j));
//                }
//            }
//        }
//    return lista;
//    }
    
}
