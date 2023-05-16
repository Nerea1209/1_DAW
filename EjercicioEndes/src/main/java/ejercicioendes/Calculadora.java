/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicioendes;

/**
 *
 * @author Nerea
 */
public class Calculadora {

//    public static void main(String[] args) {
//        sumar(0, 0);
//        restar(2, 3);
//        dividir(10, 5);
//        multiplicar(20, 0.1);
//    }
    
    public static String sumar (double a, double b) {
        return String.format("%.2f", a + b);
    }
    
    public static String restar (double a, double b) {
        return String.format("%.2f", a - b);
    }
    
    public static String dividir (double a, double b) {
        return String.format("%.2f", a / b);
    }
    
    public static String multiplicar (double a, double b) {
        return String.format("%.2f", a * b);
    }
}
