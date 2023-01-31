/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package nerea;

import javax.swing.JOptionPane;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author nerea
 */
public class Tarea4BPassword {

    private static char[] conjuntoCaracteres = {'a', 'z', 'b', 's', '&', '*', '1'};

    public static void main(String[] args) {

        int opcion = pedirOpcion();

        if (opcion == 1) {
            // Opcion 1 - Pin 4 dígitos
            String pin = generarPin();
            JOptionPane.showMessageDialog(null, pin);
            
        } else if (opcion == 2) {
            // Opcion 2 - Contraseñas con números y letras
            String contra = generarContra();
            JOptionPane.showMessageDialog(null, contra);
            
        } else if (opcion == 3) {
            // Opcion 3 - una contraseña con un conjunto de caracteres que elijo
            String clave = generarClave();
            JOptionPane.showMessageDialog(null, clave);
            
        } else if (opcion == 4) {
            System.out.println("Saliendo...");
        } else {
            System.out.println("Opción no válida");
        }
    }

    public static int mostrarMenuInicial() {
        int opcion = 0;
        // Se pone dentro del bloque try la sentencia que puede producir 
        // el error
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        """
                ________________OPCIONES________________
                1. Generar números pin aleatorios 
                para tarjetas SIM de teléfonos móviles.
                
                2. Generar contraseñas para usuarios de 
                un sistema operativo con 8 caracteres, 
                incluyendo números y letras.
                
                3. Generar una secuencia de "n" caracteres 
                aleatorios de un conjunto que elijas.
                
                4. Salir.
                __________________________________________
                Introduce una opción:"""));
                break;

            } catch (NumberFormatException nfe) {
                // En caso de error
                JOptionPane.showMessageDialog(null, "Elección no válida");

            }
        } while (true);
        return opcion;
    }

    public static boolean mostrarMenuInicialValida(int opcion) {
        return (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4);
    }

    public static int pedirOpcion() {
        int opcion;
        do {
            opcion = mostrarMenuInicial();

        } while (!mostrarMenuInicialValida(opcion));
        return opcion;
    }

    public static int mostrarNumeroPin() {
        int numeroPin = 0;
        // Se pone dentro del bloque try la sentencia que puede producir 
        // el error
        do {
            try {
                numeroPin = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "¿Cuántos números pin quieres?"));
                break;

            } catch (NumberFormatException nfe) {
                // En caso de error
                JOptionPane.showMessageDialog(null, "Cantidad no válida");

            }

        } while (true);

        return numeroPin;
    }

    public static int mostrarNumeroClaves() {

        int claves = 0;
        do {
            try {
                claves = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "¿Cuántas contraseñas quieres?"));
                break;
            } catch (NumberFormatException nfe) {
                // En caso de error
                JOptionPane.showMessageDialog(null, "Cantidad no válida");

            }
        } while (true);
        return claves;
    }

    public static int mostrarNumeroSecuencias() {
        int secuencia = 0;
        do {
            try {
                secuencia = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "¿Cuántas secuencias quieres?"));
                break;
            } catch (NumberFormatException nfe) {
                // En caso de error
                JOptionPane.showMessageDialog(null, "Cantidad no válida");

            }
        } while (true);
        return secuencia;
    }

    public static int leern() {
        int n = 0;
        do {
            try {
                n = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "¿De qué tamaño quieres que sea la secuencia?"));
                break;
            } catch (NumberFormatException nfe) {
                // En caso de error
                JOptionPane.showMessageDialog(null, "Cantidad no válida");

            }
        } while (true);
        return n;
    }
    
    public static String generarPin(){
        int numeroPin = mostrarNumeroPin();
        String pin = "";
        String pins="";
        for (int i = 0; i < numeroPin; i++) {
                pin = RandomStringUtils.randomNumeric(4);
                pins = pins + "\n" + pin;
        }
        return pins;
    }
    
    public static String generarContra(){
    int numeroClaves = mostrarNumeroClaves();
    String password = "";
    String contra = "";
            for (int i = 0; i < numeroClaves; i++) {
                password = RandomStringUtils.randomAlphanumeric(numeroClaves);
                contra = contra + "\n" + password;
            }
            return contra;
    }
    
    public static String generarClave(){
        int numeroSecuencias = mostrarNumeroSecuencias();
            int tamaño = leern();
            String clave = "";
            String claves = "";
            for (int i = 0; i < numeroSecuencias; i++) {
                clave = RandomStringUtils.random(tamaño, conjuntoCaracteres);
                claves = claves + "\n" + clave;
            }
            return claves;
    }

}
