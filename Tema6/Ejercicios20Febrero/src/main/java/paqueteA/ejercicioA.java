/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package paqueteA;

import javax.swing.JOptionPane;

/**
 *
 * @author nerea
 */
public class ejercicioA {

    public static void main(String[] args) {
        int numero = pedirNumero();
        char[] array = IntToChar(numero);
        System.out.println("¿El número introducido es capicúo? " + isCapicua(array, 0, array.length - 1));
    }

    public static int pedirNumero() {
        int numero = 0;
        do {
            try {
                numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entero"));
                break;
            } catch (NumberFormatException nfe) {
                System.out.println("No has introducido un número entero.");
            }
        } while (true);
        return numero;
    }

    public static char[] IntToChar(int numero) {
        String numeroString = String.valueOf(numero);
        char[] arrayChar = new char[numeroString.length()];
        for (int i = 0; i < numeroString.length(); i++) {
            arrayChar[i] = numeroString.charAt(i);
        }
        return arrayChar;
    }

//    public static boolean isCapicua(char[] arrayChar){
//        boolean resultado = false;
//        for (int i = 0; i < arrayChar.length; i++) {
//            for (int j = arrayChar.length - 1; j >= 0; j--) {
//                if (arrayChar[i] == arrayChar[j]) {
//                resultado = true;
//                } else {
//                    resultado = false;
//                }
//            }
//        }
//        return resultado;
//    }
    public static boolean isCapicua(char[] arrayChar, int i, int j) {
        boolean resultado = true;
        if (i >= 0 && i < arrayChar.length && j >= 0 && j < arrayChar.length && i < j) {
            if (arrayChar[i] == arrayChar[j]) {
                resultado = true && isCapicua(arrayChar, i + 1, j - 1);
            } else {
                resultado = false;
            }
        }
        return resultado;
    }
}