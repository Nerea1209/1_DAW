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
public class Algoritmo4 {
    
    public static void main(String[] args) {
        
        /*Uber establece un precio mínimo por servicio de 1,25€ fijos 
        y además 8 céntimos por Km recorrido. Elabora un programa que 
        lea el número de km a recorrer y proporcione el presupuesto.*/
        
        // CONSTANTES
        final double PRECIO_MINIMO = 1.25; // En euros
        final double CENTIMOS_KM = 0.08; // En euros
        
        //VARIABLES
        double presupuesto;
        double kilometros;
        
        // Pido km recorridos con JOption y lo paso a double, 
        // puesto que el JOption recoge tipo String
        String stringKilometros = JOptionPane.showInputDialog("¿Cuántos kilómetros"
                + " va a recorrer en Uber?");
        kilometros = Double.parseDouble(stringKilometros);
        
        // Calculo el presupuesto
        presupuesto = PRECIO_MINIMO + (kilometros * CENTIMOS_KM);
        
        // Muestro por pantalla el resultado
        JOptionPane.showMessageDialog(null, "Su presupuesto es: " 
                + presupuesto + " €");
    }
    
}
