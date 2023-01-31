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
public class Algoritmo10 {
    
    public static void main(String[] args) {
        
        /*Una empresa constructora se dedica a realizar bloques de pisos 
        en parcelas como las que figuran en la imagen de la derecha. 
        Necesitan saber el área de la parcela según las medidas A, B y C. 
        Realiza el ejercicio usando JOption para solicitar y mostrar 
        datos al usuario.*/
        
        // CONSTANTES
        final int DIVISOR = 2;
        
        // VARIABLES
        double medidaA; // En metros
        double medidaB;
        double medidaC;
        double area;
        
        // Pido la memida de A
        String a = JOptionPane.showInputDialog("Introduce la medida A en metros");
        medidaA = Integer.parseInt(a);
        
        // Pido la memida de B
        String b = JOptionPane.showInputDialog("Introduce la medida B en metros");
        medidaB = Integer.parseInt(b);
        
        // Pido la memida de C
        String c = JOptionPane.showInputDialog("Introduce la medida C en metros");
        medidaC = Integer.parseInt(c);
        
        // Es un trapecio girado, entonces el área es base por base por altura
        // entre 2
        area = ((medidaA + medidaC) / DIVISOR) * medidaB ;
        
        // Muestro el resultado por pantalla
        JOptionPane.showMessageDialog(null, "El área de la parcela"
                + " según las medidas " + medidaA + ", " + medidaB + " y "
                + medidaC + " es "+ area);
        
    }
    
}
