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
public class Algoritmo11 {
    
    public static void main(String[] args) {
        
        /*Se requiere obtener el área de la figura, a partir de R y H. 
        Realiza un algoritmo para resolver el problema. */
        
        // VARIABLES
        double radio;
        double medidaH;
        double area1;
        double alturaAlCuadrado;
        double altura;
        double area2;
        double areaTotal;
        
        // Pido la medida R
        String r = JOptionPane.showInputDialog("Introduce en metros el radio R");
        radio = Double.parseDouble(r);
        
        // Pido la medida H
        String h = JOptionPane.showInputDialog("Introduce en metros la medida H");
        medidaH = Double.parseDouble(h);
        
        // Al ser una figura compleja nos basamos en el principio de 
        // "Divide y vencerás"
        
        // El primer área es una semicircunferencia, con lo cual, su área
        // es (PI x radio²)/2 
        area1 = Math.PI * Math.pow(radio,2)/2; // SEMICIRCUNFERENCIA
        
        // El segundo área es un triángulo, hay que hallar la altura con 
        // el teorema de Pitágoras
        alturaAlCuadrado = Math.pow(medidaH, 2) - Math.pow(radio,2);
        altura = Math.sqrt(alturaAlCuadrado); // ALTURA
        
        // Area del triángulo: (2 * radio * altura) / 2
        // Como divido y multiplico por 2, lo borro
        area2 = radio * altura;
        
        // Sumamos las áreas
        areaTotal = area1 + area2;
        
        // Mostramos resultado por pantalla
        JOptionPane.showMessageDialog(null, 
            """
            Si R mide %.2f metros y H mide %.2f metros,
            el área de la figura es %.2f
            """.formatted(radio, medidaH, areaTotal));
        
    }
    
}
