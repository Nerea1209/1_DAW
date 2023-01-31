/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmossecuenciales;

import javax.swing.JOptionPane;

/**
 *
 * @author nerea
 */
public class Algoritmo3 {
    
    public static void main(String[] args) {
        /*Algoritmo que lea tres notas numéricas de 
        tipo float y calcule la nota media.*/
        
        // CONSTANTES 
        final int DIVISOR = 3;
        
        // VARIABLES
        double nota1;
        double nota2;
        double nota3;
        double sumaNotas;
        double notaMedia;
        
        // Pido nota1
        String nota1String = JOptionPane.showInputDialog("Introduce tu primera nota: ");
        JOptionPane.showMessageDialog(null, "Tu primera nota es " + nota1String);
        nota1 = Double.parseDouble(nota1String);
        
        // Pido nota2
        String nota2String = JOptionPane.showInputDialog("Introduce tu segunda nota: ");
        JOptionPane.showMessageDialog(null, "Tu segunda nota es " + nota2String);
        nota2 = Double.parseDouble(nota2String);
        
        // Pido nota3
        String nota3String = JOptionPane.showInputDialog("Introduce tu tercera nota: ");
        JOptionPane.showMessageDialog(null, "Tu tercera nota es " + nota3String);
        nota3 = Double.parseDouble(nota3String);
        
        // Hago la media de las notas
        sumaNotas = nota1 + nota2 + nota3;
        notaMedia = sumaNotas / (double)DIVISOR;
        
        // Muestro el resultado por pantalla
        JOptionPane.showMessageDialog(null, "La nota media de " + nota1 + ", "
        + nota2 + " y " + nota3 + " es " + notaMedia);
    }
    
}
