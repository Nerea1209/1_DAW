/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package prueba;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nerea
 */
public class Margaritas {

    /*
    1. Preguntar si quiere ejecutar el programa de nuevo
    2. Cuantas margaritas quieres deshojar (entre 1 y 10)
    3. Cuantas hojas tiene la margarita 
    4. Generador de tiradas del dado.
    5. Empieza por me quiere o no me quiere
    6. Resultado
     */
    // Creamos el Scanner y el Random fuera del main para usarlo en los metodos
    private static Scanner teclado = new Scanner(System.in);
    private static Random generador = new Random();

    // MAIN
    public static void main(String[] args) {

        // VARIABLES
        String opcion = "";
        int petalos = 0;
        int tiroDado = 0;
        String comienzo = "";
        String resultado = "";

        do {
            // Si no es salir, ejecuta el programa
            if (!opcion.equalsIgnoreCase("No")) {
                // Pide el numero de margaritas
                int numMargaritas = pedirNumMargaritas();

                // Solicita el numero de petalos que tiene cada una de las margaritas
                // Controlando que lo que mete el usuario es un número entero
                do {
                    try {
                        // Se repite el proceso para cada una de las margaritas
                        for (int i = 1; i <= numMargaritas; i++) {
                            do {
                                // Controlamos que el usuario meta un entero
                                try {
                                    // Pedimos el numero de petalos y lo guardamos
                                    System.out.println("¿Cuántos pétalos tiene la margarita N." + i);
                                    petalos = teclado.nextInt();
                                    // Usamos el metodo tiroDado para que nos de el resultado
                                    tiroDado = tiroDado();
                                    // Usamos el metodo comienzo para que nos diga que
                                    // - Si sale par es "Empieza por me quiere"
                                    // - Si sale impar es "Empieza por no me quiere"
                                    // - Si es 3 se vuelve a tirar hasta que salga otro número
                                    comienzo = comienzo(tiroDado);
                                    // Usamos el método resultado para que nos diga
                                    // el resultado final sabiendo como empieza y
                                    // el numero de petalos
                                    resultado = resultado(petalos, comienzo);
                                    System.out.println(
                                            "La margarita tiene " + petalos + 
                                            " hojas, \n Romeo sacó " + tiroDado +
                                            " en el dado, \n empezó a quitar hojas con \""
                                            + comienzo + "\" y \n el resultado final es "
                                            + "que su amada " +resultado);
                                    break;
                                } catch (InputMismatchException ime) {
                                    // En caso de error
                                    System.out.println("Cantidad no válida");
                                    // Limpieza del buffer
                                    teclado.nextLine();
                                }
                            } while (true);
                        }
                        break;
                    } catch (InputMismatchException ime) {
                        // En caso de error
                        System.out.println("Cantidad no válida");
                        // Limpieza del buffer
                        teclado.nextLine();
                    }
                } while (true);
            }
            // Pedimos si quiere volver a ejecutar el programa hasta que elija que no
            opcion = pedirOpcion();

        } while (opcion.equalsIgnoreCase("Sí"));
        // Se repite mientras elija ejecutar el programa

    }

    // Métodos
    // Pregunta si quiere ejecutar el programa, 
    // capturando la excepcion si el usuario no mete un número entero
    public static String mostrarMenuInicial() {
        String opcion = "";
        // Si es entero, guarda la opcion
        System.out.println("¿Quieres volver a ejecutar el programa?(Sí/No) \n"
        + "IMPORTANTE: \"Sí\" con tilde en la \"í\"");
        opcion = teclado.next();
        return opcion;
    }

    // Controla que la opcion sea o 1 o 2 
    public static boolean mostrarMenuInicialValida(String opcion) {
        return (opcion.equalsIgnoreCase("Sí")
                || opcion.equalsIgnoreCase("No"));
    }

    // Repite el menú mientras la opcion no sea ni 1 ni 2
    public static String pedirOpcion() {
        String opcion;
        do {
            opcion = mostrarMenuInicial();
            
            if (opcion.equalsIgnoreCase("Sí")) {
                System.out.println("Elegiste ejecutar el programa de nuevo.");
            } else if (opcion.equalsIgnoreCase("No")) {
                System.out.println("Elegiste no ejecutar más el programa");
            } else {
                System.out.println("Esa opción no es correcta. Escriba yes o no.");
            }

        } while (!mostrarMenuInicialValida(opcion));
        return opcion;
    }

    // Solicita el numero de margaritas controlando que el usuario meta un entero
    public static int solicitarNumMargaritas() {
        int margarita = 0;
        do {
            try {
                // Si mete un entero, guarda la el numero de margaritas
                System.out.println("¿Cuántas margaritas quieres deshojar?");
                margarita = teclado.nextInt();
                break;
            } catch (InputMismatchException ime) {
                // En caso de error
                System.out.println("Cantidad no válida");
                // Limpieza del buffer
                teclado.nextLine();
            }
        } while (true);
        return margarita;
    }

    // Comprueba que el numero de margaritas sea entre 1 y 10
    public static boolean solicitarMargaritasValida(int margarita) {
        return (margarita >= 1 && margarita <= 10);
    }

    // Solicita el numero de margaritas mientras no esté entre 1 y 10
    public static int pedirNumMargaritas() {
        int margarita;
        do {
            margarita = solicitarNumMargaritas();
        } while (!solicitarMargaritasValida(margarita));
        return margarita;
    }

    // Genera un numero random entre el rango que le pasemos
    public static int generartiradaDado(int minimo, int maximo) {
        Random generador = new Random();
        return generador.nextInt(minimo, maximo++);

    }

    // Comprueba que la tirada no sea 3
    public static boolean meQuiereONoMeQuiere(int tiroDado) {
        return tiroDado != 3;
    }

    // Se repite mientras la tirada sea 3 entra un numero random entre 1 y 6
    // que son las caras que tiene un dado
    public static int tiroDado() {
        int resultado;
        do {
            resultado = generartiradaDado(1, 6);
        } while (!meQuiereONoMeQuiere(resultado));
        return resultado;

    }

    // Te muestra la tirada y por donde empieza
    public static String comienzo(int tiroDado) {
        String comienzo = "";
        if (tiroDado % 2 == 0 && tiroDado != 3) {
            comienzo = "me quiere";
        } else if (tiroDado % 2 != 0 && tiroDado != 3) {
            comienzo = "no me quiere";
        } else {
            comienzo = "La tirada fue " + tiroDado
                    + "\n Vuelve a tirar";

        }
        return comienzo;
    }

    // Te dice el resultado final
    public static String resultado(int numPetalos, String comienzo) {
        String resultado = "";
        if (comienzo.contains("no") && numPetalos % 2 == 0) {
            resultado = "lo quiere";
        } else {
            resultado = "no lo quiere";
        }
        return resultado;
    }

}
