/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmossecuenciales;

import javax.swing.JOptionPane;

/**
 *
 * @author ubuntu
 */
public class Algoritmo7 {
    
    public static void main(String[] args) {
        
        // Realiza un conversor de euros a dólares.
        
        // CONSTANTES
        final double EURO_DOLAR = 0.99;
        
        // VARIABLES
        double cantidadEuros;
        double cantidadDolares;
        
        // Pido la cantidad de euros que quiere convertir en dolares
        String euros = JOptionPane.showInputDialog("¿Qué cantidad de euros "
                + "quieres pasar a dólares?");
        cantidadEuros = Double.parseDouble(euros);
        
        // 1 € = 0.99$ por lo tanto multiplicamos los euros por 0.99
        cantidadDolares = cantidadEuros * EURO_DOLAR;
        
        // Muestro el resultado por pantalla
        JOptionPane.showMessageDialog(null, cantidadEuros +
                " euros son " + cantidadDolares + " dólares.");
        
    }
    
}
