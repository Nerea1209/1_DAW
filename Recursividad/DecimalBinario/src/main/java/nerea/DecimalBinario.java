/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package nerea;

/**
 *
 * @author nerea
 */
public class DecimalBinario {

    public static void main(String[] args) {
        System.out.println(decimalABinario(11));
        
    }
    
    public static String decimalABinario(double decimal){
        String binario = "";
        for (double i = decimal;i/2 == 1 || i/2 == 0; i++) {
            binario += String.valueOf(decimal%2);
        }
        return binario;
    }
}
