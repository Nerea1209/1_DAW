/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicios;

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
        final int i = 1;
        final int v = 5;
        final int x = 10;
        final int l = 50;
        final int c = 100;
        final int d = 500;
        final int m = 1000;

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
/*
1. Los números romanos I, X, C y M pueden repetirse hasta tres veces a la 
hora de escribir un número romano compuesto.
2. Los números romanos V, L y D no pueden repetirse nunca.
3. Si un número romano compuesto tiene un número a la derecha menor que el 
de la izquierda entonces se suman ambos. Ejemplo:
– 3.1. XI: el número de la derecha (I = 1) es menor que el de la izquierda 
(X = 10) entonces se suman, es decir XI = 11.
4. Si un número romano compuesto tiene un número a la derecha mayor que el 
de la izquierda y éste es un I, X o C, entonces se resta el de la izquierda 
al derecha. Ejemplo:
– 4.1. IX: el número de la derecha (X = 10) es mayor que el de la izquierda 
(I = 1) y además este es I luego se resta el de la izquierda al de la derecha, 
es decir IX = 9.
5. Si un número romano tiene sobre él una raya, entonces su valor se 
multiplica por mil. Ejemplo:
– 5.1.  IX : el número es 9.000 puesto que es el número romano que representa 
al 9 y al estar con la raya sobre él se multiplica por mil.
*/
                    String numeroRomano = "";
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
                    String nombre = "";
                    int numeroVocales = 0;
                    nombre = JOptionPane.showInputDialog("Introduce un nombre:");
                    nombre = nombre.toLowerCase();
                    for (int cont = 0; cont < nombre.length(); cont++) {
                        char caracter = nombre.charAt(cont);
                        if (caracter == 'a' || caracter == 'e' || 
                                caracter == 'i' || caracter == 'o' || 
                                caracter == 'u') {
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
