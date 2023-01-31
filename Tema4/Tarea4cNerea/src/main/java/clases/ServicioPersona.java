/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author nerea
 */
public class ServicioPersona {

    private static Scanner teclado = new Scanner(System.in);

    // Lee por teclado los datos de una serie y devuelve el objeto creado
    public static Persona leerTecladoPersona() {
        // Creamos el objeto de tipo Serie
        Persona persona;

        // Leer por teclado e instanciar
        // nombre, edad, peso, sexo y altura.
        System.out.println("Nombre de la persona: ");
        String nombrePersona = teclado.nextLine();
        int edadPersona = edadPersona();
        System.out.println("Sexo de la persona: ");
        char sexoPersona = teclado.next().charAt(0);
        double pesoPersona = pesoPersona(); // mayor que 0
        double alturaPersona = alturaPersona(); // mayor que 0
        String nif = "";

        teclado.nextLine();

        persona = new Persona(nombrePersona, edadPersona, sexoPersona,
                pesoPersona, alturaPersona, nif);

        // Devolvemos el tipo Persona
        return persona;
    }

    private static int edadValida() {
        int edadPersona;
        do {
            System.out.println("Edad de la persona: ");
            edadPersona = teclado.nextInt();
            if (edadPersona > 0) {
                teclado.nextLine();
            } else {
                System.out.println("Edad incorrecta");
            }
        } while (edadPersona <= 0);
        return edadPersona;
    }

    private static double pesoValido() {
        double pesoPersona;
        do {
            System.out.println("Peso de la persona: ");
            pesoPersona = teclado.nextDouble();
            if (pesoPersona > 0) {
                teclado.nextLine();
                break;
            } else {
                System.out.println("Peso incorrecto");
            }
        } while (pesoPersona <= 0);
        return pesoPersona;
    }

    private static double alturaValida() {
        double alturaPersona;
        do {
            System.out.println("Altura de la persona: ");
            alturaPersona = teclado.nextDouble();
            if (alturaPersona > 0) {
                teclado.nextLine();
                break;
            } else {
                System.out.println("Altura incorrecta");
            }
        } while (alturaPersona <= 0);
        return alturaPersona;
    }

    private static int edadPersona() {
        int edadPersona = 0;
        do {
            try {
                edadPersona = edadValida(); // mayor que 0
                break;
            } catch (InputMismatchException ime) {
                // En caso de error
                System.out.println("Edad no válida");
                // Limpieza del buffer
                teclado.nextLine();
            }
        } while (true);

        return edadPersona;
    }
    
    private static double pesoPersona() {
        double pesoPersona = 0;
        do {
            try {
                pesoPersona = pesoValido(); // mayor que 0
                break;
            } catch (InputMismatchException ime) {
                // En caso de error
                System.out.println("Peso no válido");
                // Limpieza del buffer
                teclado.nextLine();
            }
        } while (true);

        return pesoPersona;
    }
    
    
    
    private static double alturaPersona() {
        double alturaPersona = 0;
        do {
            try {
                alturaPersona = alturaValida(); // mayor que 0
                break;
            } catch (InputMismatchException ime) {
                // En caso de error
                System.out.println("Altura no válida");
                // Limpieza del buffer
                teclado.nextLine();
            }
        } while (true);

        return alturaPersona;
    }
}
