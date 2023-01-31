/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variables;

/**
 *
 * @author nerea
 */
public class Ej02 {
    public static void main(String[] args) {
        // Declara e inicializa tres variables int en la misma instrucción
        // a=1, b=2, c=3
        int a = 1, b = 2, c = 3;
        // Declara e inicializa tres variables double en la misma instrucción
        // d=4.5, e=5.7, f=6.9
        double d = 4.5, e = 5.7, f = 6.9;
        // Muestra las variables en dos líneas
        // La primera mostrará las variables tipo entero
        // La segunda mostrará las variables tipo double.
        System.out.println("Las variables tipo entero son a = " + a 
                + ", b = " + b + ", c = " + c + ".");
        System.out.println("Las variables tipo double son d = " 
                + d + ", e = " + e + ", f = " + f + ".");
        // Realiza los siguientes intercambios de valores:
        // en b guarda c
        b = c;
        // en c guarda a
        c = a;
        // en a guarda b
        a = b;
        
        System.out.println("El intercambio de variables quedaría así: "
                + "b = " + b + ", c = " + c + ", a = " + a + ".");
    }
    
}
