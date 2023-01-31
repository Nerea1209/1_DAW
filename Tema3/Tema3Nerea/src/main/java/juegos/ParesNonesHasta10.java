/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegos;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author nerea
 */
public class ParesNonesHasta10 {

    /*
    1. ¿Quieres jugar?
    2. Elige "Pare"/"None" (USUARIO)
    3. Elegir número de dedos (USURIO: con JOption y MÁQUINA: random)
    4. ¿Quién gana? -> Mostramos por pantalla
     */
    private static Random generador = new Random();

    public static void main(String[] args) {
        int opcion = 0;
        int codigoUsuario = 0;
        int codigoMaquina = 1;
        int numDedosUsuario = 0;
        int numDedosMaquina = 0;
        int sumaDedos = 0;
        String eleccion = "";
        int puntosUsuario = 0;
        int puntosMaquina = 0;
        final int puntosGanar = 2;

        do {
            opcion = pedirOpcion();
            puntosUsuario = 0;
            puntosMaquina = 0;

            if (opcion != 1 && opcion != 2) {// Opción no es NO ni CANCELAR
                do {
                    if (puntosUsuario != puntosGanar && puntosMaquina != puntosGanar) {
                        codigoUsuario = elegirParesNones();
                        if (codigoUsuario == 1) {
                            codigoMaquina = 2;
                        }
                        numDedosUsuario = elegirNumDedos();
                        numDedosMaquina = generarAleatorioRangoNuevo(0, 10);
                        sumaDedos = numDedosUsuario + numDedosMaquina;
                        if (sumaDedos % 2 == 0 && codigoUsuario == 1) {
                            puntosUsuario++;
                            JOptionPane.showMessageDialog(null,
                                    "¡Has ganado 1 punto!\n");
                        } else {
                            puntosMaquina++;
                            JOptionPane.showMessageDialog(null,
                                    "La máquina ha ganado 1 punto...\n");
                        }

                        if (codigoUsuario == 1) {
                            eleccion = "pares";
                        } else {
                            eleccion = "nones";
                        }

                        JOptionPane.showMessageDialog(null, """
                                    Porque...
                                    ... elegiste %s,
                                    Sacaste %d dedos,
                                    la máquina sacó %d dedos y
                                    la suma de ambos es %d dedos
                                    ___________PUNTOS___________
                                    Usuario: %d
                                    Máquina: %d
                                    """.formatted(eleccion,
                                numDedosUsuario,
                                numDedosMaquina,
                                sumaDedos,
                                puntosUsuario,
                                puntosMaquina));
                    }
                } while (puntosUsuario != puntosGanar && puntosMaquina != puntosGanar);
            }
            if (puntosUsuario == puntosGanar) {
                JOptionPane.showMessageDialog(null, "¡HAS GANADO!");
            } else if (puntosMaquina == puntosGanar) {
                JOptionPane.showMessageDialog(null,
                        "Oohh, has perdidoo... Ha ganado la máquina");
            } else if (opcion == 1) {

                JOptionPane.showMessageDialog(null,
                        "Ya no quieres seguir jugando");
            } else {
                JOptionPane.showMessageDialog(null,
                        "Cancelando...");
            }

        } while (opcion == 0); // Opción es SÍ

    }

    public static int mostrarMenuInicial() {

        // Se pone dentro del bloque try la sentencia que puede producir 
        // el error
        int opcion = JOptionPane.showConfirmDialog(null,
                "¿Quieres jugar?");
        return opcion;
    }

    public static boolean mostrarMenuInicialValida(int opcion) {
        return (opcion == 0 || opcion == 1 || opcion == 2);
    }

    public static int pedirOpcion() {
        int opcion;
        do {
            opcion = mostrarMenuInicial();

        } while (!mostrarMenuInicialValida(opcion));
        return opcion;
    }

    public static int paresNones() {
        int codigo = 0;
        do {

            try {
                codigo = Integer.parseInt(JOptionPane.showInputDialog(
                        null,
                        """
                ¿PARES O NONES?
                1. Pares
                2. Nones
                """));
                break;
            } catch (NumberFormatException nfe) {
                // En caso de error
                JOptionPane.showMessageDialog(null, "Elección no válida");

            }
        } while (true);

        return codigo;
    }

    public static boolean paresNonesValido(int codigo) {
        return (codigo == 1 || codigo == 2);
    }

    public static int elegirParesNones() {
        int codigo;
        do {
            codigo = paresNones();

        } while (!paresNonesValido(codigo));
        return codigo;
    }

    public static int numDedos() {
        int numero = 0;
        do {

            try {
                numero = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "¿Cuántos dedos vas a sacar?"));
                break;
            } catch (NumberFormatException nfe) {
                // En caso de error
                JOptionPane.showMessageDialog(null, "Número de dedos no válido");

            }
        } while (true);

        return numero;
    }

    public static boolean numDedosValido(int numero) {
        return (numero >= 0 && numero <= 10);
    }

    public static int elegirNumDedos() {
        int numero;
        do {
            numero = numDedos();

        } while (!numDedosValido(numero));
        return numero;
    }

    public static int generarAleatorioRangoNuevo(int minimo, int maximo) {
        Random generador = new Random();
        return generador.nextInt(minimo, maximo++);

    }
}
