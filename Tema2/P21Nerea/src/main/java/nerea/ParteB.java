/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit 
this template
 */
package nerea;

import javax.swing.JOptionPane;

/**
 *
 * @author ubuntu
 */
public class ParteB {

    public static void main(String[] args) {

        /*Modifica el ejercicio anterior para que la lectura de datos y 
        la salida por pantalla usen diálogos JOptionPane.
        Además, en esta parte, se debe preguntar cuánto se va a cobrar por 
        reparación cada día de la semana (double) y luego preguntar cuántas 
        reparaciones se han hecho cada día (int). Una vez leídos los datos, 
        calcula lo que se cobra cada día y al final de la semana, guardando 
        los datos en tipos float. Usa un text block, limitando la salida a 1 
        decimal, para usarlo en un JOptionPane que muestre la información 
        de salida.
        Guarda el resultado de evaluar si se ha cobrado al final de la semana 
        más de 1000€, mostrando el resultado por consola.*/
        
        // VARIABLES
        double precioReparacionLunes;
        double precioReparacionMartes;
        double precioReparacionMiercoles;
        double precioReparacionJueves;
        double precioReparacionViernes;
        int reparacionesLunes;
        int reparacionesMartes;
        int reparacionesMiercoles;
        int reparacionesJueves;
        int reparacionesViernes;

        // Pedimos el precio de las reparaciones del lunes mediante JOption
        String precioLunes = JOptionPane.showInputDialog(
                "¿Cuánto costarán las reparaciones el lunes?");
        // Como JOption recoge String, lo convertimos en double con la función
        // Double.parseDouble
        precioReparacionLunes = Double.parseDouble(precioLunes);

        // Hacemos lo mismo con los demás días
        // MARTES
        String precioMartes = JOptionPane.showInputDialog(
                "¿Cuánto costarán las reparaciones el martes?");
        precioReparacionMartes = Double.parseDouble(precioMartes);

        // MIERCOLES
        String precioMiercoles = JOptionPane.showInputDialog(
                "¿Cuánto costarán las reparaciones el miércoles?");
        precioReparacionMiercoles = Double.parseDouble(precioMiercoles);

        // JUEVES
        String precioJueves = JOptionPane.showInputDialog(
                "¿Cuánto costarán las reparaciones el jueves?");
        precioReparacionJueves = Double.parseDouble(precioJueves);

        // VIERNES
        String precioViernes = JOptionPane.showInputDialog(
                "¿Cuánto costarán las reparaciones el viernes?");
        precioReparacionViernes = Double.parseDouble(precioViernes);

        // Pedimos el número de reparaciones que hizo el lunes mediante JOption
        String lunes = JOptionPane.showInputDialog(
                "¿Cuántas reparaciones hicisteis el lunes?");
        // Como JOption recoge String, lo convertimos en int con la función
        // Integer.parseInt
        reparacionesLunes = Integer.parseInt(lunes);

        // Hacemos lo mismo con los demás días
        // MARTES
        String martes = JOptionPane.showInputDialog(
                "¿Cuántas reparaciones hicisteis el martes?");
        reparacionesMartes = Integer.parseInt(martes);

        // MIERCOLES
        String miercoles = JOptionPane.showInputDialog(
                "¿Cuántas reparaciones hicisteis el miércoles?");
        reparacionesMiercoles = Integer.parseInt(miercoles);

        // JUEVES
        String jueves = JOptionPane.showInputDialog(
                "¿Cuántas reparaciones hicisteis el jueves?");
        reparacionesJueves = Integer.parseInt(jueves);

        // VIERNES
        String viernes = JOptionPane.showInputDialog(
                "¿Cuántas reparaciones hicisteis el viernes?");
        reparacionesViernes = Integer.parseInt(viernes);

        /* Después de recoger los datos, declaramos e inicializamos las 
        variables del dinero ganado cada día de la semana
        En este caso, se multiplica la resparaciones del día por el precio
        de cada reparación
        Además, como son tipos distintos, tenemos que realizar un casting */
        float dineroGanadoLunes = 
                reparacionesLunes * (float) precioReparacionLunes;
        float dineroGanadoMartes = 
                reparacionesMartes * (float) precioReparacionMartes;
        float dineroGanadoMiercoles = 
                reparacionesMiercoles * (float) precioReparacionMiercoles;
        float dineroGanadoJueves = 
                reparacionesJueves * (float) precioReparacionJueves;
        float dineroGanadoViernes = 
                reparacionesViernes * (float) precioReparacionViernes;

        // Igual hacemos para declarar e inicializar el dineroGanadoSemana
        float dineroGanadoSemana = (dineroGanadoLunes + dineroGanadoMartes
            + dineroGanadoMiercoles + dineroGanadoJueves + dineroGanadoViernes);

        // Mostramos por pantalla los datos de cada día y de la semana mediante
        // un JOption y empleando un textblock.
        // Para mostrar solo 1 decimal ponemos .1f
        JOptionPane.showMessageDialog(null, """
            El lunes reparó %d dispositivos portátiles y ganó %.1f €.
            El martes reparó %d dispositivos portátiles y ganó %.1f €.
            El miércoles reparó %d dispositivos portátiles y ganó %.1f €.
            El jueves reparó %d dispositivos portátiles y ganó %.1f €.
            El viernes reparó %d dispositivos portátiles y ganó %.1f €.
            En total, ha cobrado %.1f € en esta semana.
            """.formatted(reparacionesLunes, dineroGanadoLunes,
                reparacionesMartes, dineroGanadoMartes,
                reparacionesMiercoles, dineroGanadoMiercoles,
                reparacionesJueves, dineroGanadoJueves,
                reparacionesViernes, dineroGanadoViernes,
                dineroGanadoSemana));

        // Para evaluar si hemos ganado más de 1000€ en la semana
        // usamos un tipo booleano que nos devuelva true si es mayor de 1000
        // y false si es menor
        boolean evaluacionSemana = (dineroGanadoSemana > 1000);

        // Mostramos resultado por pantalla
        System.out.println("¿Esta semana se ha cobrado más de 1000€? " + 
                evaluacionSemana);
    }

}
