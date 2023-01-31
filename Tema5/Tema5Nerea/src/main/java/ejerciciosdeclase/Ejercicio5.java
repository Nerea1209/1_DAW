/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosdeclase;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author nerea
 */
public class Ejercicio5 {
    
    /*
    Implementa un programa que guarde en un array 10 números enteros que se 
    leen por teclado. A continuación se recorre el array y calcula el número 
    total de positivos, de negativos y de ceros. Calcula y muestra la media 
    aritmética de los valores positivos y la de los valores negativos del array. 
    Implementar métodos para:
    */
    
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        
        // VARIABLES
        int[] enteros = new int[10];
        int cantidadPositivos = 0;
        int cantidadNegativos = 0;
        int cantidadCeros = 0;
        
        // PROCESO
        añadirDatosArray(enteros);
        mostrarArray(enteros);
        System.out.println("\n__________________________________________");
        // Positivos
        cantidadPositivos = positivos(enteros);
        System.out.println("Positivos: " + cantidadPositivos);
 
        // Negativos
        cantidadNegativos = negativos(enteros);
        System.out.println("Negativos: " + cantidadNegativos);
        // Ceroseros

        cantidadCeros = ceros(enteros);
        System.out.println("Ceros: " + cantidadCeros);

        System.out.println("__________________MEDIA__________________");
        System.out.println("La media de positivos es " + mediaPositivos(enteros));
        System.out.println("La media de negativos es " + mediaNegativos(enteros));

    }
    
    // MÉTODOS
    public static int leerEnteroSinErrores() {
        int num = 0;

        do {

            System.out.println("Introduce un número entero");
            try {

                num = teclado.nextInt();
                break;

            } catch (InputMismatchException ime) {
                System.out.println("ERROR. No has introducido un número entero");
                //limpio buffer
                teclado.nextLine();
            }

        } while (true);

        return num;
    }

    // Añado los datos al array
    public static void añadirDatosArray(int[] enteros) {
        for (int i = 0; i < 10; i++) {
            enteros[i] = leerEnteroSinErrores();
        }

    }
    //Positivos

    public static int positivos(int[] enteros) {
        int contador = 0;
        for (int i = 0; i < 10; i++) {
            if (enteros[i] > 0) {
                contador++;
            }
        }

        return contador;

    }

    //Negativos
    public static int negativos(int[] enteros) {
        int contador = 0;
        for (int i = 0; i < 10; i++) {
            if (enteros[i] < 0) {
                contador++;
            }
        }

        return contador;

    }
    // Ceros

    public static int ceros(int[] enteros) {
        int contador = 0;
        for (int i = 0; i < 10; i++) {
            if (enteros[i] == 0) {
                contador++;
            }
        }

        return contador;

    }

    // Imprimimos el array
    public static void mostrarArray(int[] enteros) {
        for (int aux: enteros) {
            System.out.print(" , " + aux);
        }
    }
    
    // Media de los positivos
    public static int mediaPositivos(int[] enteros) {
        int suma = 0;
        int media = 0;

        for (int i = 0; i < 10; i++) {
            if (enteros[i] > 0) {
                suma += enteros[i];

            }

        }
        try {
            media = suma / positivos(enteros);
        } catch (ArithmeticException eme) {
            System.out.println("ERROR. No se puede dividir entre cero");

        }

        return media;
    }
    
    // Media de los negativos
    public static int mediaNegativos(int[] enteros) {
        int suma = 0;
        int media = 0;

        for (int i = 0; i < 10; i++) {
            if (enteros[i] < 0) {
                suma += enteros[i];

            }

        }
        try {
            media = suma / negativos(enteros);
        } catch (ArithmeticException eme) {
            System.out.println("ERROR. No se puede dividir entre cero");

        }

        return media;
    }
    
}
