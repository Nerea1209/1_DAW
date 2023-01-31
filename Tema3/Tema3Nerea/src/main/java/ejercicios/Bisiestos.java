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
public class Bisiestos {

    public static void main(String[] args) {

        /*Bucle hasta que el usuario introduzca un año ´0
        Si introduce un año negativo se pone positivo
        Nos tiene que decir el programa si es bisiesto o no
        Condiciones para que un año sea bisiesto:
        - Tienes que ser divisible por 4
        - (No divisible por 100 o disivible por 400)
        __Y(__O__)2000(bisiesto)1900(no bisiesto)*/
        int año;
        
        do {
            año = Integer.parseInt(
                    JOptionPane.showInputDialog("Introduce un año"));
            año = Math.abs(año);
            switch (año) {
                case 0 -> JOptionPane.showMessageDialog(null, "Termina el programa");

                default -> {
                    if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) {
                        JOptionPane.showMessageDialog(null, año
                                + " es bisieto");
                    } else {
                        JOptionPane.showMessageDialog(null, año
                                + " no es bisieto");
                    }
                }
            }
        } while (año != 0);
        
    } 
    }
