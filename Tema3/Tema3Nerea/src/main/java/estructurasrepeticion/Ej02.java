/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasrepeticion;

import java.util.Scanner;

/**
 *
 * @author nerea
 */
public class Ej02 {

    public static void main(String[] args) {
        // Antes de ejecutarlo, creo que va a imprimir desde el 1 hasta 
        // el numero ingresado separados entre guiones y terminando en -
        // EJECUCIÓN: del 1 al valor final ingresado entre guiones y terminado en -
        Scanner teclado = new Scanner(System.in);
        
        int n, x;
        
        System.out.print("Ingrese el valor final:");
        n = teclado.nextInt();
        x = 1;
        
        while (x <= n) {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;
        }

    }
}
