/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmossecuenciales;

import java.util.Scanner;

/**
 *
 * @author nerea
 */
public class Algoritmo1 {
    
    public static void main(String[] args) {
    
        // Algoritmo que lea por teclado una cantidad de grados centígrados 
        // y los pase a grados Fahrenheit.
        
        // CONSTANTES
        final double GRADO_ESCALA_FAHRENHEIT = 32;
        final double GRADO_ESCALA_FAHRENHEIT1 = 1.8;
        
        // VARIABLES
        double gradosCentigrados;
        double gradosFahrenheit;
        
        // PROCESO
        
        Scanner teclado = new Scanner(System.in);
    
        System.out.println("Ingrese una cantidad de grados centígrados: ");
        
        gradosCentigrados = teclado.nextDouble();
        
        gradosFahrenheit = ((gradosCentigrados * GRADO_ESCALA_FAHRENHEIT1) + 
                GRADO_ESCALA_FAHRENHEIT);
        
        // RESULTADO
        System.out.println(gradosCentigrados + " grados centígrados son " +
                gradosFahrenheit + " grados fahrenheit.");

    }
}
