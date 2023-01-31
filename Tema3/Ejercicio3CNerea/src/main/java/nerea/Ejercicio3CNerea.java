/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package nerea;

import javax.swing.JOptionPane;

/**
 *
 * @author nerea
 */
public class Ejercicio3CNerea {

    public static void main(String[] args) {
        // NÚMEROS ROMANOS
        /*Implementa un programa que muestre tres opciones.
        La primera será la opción que represente un número romano a partir de
        su número decimal (Entre 1 y 10). 
        La segunda debe contar las vocales que tiene un nombre.
        La tercera será salir.
        El programa debe ejecutarse hasta que el usuario decida salir.*/

        // VARIABLES
        int opcion;
        int numeroDecimal;
        String numeroRomano = "";
        final int i = 1;
        final int v = 5;
        final int x = 10;
        final int l = 50;
        final int c = 100;
        final int d = 500;
        final int m = 1000;
        String nombre;
        int numeroVocales = 0;

        do {

            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                    -----------------------OPCIONES---------------------
                                    1. - Número romano a partir de un decimal
                                    2. - Nº vocales de un nombre
                                    3. - Salir
                                    ----------------------------------------------------
                                    Elige una opción: """));
            switch (opcion) {
                case 1 -> {
                    numeroDecimal = Integer.parseInt(JOptionPane.showInputDialog(
                            "Introduce un número entero:"));

                    while (numeroDecimal >= m) {
                        numeroDecimal -= m;
                        numeroRomano = numeroRomano + "M";
                    }
                    while (numeroDecimal >= d) {
                        numeroDecimal -= d;
                        numeroRomano = numeroRomano + "D";
                    }
                    while (numeroDecimal >= c) {
                        numeroDecimal -= c;
                        numeroRomano = numeroRomano + "C";
                    }
                    while (numeroDecimal >= l) {
                        numeroDecimal -= l;
                        numeroRomano = numeroRomano + "L";
                    }
                    while (numeroDecimal >= x) {
                        numeroDecimal -= x;
                        numeroRomano = numeroRomano + "X";
                    }
                    while (numeroDecimal >= v) {
                        numeroDecimal -= v;
                        numeroRomano = numeroRomano + "V";
                    }
                    while (numeroDecimal >= i) {
                        numeroDecimal -= i;
                        numeroRomano = numeroRomano + "I";
                    }
                    if (numeroDecimal == 0) {
                        JOptionPane.showMessageDialog(null, 
                                "Número Romano: " + numeroRomano);
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "No existen números romanos negativos");
                    }

                }

                case 2 -> {
                    nombre = JOptionPane.showInputDialog("Introduce un nombre:");
                    nombre = nombre.toLowerCase();
                    for (int cont = 0; cont < nombre.length(); cont++) {
                        char caracter = nombre.charAt(cont);
                        if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o'
                                || caracter == 'u') {
                            numeroVocales++;
                        } 
                    }
                    JOptionPane.showMessageDialog(null, 
                            nombre + " tiene " + numeroVocales + " vocales.");
                }

                case 3 ->
                    JOptionPane.showMessageDialog(null,
                            "Ha seleccionado salir");
                    
                default -> JOptionPane.showMessageDialog(null, 
                        """
                        Opción no válida.
                        Por favor, ingrese otro valor.
                        """);

            }

        } while (opcion != 3);

    }
}
