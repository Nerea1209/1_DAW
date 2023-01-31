/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurassecuenciales;

import javax.swing.JOptionPane;

/**
 *
 * @author ubuntu
 */
public class Ej02 {
    
    public static void main(String[] args) {
        
        /*Utilizando el operador ternario ?: de Java, implementa las 
        siguientes sentencias:
        Si el número “x” es mayor o igual que 135 se devolverá “mayor”, 
        si es menor se devolverá “menor”. Las cadenas que se devuelven se 
        guardarán en una variable llamada resultado.
        Si el número “x” es menor o igual que cero se imprimirá en pantalla 
        “Menor que cero”, si no se imprimirá “Mayor que cero”.
        Guardar el valor absoluto de un número entero en una variable entera 
        (sin usar la función Math.abs())*/
        
        double numero = Double.parseDouble(
                JOptionPane.showInputDialog("Introduce un número"));
        
        String resultado = (numero>=135)?
                "Mayor": // Valor si es true
                "Menor"; // Valor si es false
        System.out.println(resultado);
        
        String resultado1 = (numero<=0)?
                "Menor que cero": // Valor si es true
                "Mayor que cero"; // Valor si es false
        System.out.println(resultado1);

        int numeroEntero = Integer.parseInt(JOptionPane.showInputDialog("Introduce otro número"));
        String valorAbsoluto = (numeroEntero<=0)?
                "El valor absoluto es "+ ((-1)* numeroEntero):
                "El valor absoluto es " + numeroEntero;
        System.out.println(valorAbsoluto);
        // int valorAbsoluto = (resultado1)?
                
        
    }
}
    
                
