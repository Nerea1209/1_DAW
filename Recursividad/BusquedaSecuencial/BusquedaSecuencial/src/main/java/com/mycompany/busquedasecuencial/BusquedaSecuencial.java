/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.busquedasecuencial;

/**
 *
 * @author nerea
 */
public class BusquedaSecuencial {
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 100, 5, 9};
        System.out.println(busquedaSecuencial(array, 100, 0));
        System.out.println(busquedaSecuencialRecursiva(array, 100, 0));
        
    }

    public static int busquedaSecuencial(int[] arrayEnteros, int numeroABuscar, int posicion){
        int pos = -1;
        for (int i = 0; i < arrayEnteros.length; i++) {
            if (arrayEnteros[i] == numeroABuscar) {
                pos = i;
            }
        }
        return pos;
    }
    
    public static int busquedaSecuencialRecursiva(int[] arrayEnteros, int numeroABuscar, int posicion){
        int pos = -1;
        if (posicion >= 0 && posicion < arrayEnteros.length) {
            if (arrayEnteros[posicion] == numeroABuscar) {
                pos = posicion;
            } else {
                pos = busquedaSecuencialRecursiva(arrayEnteros, numeroABuscar, posicion + 1);
            }
        }
        return pos;
    }
    
}