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
public class Algoritmo9 {
    
    public static void main(String[] args) {
        
        /*Programa que pida el precio de un artículo y 
        calcule su valor aplicándole un 21% de IVA.*/
        
        // CONSTANTES
        final double PORCENTAJE_IVA = 0.21; // 21/100, 21%
        
        //VARIABLES
        double precioSinIva;
        double precioConIva;
        
        // Pido el precio del producto
        String precio = JOptionPane.showInputDialog("Introduzca el "
                + "precio del producto");
        precioSinIva = Double.parseDouble(precio);
        
        // El precio con iva es el precio más el 21% del precio
        precioConIva = precioSinIva + (precioSinIva * PORCENTAJE_IVA);
        
        // Muestro el resultado por pantalla
        JOptionPane.showMessageDialog(null, "El precio del artículo"
                + " es " + precioSinIva + " €\n Aplicándole un 21% de IVA sería " +
                precioConIva + " €");
        
    }
    
}
