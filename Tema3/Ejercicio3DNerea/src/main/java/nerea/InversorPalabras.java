/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerea;

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
        

        if (palabra.equals("salir")){
            do {
            System.out.println("Introduce una palabra: ");
            String palabraInvertida = "";
            palabra = teclado.nextLine();
            palabra = palabra.toLowerCase();

            System.out.println("Has salido del programa");
            }while(true);
        }}}

        

   


