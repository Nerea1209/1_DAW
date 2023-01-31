/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasrepeticion;

/**
 *
 * @author nerea
 */
public class Ej03 {
    
    public static void main(String[] args) {
        
        /*Realizar un programa que imprima 25 términos de la 
        serie 15 - 30 - 60 - 120, etc. No se introducen valores por teclado.*/
        int num = 15;        
        
        for(int i = 1; i <= 25; i++){
            System.out.print(num + " - ");
           num = (num * 2);
        }
        
    }
    
}
