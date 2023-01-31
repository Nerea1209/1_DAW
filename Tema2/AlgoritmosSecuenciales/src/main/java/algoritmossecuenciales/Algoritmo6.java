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
public class Algoritmo6 {
    
    public static void main(String[] args) {
        
        /* Tres personas deciden invertir su dinero para formar una empresa. 
        Cada una de ellas invierte una cantidad distinta, que debes solicitar 
        al usuario por teclado. Implementa un algoritmo que imprima el 
        porcentaje que invierte cada uno con respecto al total de la inversión.*/
        
        // VARIABLES
        double dineroInvertido1;
        double dineroInvertido2;
        double dineroInvertido3;
        double inversionTotal;
        int porcentajeInversion1;
        int porcentajeInversion2;
        int porcentajeInversion3;
        
        
        // Pido dinero invertido por cada uno de los miembros
        String dinero1 = JOptionPane.showInputDialog("¿Cuánto dinero "
                + "invierte el primer miembro de la empresa?");
        dineroInvertido1 = Double.parseDouble(dinero1);
        
        String dinero2 = JOptionPane.showInputDialog("¿Cuánto dinero "
                + "invierte el segundo miembro de la empresa?");
        dineroInvertido2 = Double.parseDouble(dinero2);
        
        String dinero3 = JOptionPane.showInputDialog("¿Cuánto dinero "
                + "invierte el tercer miembro de la empresa?");
        dineroInvertido3 = Double.parseDouble(dinero3);
        
        // La inversión total sería la suma de las 3
        inversionTotal = dineroInvertido1 + dineroInvertido2 + dineroInvertido3;
        
        // El porcentaje se consigue con una regla de 3
        // Si el 100% es la inversión total, la inversión del primer miembro
        // será ... Por lo tanto se multiplica la inversión individual * 100
        // y se divide entre la inversión total
        porcentajeInversion1 = ((int)dineroInvertido1 * 100) / (int)inversionTotal;
        porcentajeInversion2 = ((int)dineroInvertido2 * 100) / (int)inversionTotal;
        porcentajeInversion3 = ((int)dineroInvertido3 * 100) / (int)inversionTotal;
        
        // Muestro el resultado por pantalla
        JOptionPane.showMessageDialog(null, 
                "El primer miembro invierte " + dineroInvertido1 +
                " €, que es el " + porcentajeInversion1 + " %\n "
                 + "El segundo miembro invierte " + dineroInvertido2 + 
                " €, que es el " + porcentajeInversion2 + " %\n "
                 + "El tercer miembro invierte " + dineroInvertido3 + 
                " €, que es el " + porcentajeInversion3 + " %\n "
                 + "Por lo tanto, la inversión total es " + inversionTotal +
                " € para formar una empresa.");
        
    }
    
}
