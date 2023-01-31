/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurassecuenciales;

import java.util.Scanner;

/**
 *
 * @author ubuntu
 */
public class Ej01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu edad:");

        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }

        System.out.print("mostrar la edad: ");
        System.out.println(edad);
    }

}

/*
    Si la edad es 15, muestra que no es mayor de edad y que la edad es 15
    Si la edad es 18, muestra que es mayor de edad y que la edad es 18
    Si la edad es 60, muestra que es mayor de edad y que la edad es 60
*/
