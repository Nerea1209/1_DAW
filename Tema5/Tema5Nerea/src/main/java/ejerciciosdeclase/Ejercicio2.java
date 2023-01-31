/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosdeclase;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Nerea
 */
public class Ejercicio2 {
    
    /*
    Escribe un programa para leer la altura de un número determinado de personas 
    y calcular la altura media. El número de personas se pide por teclado y debe
    ser entero un entero mayor que cero. Posteriormente el programa irá pidiendo
    la altura, en cm, de cada una de las personas y las guardará en una 
    estructura de almacenamiento. Si la altura leída no es positiva, 
    el programa la pasará a número positivo. También es necesario saber cuántas 
    personas tienen una altura superior a la media e inferior a la media.
    */
    
    private static  Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        
       int numPersonas = leerPersonas();
       int[] alturasPersonas = new int [numPersonas];
       for (int i = 0; i < numPersonas; i++){
           int idPersona = i+1;
           System.out.println("Persona " + idPersona + ": ");
           int altura = leerAltura();
           alturasPersonas[i] = Math.abs(altura);
       }
       
       
       
        
        
        
        
    }
    
    private static int leerPersonas(){
        int numPersonas = 1;
        do{
            System.out.println("¿De cuántas personas quiere calcular la altura media?");
            if (numPersonas > 0){  
                try {
                    numPersonas = teclado.nextInt();
                    break;
                } catch (InputMismatchException ime){
                    System.out.println("ERROR. Inténtelo de nuevo.");
                }
            } else{
                System.out.println("ERROR. Tiene que ser mayor que 0");
            }
        }while(true);
        
        return numPersonas;
    }
    
    private static int leerAltura(){
        int altura = 0;
        do{
            System.out.println("¿Cuánto mide?");
            try {
                altura = teclado.nextInt();
                break;
            } catch (InputMismatchException ime){
                System.out.println("ERROR. Inténtelo de nuevo.");
            }
        }while(true);
        
        return altura;
    }
}
