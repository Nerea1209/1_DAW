/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import java.util.Arrays;

/**
 *
 * @author nerea
 */
public class BusquedaSecuencialArray {
    
    public static void main(String[] args) {
        int numeros[] = {6, 5, 3, 1, 2};
        System.out.println(Arrays.toString(numeros));
        int pos = busquedaSecuencial(numeros, 10);
        System.out.println("El número 10 se encuentra en la posición: " + pos);
        pos = busquedaSecuencial(numeros, 5);
        System.out.println("El número 10 se encuentra en la posición: " + pos);
        if (pos >= 0){
            System.out.println("El elemento de la posición " + pos + " es " + numeros[pos]);
        }
        
    }
    
    // Devuelve el primer numero que encuentra
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
