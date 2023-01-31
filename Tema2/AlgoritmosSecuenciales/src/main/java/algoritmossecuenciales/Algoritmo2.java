/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmossecuenciales;

import java.util.Scanner;

/**
 *
 * @author ubuntu
 */
public class Algoritmo2 {
    
    public static void main(String[] args) {
        
        /*
        Algoritmo que lea por teclado el valor del radio de una circunferencia 
        y calcule la longitud, el área de la circunferencia y el volumen de 
        una esfera con ese radio.
        */
        
        // Declaramos e inicializamos las variables
        double radio;
        double longitud;
        double radioCuadrado;
        double area;
        double radioCubo;
        double multiplicacion;
        double volumen;
        
        // Solicitamos un radio en cm al usuario para calcular la longitud
        // y el área de la circunferencia y, el volumen de la esfera con
        // ese radio.
        System.out.println("Ingrese un radio de una circunferencia en "
                + "cm para calcular \n su longitud, su área y el"
                + " volumen de la esfera producida: ");
        
        // Creamos el objeto Scanner para la petición del radio
        Scanner entradaTeclado = new Scanner(System.in);
        radio = entradaTeclado.nextDouble();
        
        // Inicializamos longitud y lo mostramos por pantalla
        longitud = (2 * Math.PI) * radio;
        System.out.printf("Longitud: %.2f \n", radio, longitud);
        
        // Inicializamos radioCuadrado para usarlo en la fórmula del área
        radioCuadrado = (Math.pow(radio, 2));
        
        // Inicializamos area y lo mostramos por pantalla
        area = Math.PI * radioCuadrado;
        System.out.printf("Área: %.2f \n"
        , area);
        
        // Inicializamos radioCubo y multiplicación para usarlo en 
        // la fórmula del volumen
        radioCubo = (Math.pow(radio, 3));
        multiplicacion = (4 * Math.PI * radioCubo);
        
        // Inicializamos volumen y lo mostramos por pantalla
        volumen = multiplicacion / 3;
        System.out.printf("Volumen: %.2f", 
                volumen);

    }
    
}
