/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosdeclase;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nerea
 */
public class Ejercicio7 {
    
    /*
    Escribir un programa que lea del teclado el tamaño de dos arrays de enteros 
    (el mismo tamaño para los dos arrays). El programa inicializará los arrays 
    con números aleatorios entre 1 y 100. Existirá un método llamado multiplicar 
    que recibirá los dos arrays e irá multiplicando los elementos dos a dos, 
    empezando por los elementos que ocupan la posición cero, luego la uno, etc, 
    guardando el resultado en otro array, que será devuelto por el método. 
    Además existirá un método para imprimir por pantalla los valores de los arrays.
    */
    
    private static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        int tamaño=leerTamaño();
        int[] array1 = new int[tamaño];
        int[] array2 = new int[tamaño];
        inicializarArray(array1);
        inicializarArray(array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        int[] arrayMultiplicado = multiplicarArrays(array1, array2);
        System.out.println(Arrays.toString(arrayMultiplicado));
        
    }
    
    
    public static int leerTamaño(){
        System.out.println("¿Qué tamaño tiene el array? ");
        return teclado.nextInt();
    }
    
    public static void inicializarArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            int numAleatorio = generarAleatorioRango(1, 100);
            array[i]=numAleatorio;
        }
    }
    
    public static int generarAleatorioRango (int minimo, int maximo){
       Random generador = new Random();
       return generador.nextInt(minimo, maximo++);
        
    }
    
    public static int[] multiplicarArrays(int[] array1, int[] array2){
        int[] multiplicacionArray = new int [array1.length];
        for (int i = 0; i < array1.length; i++) {
            multiplicacionArray[i]=array1[i]*array2[i];
        }
        return multiplicacionArray;
    }
}
