/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variables;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ubuntu
 */
public class EjemploExpresionesLogicas {
    
    public static void main(String[] args) {
        /*
        Leer por teclado nombre y apellido1 de una persona,
        edad, peso (kg) y estatura (cm).
        */
        
        String nombre;
        String apellido1;
        int edad, estatura;
        double peso;
        
        Scanner teclado = new Scanner (System.in);
        
        // SI HAY QUE LEER TEXTOS Y NÚMEROS CON SCANNER
        // PRIMERO SE LEEN LOS TEXTOS Y AL FINAL LOS NÚMEROS
        
        // SI LO ANTERIOR NO ES POSIBLE, HAY QUE TENER EN CUENTA
        // QUE DESPUÉS DE LEER UN NÚMERO SI VAMOS A LEER UN TEXTO
        // HAY QUE LIMPIAR EL BUFFER (teclado.nextline())
        
         System.out.println("Introduce tu edad ");
        edad = teclado.nextInt();
        System.out.println("Tu edad es " + edad);
        
        // Limpiar porquería
        teclado.nextLine();
        
        System.out.println("Introduce tu nombre ");
        nombre = teclado.nextLine();
        System.out.println("Tu nombre es " + nombre);
        
        // Lectura de datos con JOption, SIEMPRE DEVUELVEN STRING
        apellido1 = JOptionPane.showInputDialog("Introduce tu apellido: ");
        // System.out.println("Tu apellido es " + apellido1);
        JOptionPane.showMessageDialog(null, "Tu apellido es "
        + apellido1);
        
        
        // peso - double
        
        String pesoString = JOptionPane.showInputDialog("Introduce el peso: ");
        // Cambio string a double
        peso = Double.parseDouble(pesoString);
        peso+=10;
        JOptionPane.showMessageDialog(null, "Tu peso es "
        + peso);
        
        
        //estatura - int
        String estaturaString = JOptionPane.showInputDialog("Introduce la estatura: ");
        // Cambio string a double
        estatura = Integer.parseInt(estaturaString);
        JOptionPane.showMessageDialog(null, "Tu estatura es "
        + estatura);
        
        /*
        System.out.println("Introduce tu primer apellido ");
        apellido1 = teclado.nextLine();
        System.out.println("Tu primer apellido es " + apellido1);
        */
        
        /*
        System.out.println("Introduce tu peso ");
        peso = teclado.nextDouble();
        System.out.println("Tu peso es " + peso);
        */
        
        /*
        System.out.println("Introduce tu estatura ");
        estatura = teclado.nextInt();
        System.out.println("Tu estatura es " + estatura);
        */
        
        // Guardar en variables booleanas el resultado de evaluar
        // las siuientes expresiones
        
        // A. - Si la edad está comprendida entre 25 y 35 años
        // incluidos
        
        boolean a = (edad>=25)&&(edad<=35);
        System.out.println("¿La edad está entre 25 y 35 años incluidos? " + a);
        
        // B. - El peso es mayor de 50 kg o menor o ingual de 100 kg
        
        boolean b = (peso>50)||(peso<=100);
        
        
        /*boolean b = (peso>50)||(peso<=100);
        System.out.println("¿El peso es mayor de 50kg o menor o igual de 100kg? "
        + b);*/
        
        // C. - No mide 175cm
        
        boolean c = (estatura!=175);
        System.out.println("¿La estatura no es 175cm? " + c);
        
        // D. - La estatura está entre 100cm y 180cm, excluidos
        
        boolean d = (estatura>100)&&(estatura<180);
        System.out.println("¿La estatura está entre 100cm y 180cm excluidos? "
        + d);
        
        // E. - La edad es más 10 años y no supera los 60 años
        
        boolean e = (edad + 10 < 60);
        System.out.println("¿La edad es más de 10 años y no supera los 60? "
        + e);
        
        // F. - El nombre es igual a "Pablo", ignorando mayúsculas y
        // minúsculas. Usa equalsIgnoreCase de los String
       
        boolean f = nombre.equalsIgnoreCase("Pablo");
        System.out.println("¿El nombre es igual a Pablo? " + f);
        
        // G. - El apellido contiene la letra "j". Usa contains de los String
        
        boolean g = apellido1.toLowerCase().contains("j");
        System.out.println("¿El apellido contiene la letra j? " + g);
        
        // H. - El apellido termina en "dez". Usa endsWith de los String
        
        boolean h = apellido1.toLowerCase().endsWith("dez");
        System.out.println("¿El apellido termina en dez? " + h);
        
        // I. - La edad no está entre 40 y 50 años
        
        boolean i = (edad>40)&&(edad<50);
        System.out.println("¿La edad no está entre 40 y 50 años? " + i);
    }
    
}
