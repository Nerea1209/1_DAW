/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author nerea
 */
public class InversorPalabras {

    public static void main(String[] args) {

        /*Leo una palabra por teclado hasta que ponga "salir"
        Lee una palabra y si el usuario pone tomate 
        tiene que crear una palabra nueva con la palabra al reves
        en este caso, etamot*/
        Scanner teclado = new Scanner(System.in);
        String palabra;

        do {

            System.out.println("Introduce una palabra: ");
            String palabraInvertida = "";
            palabra = teclado.nextLine();
            palabra = palabra.toLowerCase();

            switch (palabra) {

                case "salir" ->
                    System.out.println("Ha terminado el programa");

                default -> {
                    for (int i = (palabra.length() - 1); i >= 0; i--) {

                        palabraInvertida = palabraInvertida + palabra.charAt(i);
                    }
                    System.out.println("La palabra invertida es " + palabraInvertida);
                }

            }

        } while (!palabra.equals("salir"));

    }
}
