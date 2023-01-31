package ejercicios;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nerea
 */
public class ejClase27102022 {

    /*Realiza un programa que imprima por consola los 35 primeros términos 
    de la siguiente serie:
    F0 = 0;
    F1 = 1;
    Fn = f (n-1) + f (n-2)
    siempre es la suma de los dos anteriores
    F2 = f (2-1) + f (2-2) = f1 + f0 = 1 + 0 = 1*/
    public static void main(String[] args) {
        int primero = 0;
        int segundo = 1;
        
        System.out.println(primero);
        System.out.println(segundo);
        for (int i = 2; i <= 35; i++) {
            int siguiente = primero + segundo;
            System.out.println(siguiente);
            primero++;
            segundo++;
        }

    }

}
