/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package nerea;

import java.util.Scanner;

/**
 *
 * @author ubuntu
 */
public class ParteA {

    public static void main(String[] args) {

        /*La tienda PCRoto se dedica a reparar dispositivos portátiles.
        De lunes a viernes reparan un montón de ordenadores y como son una 
        tienda low cost, cobran lo mismo por todas las reparaciones.
        La idea es que tu programa ayude a los dueños de la tienda a saber 
        cuánto han cobrado cada día y al final de la semana, suponiendo 
        que todas las reparaciones cuestan 32.6€ (double) y todas las semanas 
        trabajan de lunes a viernes (5 días). 
        Una vez leídos los datos del número de reparaciones que hay cada día 
        (de lunes a viernes) se deben mostrar los datos de lo que se ha 
        cobrado cada día (float) y al final de la semana (float). 
        Ten en cuenta que se debe limitar la salida por consola a 3 números 
        decimales. En esta parte todos los datos deben leerse por teclado 
        usando Scanner y mostrarse usando la consola.*/
        
        // CONSTANTES
        final double PRECIO_REPARACIONES = 32.6;

        // VARIABLES
        int reparacionesLunes;
        int reparacionesMartes;
        int reparacionesMiercoles;
        int reparacionesJueves;
        int reparacionesViernes;

        // Utilizamos la clase Scanner para pedir los datos
        Scanner teclado = new Scanner(System.in);

        // Pedimos el número de reparaciones que hizo el lunes
        System.out.println("¿Cuántas reparaciones hicisteis el lunes?");
        // Como Scanner recoge String, lo convertimos en int con la función
        // .nextInt
        reparacionesLunes = teclado.nextInt();

        // Hacemos lo mismo con los demás días
        // MARTES
        System.out.println("¿Cuántas reparaciones hicisteis el martes?");
        reparacionesMartes = teclado.nextInt();

        // MIERCOLES
        System.out.println("¿Cuántas reparaciones hicisteis el miércoles?");
        reparacionesMiercoles = teclado.nextInt();

        // JUEVES
        System.out.println("¿Cuántas reparaciones hicisteis el jueves?");
        reparacionesJueves = teclado.nextInt();

        // VIERNES
        System.out.println("¿Cuántas reparaciones hicisteis el viernes?");
        reparacionesViernes = teclado.nextInt();

        /* Después de recoger los datos, declaramos e inicializamos las 
        variables del dinero ganado cada día de la semana
        En este caso, se multiplica la resparaciones del día por el precio
        de cada reparación
        Además, como son tipos distintos, tenemos que realizar un casting */
        float dineroGanadoLunes = 
                reparacionesLunes * (float) PRECIO_REPARACIONES;
        float dineroGanadoMartes = 
                reparacionesMartes * (float) PRECIO_REPARACIONES;
        float dineroGanadoMiercoles = 
                reparacionesMiercoles * (float) PRECIO_REPARACIONES;
        float dineroGanadoJueves = 
                reparacionesJueves * (float) PRECIO_REPARACIONES;
        float dineroGanadoViernes = 
                reparacionesViernes * (float) PRECIO_REPARACIONES;
        
        // Igual hacemos para declarar e inicializar el dinero ganado en semana
        float dineroGanadoSemana = (dineroGanadoLunes + dineroGanadoMartes
            + dineroGanadoMiercoles + dineroGanadoJueves + dineroGanadoViernes);

        // Mostramos por pantalla los datos de cada día y de la semana mediante
        // un sout y empleando un textblock.
        // Para mostrar solo 3 decimales ponemos .3f
        System.out.println("""
            El lunes reparó %d dispositivos portátiles y ganó %.3f €.
            El martes reparó %d dispositivos portátiles y ganó %.3f €.
            El miércoles reparó %d dispositivos portátiles y ganó %.3f €.
            El jueves reparó %d dispositivos portátiles y ganó %.3f €.
            El viernes reparó %d dispositivos portátiles y ganó %.3f €.
            En total, ha cobrado %.3f € en esta semana.
            """.formatted(reparacionesLunes, dineroGanadoLunes,
                reparacionesMartes, dineroGanadoMartes,
                reparacionesMiercoles, dineroGanadoMiercoles,
                reparacionesJueves, dineroGanadoJueves,
                reparacionesViernes, dineroGanadoViernes,
                dineroGanadoSemana));

    }
}
