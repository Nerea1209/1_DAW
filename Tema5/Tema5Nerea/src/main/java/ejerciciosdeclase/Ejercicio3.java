/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosdeclase;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author nerea
 */
public class Ejercicio3 {
     public static void main(String[] args) {
        Random numAleatorio = new Random();
        int posicionAlatoria;
        double[] array1 = new double[20];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = 7.5;
        }
        System.out.println("Imprimo array1: ");
        for (double d : array1) {
            System.out.print(" - " + d);
        }
        System.out.println(" ");
        // uso el metodo estatico de la clase Array donde le indico que array quiero copiar y cuantos posiciones de la misma
        double[] array2 = Arrays.copyOf(array1, 20);
        System.out.println("Imprimo array2: ");

        for (double d : array2) {
            System.out.print(" - " + d);
        }
        System.out.println("");
        System.out.println("Son iguales el arra1 y array2: " + Arrays.equals(array1, array2));
        System.out.println("");
        System.out.println("Genero numero aleatorio para usarlo como posicion para darle el  valor 6.3 en el array2."
                + " Vuelvo a imprimir los dos arrays ");

        // genero un numero Aleatorio dentro del rango para usarlo de posicion para  meter el valor
        posicionAlatoria = numAleatorio.nextInt(20 - 0 + 1) + 0;
        array2[posicionAlatoria] = 6.3;
        System.out.println("");
        System.out.println("Imprimo array1: ");
        for (double d : array1) {
            System.out.print(" - " + d);
        }
        System.out.println(" ");
        System.out.println("Imprimo array2: ");

        for (double d : array2) {
            System.out.print(" - " + d);
        }
        
        System.out.println("");
        System.out.println("Son iguales el arra1 y array2: " + Arrays.equals(array1, array2));
    }
}
