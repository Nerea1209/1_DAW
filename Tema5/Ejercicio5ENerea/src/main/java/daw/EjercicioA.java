/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package daw;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author nerea
 */
public class EjercicioA {

    // Creamos Scanner para pedir al usuario por teclado
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        // Variables
        int opcionMenu = 0;
        int tamañoMatriz = 0;

        // Proceso
        do {
            opcionMenu = pedirOpcion(); // Pedimos la opción que quiere el usuario
            switch (opcionMenu) {
                case 1 -> { // Si la opción es 1
                    tamañoMatriz = pedirNumero(); // Pedimos el tamaño de la matriz
                    int[][] matrizUsuario = new int[tamañoMatriz][tamañoMatriz];
                    crearMatrizUsuario(matrizUsuario);
                    imprimirMatriz(matrizUsuario);
                    System.out.println("El elemento mayor de una fila y menor de una "
                            + "columna \n se encuentra en la coordenada: " +
                            mayorFilaMenorColumna(matrizUsuario).toString() + "\n");
                }
                case 2 -> { // Si la opcion es 2
                    tamañoMatriz = pedirNumero(); // Pedimos el tamaño de la matriz
                    int[][] matrizAleatorios = new int[tamañoMatriz][tamañoMatriz];
                    // La rellenamos con numeros aleatorios entre 0 y 20
                    crearMatrizAleatorios(matrizAleatorios); 
                    imprimirMatriz(matrizAleatorios);
                    System.out.println("El elemento mayor de una fila y menor de una "
                            + "columna \n se encuentra en la coordenada: " +
                            mayorFilaMenorColumna(matrizAleatorios).toString() + "\n");
                }
                case 3 -> { System.out.println("Saliendo..."); // Si es 3, salimos
                }
                // Y, sino, opcion no válida, volvemos a pedir
                default -> System.out.println("No has introducido una opción válida");
            }
            
            
        } while (opcionMenu != 3);
   }

    // Métodos
    // Pedimos la opcion, que se repite en el caso de que no sea un numero entero
    public static int pedirOpcion() {
        int opcion = 0;
        do {
            System.out.println("""
                               --------------------Mayor fila menor columna--------------------
                               Opción 1 - Elige el tamaño y el contenido del array de enteros.
                               Opción 2 - Elige el tamaño y el contenido del array serán enteros
                               aleatorios entre 0 y 20.
                               Opción 3 - Salir del programa.""");
            try {
                opcion = teclado.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("No has introducido un número entero");
                teclado.nextLine(); // Limpiamos buffer
            }
        } while (true);
        return opcion;
    }

    // Pedimos el tamaño de la matriz, que se repite en el caso de que el usuario
    // no inserte un numero entero entre 3 y 6
    public static int pedirNumero() {
        int numero = 0;
        do {
            try {
                System.out.println("Introduce un número entre 3 y 6:");
                numero = teclado.nextInt();

            } catch (InputMismatchException ime) {
                System.out.println("No has introducido un número entero");
                teclado.nextLine(); // Limpiamos buffer
            }
        } while (numero < 3 || numero > 6);
        return numero;
    }

    // Rellena la matriz con los enteros pasados por el usuario
    // haciendo que se repita cada coordenada en caso de no insertar un entero
    public static void crearMatrizUsuario(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                do {
                    try {
                        System.out.println("Introduce un número entero para la posición (" + i + ", " + j + "):");
                        matriz[i][j] = teclado.nextInt();
                        break;
                    } catch (InputMismatchException ime) {
                        System.out.println("No has introducido un número entero");
                        teclado.nextLine(); // Limpiamos buffer
                    }
                } while (true);
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

    // Le pasamos una matriz y una fila y nos dice la coordenada del mayor
    public static Coordenada mayorDeFila(int[][] matriz, int fila){
        int maximo = Integer.MIN_VALUE;
        Coordenada coordenada = new Coordenada(-1, -1, -1);
        for (int i = 0; i < matriz[fila].length; i++) {
            if (matriz[fila][i] >= maximo){
                maximo = matriz[fila][i];
                coordenada = new Coordenada(fila, i, maximo);
            } 
        }
        return coordenada;
    }
    
    // Le pasamos una matriz y una coordenada del mayor de la fila y nos dice la
    // coordenada del menor de su columna
    public static Coordenada menorDeColumna(int[][] matriz, Coordenada coordenadaMayorFila){
        int minimo = Integer.MAX_VALUE;
        Coordenada coordenadaMenorColumna = new Coordenada(-1, -1, -1);
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][coordenadaMayorFila.columna()] <= minimo){
                minimo = matriz[i][coordenadaMayorFila.columna()];
                coordenadaMenorColumna = new Coordenada(i, coordenadaMayorFila.columna(), minimo);
            } 
        }
        return coordenadaMenorColumna;
    }
    
    // Nos devuelve true si la coordenada de mayor de fila y de menor de columna son iguales
    public static boolean esMayorFilaMenorColumna(Coordenada coordenadaMayorFila, Coordenada coordenadaMenorColumna){
        return coordenadaMayorFila.equals(coordenadaMenorColumna);
    }
    
    // Nos dice la coordenada del primer entero que sea mayor de su fila y a su vez menor de la columna
    public static Coordenada mayorFilaMenorColumna(int[][] matriz){
        Coordenada coordenada = new Coordenada(-1, -1, -1);
        for (int i = 0; i < matriz.length; i++) {
                Coordenada coordenadaMayorFila = mayorDeFila(matriz, i);
                Coordenada coordenadaMenorColumna = menorDeColumna(matriz, coordenadaMayorFila);
                if(esMayorFilaMenorColumna(coordenadaMayorFila, coordenadaMenorColumna)){
                    coordenada = coordenadaMayorFila;
                    break;
                } else {
                    coordenada = new Coordenada(-1, -1, -1);
                }
            
        }
        return coordenada;
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

}
