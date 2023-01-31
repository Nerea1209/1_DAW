/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author nerea
 */
public class EjemploWhile {

    public static void main(String[] args) {

        // Inicialización de la variable de control
        int numero = 0;

        // Condición del bucle
        // Mientras la condición del bucle sea true se repite el código entre {}
        // Imprimir del 0 al 10
        while (numero <= 10) {
            System.out.println(numero);
            // SIEMPRE DENTRO DEL BUCLE, hay que actualizar la parte de control
            numero++;

        }
        System.out.println("El bucle ha terminado");
        System.out.println("---------------------");

        // Del 20 al 0
        // inicializacion
        numero = 20;
        while (numero >= 0) {
            System.out.println(numero);
            numero--;
        }
        System.out.println("El bucle ha terminado"); // Actualización

        // Del 50 al 70 de 3 en 3
        // Inicialización
        numero = 50;
        while (numero <= 70) {
            System.out.println(numero);
            numero += 3;
        }
        System.out.println("---------------------------");
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número (100 - 200): ");
        int num = teclado.nextInt(); // Inicialización de variable de control
        while(num<100 || num>200){
            System.out.println("Te has equivocado, por favor, introduce de nuevo: ");
            num = teclado.nextInt();
        }

    }

}
