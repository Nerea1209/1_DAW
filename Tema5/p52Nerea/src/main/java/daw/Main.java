/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author nerea
 */
public class Main {
    
    public static void main(String[] args) {
        
        // Variables
        char[][] matrizChar;
        Casilla[][] matrizCasilla;
        
        try {
            // Si este método nos lanza una exception
            // por pasarle un número que no esté entre 3 y 10
            matrizChar = UtilesLaberinto.generadorLaberinto(6);
            
        } catch (IllegalArgumentException iae) {
            // Le pasamos el número 3
            matrizChar = UtilesLaberinto.generadorLaberinto(3);
        }
        
        // Imprimimos la matriz
        imprimirMatriz(matrizChar);
        System.out.println("");
        
        // Y generamos el laberinto de casillas sin ningún problema e imprimimos
        matrizCasilla = UtilesLaberinto.generadorLaberintoCasillas(matrizChar);
        imprimirMatriz(matrizCasilla);
        
//        Para comprobar que coinciden las coordenadas con la posición
//        System.out.println("");
//        imprimirMatrizCoordenada(matrizCasilla);
    }
    
    // Métodos de clase sobrecargados para imprimir los dos tipos de matrices
    public static void imprimirMatriz(char[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
    public static void imprimirMatriz(Casilla[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
    public static void imprimirMatrizCoordenada(Casilla[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j].comprobarCoordenadasCasilla() );
            }
        }
    }
    
}
