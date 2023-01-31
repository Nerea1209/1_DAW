/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerea;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author nerea
 */
public class JuegoMorra {

// Decir que número creemos que va a sacar el otro
// Elegir cuantos vamos a sacar
// La puntuación mínima obtenible es 2, ya que no existe el cero (el puño cerrado vale 1).
// morra = 10 dedos
// Si acierta gana, sino se vuelve a empezar
// Se suele jugar partidos a quién llega antes a los 5 o 21 puntos, 
// manteniendo siempre una ventajas de 2 victorias sobre el otro jugador: 
// si se da el caso de un empate de 4 a 4, se juega por el punto de ventaja, 
// debiendo conseguir otro punto sucesivamente para ganar el partido.
    private static Random generador = new Random();
    private static final int numDedosMax = 5;

    public static void main(String[] args) {
        // VARIABLES
        int opcion = 0;
        int numDedosOtroUsuario = 0;
        int numDedosOtroMaquina = 0;
        int numDedosUsuario = 0;
        int numDedosMaquina = 0;
        int puntosUsuario = 0;
        int puntosMaquina = 0;
        int puntosGanar = 5;
        
        // Preguntamos si quiere jugar o no
        do {
            opcion = pedirOpcion();
            puntosUsuario = 0;
            puntosMaquina = 0;
            
            // Si quiere jugar
            if (opcion != JOptionPane.NO_OPTION && opcion != JOptionPane.CANCEL_OPTION) {// Opción no es NO ni CANCELAR
                do {
                    // Si ninguno ha ganado elige el nº de dedos que saca
                    if (puntosUsuario != puntosGanar && puntosMaquina != puntosGanar) {
                        numDedosUsuario = elegirNumDedos();
                        
                        // Si saca 0, vale 1 (normas del juego)
                        if (numDedosUsuario == 0){
                            numDedosUsuario = 1;
                        }
                        
                        // El nº de dedos que saca la máquina es random
                        numDedosMaquina = generarAleatorioRangoNuevo(1, numDedosMax);
                        // Pedimos el nº de dedos que cree que va a sacar el oponente
                        numDedosOtroUsuario = pensarNumDedosOtro();
                        // Los dedos que cree la máquina que va a sacar el usuario es random
                        numDedosOtroMaquina = generarAleatorioRangoNuevo(1, numDedosMax);
                        
                        // ¿GANADOR?
                        // Si la maquina y el usuario acierta, empate, punto para ambos
                        if (numDedosMaquina == numDedosOtroUsuario
                                && numDedosUsuario == numDedosOtroMaquina) {
                            JOptionPane.showMessageDialog(null,
                                    "EMPATE\n"
                                    + "¡Punto para ambos!");
                            puntosUsuario++;
                            puntosMaquina++;
                            
                        // Si acierta la máquina, punto para la máquina
                        } else if (numDedosUsuario == numDedosOtroMaquina) {
                            puntosMaquina++;
                            JOptionPane.showMessageDialog(null,
                                    "La máquina ha ganado 1 punto...\n");
                            
                        // Si acierta el usuario, punto para el usuario
                        } else if (numDedosMaquina == numDedosOtroUsuario) {
                            puntosUsuario++;
                            JOptionPane.showMessageDialog(null,
                                    "¡Has ganado 1 punto!\n");
                        }
                        
                        // Mostramos el por qué y la suma de puntos
                        JOptionPane.showMessageDialog(null, """
                                    Porque...
                                    ... sacaste %d dedos y
                                    la máquina pensó que sacarías %d;
                                    la máquina sacó %d dedos y
                                    pensaste que sacarías %d.
                                    
                                    ___________PUNTOS___________
                                    Usuario: %d
                                    Máquina: %d
                                    """.formatted(
                                numDedosUsuario,
                                numDedosOtroMaquina,
                                numDedosMaquina,
                                numDedosOtroUsuario,
                                puntosUsuario,
                                puntosMaquina));
                    }
                    
                    // Si alguno de los dos llega a los 21 puntos
                    // sin tener 2 de ventajas, empatan y termina el juego
                    if(puntosUsuario == 21 || puntosMaquina == 21){
                        break;
                        
                    // Gana quien antes llegue a 5 a no ser que no se lleven 2 puntos de ventaja
                    // Entonces, si alguno de los 2 llega a 5 pero no tiene ventaja de 2 puntos, 
                    // se juega otra ronda, hasta conseguirlo
                    } else if ((puntosUsuario >= puntosGanar || puntosMaquina >= puntosGanar) && Math.abs(puntosUsuario - puntosMaquina) < 2) {
                        puntosGanar++;
                        
                    // Si llega alguien a 5 con 2 puntos de ventajas o mas, gana
                    } else if ((puntosUsuario >= puntosGanar || puntosMaquina >= puntosGanar) && Math.abs(puntosUsuario - puntosMaquina) > 2) {
                        break;
                    } 
                    
                } while (puntosUsuario != puntosGanar && puntosMaquina != puntosGanar);
                
                // Si llegan a los 21 puntos sin que gane ninguno,
                // se considera empate y termina el juego
                if (puntosUsuario == 21 || puntosMaquina == 21) {
                    JOptionPane.showMessageDialog(null, "¡EMPATE!");
                    
                // Si el usuario ha conseguido llegar a 5 o más teniendo como
                // mínimo 2 puntos de ventajas, gana el usuario
                } else if (puntosUsuario == puntosGanar) {
                    JOptionPane.showMessageDialog(null, "¡HAS GANADO!");
                    
                // Sino gana la máquina
                } else if (puntosMaquina == puntosGanar) {
                    JOptionPane.showMessageDialog(null,
                            "Oohh, has perdidoo... Ha ganado la máquina");
                    
                // Si pulsa la opción NO (No quiere seguir jugando)
                } else if (opcion == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null,
                            "Ya no quieres seguir jugando");
                    
                // Si pulsa cancelar, termina el programa
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Cancelando...");
                }
            }

        } while (opcion == JOptionPane.YES_OPTION); // Opción es SÍ

    }

    public static int mostrarMenuInicial() {

        // Se pone dentro del bloque try la sentencia que puede producir 
        // el error
        int opcion = JOptionPane.showConfirmDialog(null,
                "¿Quieres jugar?");
        return opcion;
    }

    public static boolean mostrarMenuInicialValida(int opcion) {
        return (opcion == 0 || opcion == 1 || opcion == numDedosMax);
    }

    public static int pedirOpcion() {
        int opcion;
        do {
            opcion = mostrarMenuInicial();

        } while (!mostrarMenuInicialValida(opcion));
        return opcion;
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
        return (numero >= 0 && numero <= numDedosMax);
    }

    public static int elegirNumDedos() {
        int numero;
        do {
            numero = numDedos();

        } while (!numDedosValido(numero));
        return numero;
    }

    public static int numDedosOtro() {
        int numero = 0;
        do {

            try {
                numero = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "¿Cuántos dedos crees que va a sacar la máquina?"));
                break;
            } catch (NumberFormatException nfe) {
                // En caso de error
                JOptionPane.showMessageDialog(null, "Número de dedos no válido");

            }
        } while (true);

        return numero;
    }

    public static boolean numDedosOtroValido(int numero) {
        return (numero > 0 && numero <= numDedosMax);
    }

    public static int pensarNumDedosOtro() {
        int numero;
        do {
            numero = numDedosOtro();

        } while (!numDedosOtroValido(numero));
        return numero;
    }

    public static int generarAleatorioRangoNuevo(int minimo, int maximo) {
        Random generador = new Random();
        return generador.nextInt(minimo, maximo++);

    }

}
