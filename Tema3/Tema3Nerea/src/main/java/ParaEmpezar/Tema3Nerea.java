/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ParaEmpezar;

import java.util.Scanner;

/**
 *
 * @author ubuntu
 */
public class Tema3Nerea {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuál es tu nombre?");
        String nombre = teclado.nextLine();
        
        System.out.println("Introduce la letra a buscar: ");
        String letraBuscar = teclado.nextLine();
        
        // Si la letra está contenida en el nombre
        // mostrar el número de caracteres que tiene el nombre y la posición
        // donde está la letra
        // En otro caso, mostar si el número de letras del nombre es par o impar
        
        boolean letraContenida = nombre.contains(letraBuscar);
        
        /*if (letraContenida == true){
        
        }*/
        
        /*if (nombre.contains(letraBuscar) == true){
        
        }*/
        
        
        //v.1
        if (nombre.contains(letraBuscar)){
            // Tamaño de la cadena de texto
            System.out.println("El nombre de caracteres es " + nombre.length());
            // Posición donde está la letra
            int posicion = nombre.indexOf(letraBuscar);
            System.out.println("La posición de " + letraBuscar + " es " + posicion);
        } else {
            if(nombre.length() % 2 == 0){
                System.out.println("El número de caracteres es par");
            } else {
                System.out.println("El número de caracteres es impar");
            }
        }
        
        System.out.println("Adiós");
        
        // v.2
        
        if (nombre.contains(letraBuscar)){
            // Tamaño de la cadena de texto
            System.out.println("El nombre de caracteres es " + nombre.length());
            // Posición donde está la letra
            int posicion = nombre.indexOf(letraBuscar);
            System.out.println("La posición de " + letraBuscar + " es " + posicion);
        } else if(nombre.length() % 2 == 0){
                System.out.println("El número de caracteres es par");
            } else {
                System.out.println("El número de caracteres es impar");
            }
        
    
        System.out.println("Adiós");
        
        if (nombre.contains(letraBuscar)){
            // Tamaño de la cadena de texto
            System.out.println("El nombre de caracteres es " + nombre.length());
            // Posición donde está la letra
            int posicion = nombre.indexOf(letraBuscar);
            System.out.println("La posición de " + letraBuscar + " es " + posicion);
        } // else if(nombre.length() % 2 == 0){
//                System.out.println("El número de caracteres es par");
//            } else {
//                System.out.println("El número de caracteres es impar");
//            }
        
        String textoResultado = (nombre.length() % 2 == 0)?
                "El número de caracteres es par": // Valor si es true
                "El número de caracteres es impar"; // Valor si es false
        System.out.println(textoResultado);
        
    }
}
