/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Random;

/**
 *
 * @author nerea
 */
public class UtilesLaberinto {
    
    // Métodos de clase == static
    
    // Método que recibe por parámetro un entero positivo
    // y genera un array bidimensional de caracteres
    public static char[][] generadorLaberinto(int numero){
        // Por si le llega un número negativo, lo pasamos positivo
        numero = Math.abs(numero);
        // Este número tiene que estar entre 3 y 10
        if (numero >= 3 && numero <= 10) {
           char[][] matriz = new char[numero][numero];
           // Vamos a rellenar la matriz con letras aleatorias entre c y b
           // Para ello, he creado un array con 'c' y 'b'
           char[] aleatorio = {'c', 'b'};
            for (char[] elemento : matriz) {
                for (int i = 0; i < elemento.length; i++) {
                    // Cada elemento de la array, será una posición aleatoria del array de letras
                    elemento[i] = aleatorio[new Random().nextInt(0, 2)];
                }
            }
            return matriz;
        } else {
            // Si n no está entre 3 y 10 lanzamos exception
            throw new IllegalArgumentException();
        }
    }
    
    
    // Método que recibe por parámetro la matriz del método anterior
    // y devuelve una matriz de objetos tipo Casilla
    public static Casilla[][] generadorLaberintoCasillas(char[][] matrizChar){
        // La matriz a devolver tiene las mismas dimensiones que la pasada por parámetro
        Casilla[][] matrizCasilla = new Casilla[matrizChar.length][matrizChar.length];
        
        // Recorremos la matriz pasada, aunque al ser del mismo tamaño, daba igual cual recorremos
        for (int i = 0; i < matrizChar.length; i++) {
            for (int j = 0; j < matrizCasilla[i].length; j++) {
                if (matrizChar[i][j] == 'b') {
                    // Si el elemento de la matriz pasada es 'b'
                    // Añadimos en la matriz a devolver una Casilla con tipo Bosque
                    matrizCasilla[i][j] = new Casilla(i, j, TipoCasilla.BOSQUE);
                } else { // Solo puede ser 'b' o 'c' 
                    // Si el elemento de la matriz pasada es 'c'
                    // Añadimos en la matriz a devolver una Casilla con tipo Camino
                    matrizCasilla[i][j] = new Casilla(i, j, TipoCasilla.CAMINO);
                }                
            }
        }
        return matrizCasilla;
    }
    
}























