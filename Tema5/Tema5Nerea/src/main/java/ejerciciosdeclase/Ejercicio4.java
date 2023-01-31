/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosdeclase;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Nerea
 */
public class Ejercicio4 {
    
    /*
    Escribe un programa que, dado un array de enteros de cualquier tamaño, 
    busque si un número obtenido por teclado se encuentra en el array e 
    imprima la primera posición en la que se encuentra el número. 
    Realiza la búsqueda de un elemento:
    - implementando el método de búsqueda secuencial. 
    - usando el método de búsqueda binaria de la clase Arrays.
    */
    
    private static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        int [] arrayEnteros = {1, 6, 8, 3, 9};
        System.out.println(Arrays.toString(arrayEnteros));
        int numeroABuscar = numeroABuscar();
        
        System.out.println("Búsqueda secuencial");
        int pos = busquedaSecuencial(arrayEnteros, numeroABuscar);
        System.out.println("El número " + numeroABuscar + " se encuentra en la "
                + "posición " + pos);
        
        System.out.println("Búsqueda binaria");
        int posicion = Arrays.binarySearch(arrayEnteros, numeroABuscar);
        System.out.println("El número " + numeroABuscar + " se encuentra en la "
                + "posición " + posicion);
    }
    
    public static int numeroABuscar(){
        int numero = 0;
        System.out.println("¿Qué número quieres buscar en el array?");
        try {
            numero = teclado.nextInt();
        } catch (InputMismatchException ime){
            System.out.println("""
                               ERROR. No has introducido un n\u00famero entero.
                               Vuelve a intentarlo""");
            teclado.nextLine();
        }
        return numero;
    }
    
    
    
    
    public static int busquedaSecuencial(int [] array, int numeroBuscar) {
        int indice = -1;
        // Recorremos el array completo
        for (int i = 0; i < array.length; i++) {
            if (numeroBuscar == array[i]){ // Lo he encontrado
                indice = i; // Guarda la posición para devolverla
                break; // Para que devuelva la primera que encuentre, no la última
            }
        }
        return indice;
    }
    
}
