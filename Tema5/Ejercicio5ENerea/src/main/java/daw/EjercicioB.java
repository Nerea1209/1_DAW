/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Nerea
 */
public class EjercicioB {

    // Scanner para pedir por teclado al usuario
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        
        // Pedimos la altura de la copa del arbol
        int altura = pedirAltura();
        // Creamos matriz del tronco que siempre tiene 2 filas
        char[][] matrizTronco = matrizTronco(altura);
        // Creamos una matriz de espacios con filas = altura y 
        // columna = (altura * 2) - 1 ==> Patrón que se repite
        char[][] matrizArbolito = matrizArbolito(altura);
        // Rellenamos la matriz con  O para formar el arbol
        rellenarArbolito(matrizArbolito);
        // Imprimimos las matrices
        imprimirMatriz(matrizArbolito);
        imprimirMatriz(matrizTronco);
    }

    // MÉTODOS
    // Pedimos la altura haciendo que el usuario inserte un numero entero,
    // sino, la volveremos a pedir
    public static int alturaSinExcepcion() {
        int altura = 0;
        do {
            System.out.println("¿Qué altura tiene la copa del árbol? (entre 2 y 10)");
            try {
                altura = teclado.nextInt();
                break;
            } catch (InputMismatchException ime) {
                teclado.nextLine();
                System.out.println("""
                                   No has introducido un número entero entre 2 y 10.
                                   Por favor, inténtelo de nuevo.""");
            }
        } while (true);
        return altura;
    }

    // La altura que inserte el usuario tiene que ser entre 2 y 10
    public static boolean filtrarAltura(int altura) {
        return !(altura < 2 || altura > 10);
    }

    // Si la altura no está entre 2 y 10, volvemos a pedirla
    public static int pedirAltura() {
        int altura = 0;
        do {
            altura = alturaSinExcepcion();
        } while (!filtrarAltura(altura));
        return altura;
    }

    // Creamos la matriz del tronco dependiendo de la altura
    public static char[][] matrizTronco(int altura) {
        char[][] array = new char[2][(altura * 2) - 1];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == altura - 1) { // Si es la columna central, pondremos O
                    array[i][j] = 'O';
                } else { // Sino, hacrá un espacio
                    array[i][j] = ' ';
                }
            };
        }
        return array;
    }
    
    // Imprime cualquier matriz de caracteres
    public static void imprimirMatriz(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
                if (j == matriz[i].length - 1) { // Cuando imprima el último elemento de la fila
                    // Haz un salto de línea
                    System.out.println("");
                }
            } //j
        } //i
    }
    
    // Creamos la matriz del arbol dependiendo de la altura rellena de espacios
    public static char[][] matrizArbolito(int altura) {
        int columna = (altura * 2) - 1;
        char[][] array = new char[altura][columna];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ' ';
            }
        }
        return array;
    }

    // Pondremos O en los sitios correspondientes para formar el arbol
    public static void rellenarArbolito(char[][] matrizArbol) {
        int cont = 0;
        for (int i = matrizArbol.length - 1; i >= 0; i--) {
            for (int j = 0 + cont; j < matrizArbol[i].length - cont; j++) {
                matrizArbol[i][j] = 'O';
            }
            cont++;
        }
    }
    
    //    public static char[] rellenarArbol(int columna) {
//        char[] array = new char[columna];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = 'O';
//        }
//        return array;
//    }
//
//    public static char[][] matrizArbolito(int altura) {
//        int columna = (altura * 2) - 1;
//        int espacios = 0;
//        int j = 0;
//        char[][] array = new char[altura][columna];
//        for (int i = array.length - 1; i >= 0; i--) {
//                array[i] = rellenarArbol(columna);
//                columna -= 2;
//        }
//        return array;
//    }
}
