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
        System.out.println(decimalABinario(20));
        System.out.println(decimalABinarioRecursivo(20));
    }
    
    public static String decimalABinario(int decimal){
        String binario = "";
        while(decimal >= 1){
            binario = String.valueOf(decimal%2) + binario;
            decimal = decimal / 2;
        }
        return binario;
    }
    
    public static String decimalABinarioRecursivo(int decimal){
         String binario = "";
        if(decimal >= 1){
            binario = decimalABinarioRecursivo(decimal/2) + String.valueOf(decimal%2);
        }
        return binario;
    }
}
