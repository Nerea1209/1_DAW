/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejerciciosdeclase;

/**
 *
 * @author Nerea
 */
public class Ejercicio1 {
    
    /*
    Escribe un programa que muestre cada elemento de un array de enteros y sume 
    todos sus elementos. Instancia e inicializa el array en el programa, 
    sin leer nada por teclado, con los siguientes valores {1, 2, 3, 4, 5, 6}.
    */
    
    public static void main(String[] args) {
        
        int[] enteros = {1,2,3,4,5,6};
        
        for(int aux:enteros){
            System.out.print(" - " + aux);
        }
        
    }
}
