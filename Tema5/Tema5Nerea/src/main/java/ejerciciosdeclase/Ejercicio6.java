/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosdeclase;

import java.util.Arrays;

/**
 *
 * @author nerea
 */
public class Ejercicio6 {
    
    /*
    Hacer un programa que determine si dos arrays son iguales. 
    Probarlo con los arrays [1,2,3] y [1,2,3], [1,2,3,4] y [1,2,3] , 
    [1,2,3] y [1,2,2]. Este ejercicio hay que hacerlo de dos formas: 
    la primera, usando la clase Arrays; la segunda, creando un método que vaya 
    comparando los valores de los arrays y devuelva true si todos son iguales o 
    false en caso contrario.
    */
    public static void main(String[] args) {
        int[] array1 = {1,2,3};
        int[] array2 = {1,2,3};
        int[] array3 = {1,2,3,4};
        int[] array4 = {1,2,3};
        int[] array5 = {1,2,3};
        int[] array6 = {1,2,2};
        
        System.out.println("¿Son iguales array2 y array5? " + Arrays.equals(array2, array5));
        
        System.out.println("¿Array 1 tiene el mismo tamaño que Array 3? " + comprobarTamaño(array1, array3));
        
        System.out.println("¿Son iguales los arrays 1 y 6? " + comprobarIgualdad(array1, array6));
    }
    
    public static boolean comprobarTamaño(int[] array1, int[] array2){
        boolean resultado=false;
        if (array1.length == array2.length){
            resultado = true;
        }
        return resultado;
    }
    
    public static boolean comprobarIgualdad(int[] array1, int[] array2){
        boolean resultado=false;
        if (comprobarTamaño(array1, array2)){
            for (int i = 0; i < array1.length; i++) {
                if(array1[i]==array2[i]){
                    resultado=true;
                } else{
                    resultado = false;
                    break;
                }
            }
        }
        return resultado;
    }
    
    
}
