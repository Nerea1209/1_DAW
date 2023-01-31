/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerea;

import javax.swing.JOptionPane;

/**
 *
 * @author nerea
 */
public class Ejercicio3ENerea2 {

    public static void main(String[] args) {

        // CONSTANTES
        // Rango de precio materia prima
        final double LIMITE_INFERIOR1 = 0.1;
        final double LIMITE_SUPERIOR1 = 1;

        // Rango de coste de mano de obra
        final double LIMITE_INFERIOR2 = 0.5;
        final double LIMITE_SUPERIOR2 = 0.9;

        // Margen de beneficio por unidad
        final double PORCENTAJE_M1_M2_P1 = ((double) 50 / 100);
        final double PORCENTAJE_T1_T2 = ((double) 65 / 100);

        // Beneficio mínimo
        final int BENEFICIOS_MINIMOS = 2500;

        // VARIABLES
        String opcion;
        String codigoDulce="";
        double precioMateriaPrima=0;
        double costeManoObra=0;
        double costeProduccion=0;
        double precioVentaUnitario=0;
        int cantidadUnidades=0;

        // PROCESO
        // Mostramos las opciones y pedimos que introduzca alguna
        do {
            opcion = JOptionPane.showInputDialog(
                    """
            __________________________________________
            -----------------OPCIONES-----------------
            1. - Ver la viabilidad de los productos.
            2. - Terminar. (o introduzca "salir")
            __________________________________________
            Introduce una opción:                     """);

            // Pasamos todo a minúsculas para que no importe si el usuario
            // escribe la opción en mayúsculas, minusculas, ...
            opcion = opcion.toLowerCase();

            switch (opcion) {
                case "1" -> {
                    do {
                        codigoDulce = JOptionPane.showInputDialog(
                                """
                    -----------CÓDIGO DE DULCES-----------

                    M1 -> Mantecados de Limón
                    P1 -> Polvorones
                    T1 -> Turrón de chocolate
                    T2 -> Turrón clásico
                    M2 -> Mazapanes
                    --------------------------------------
                    Si desea salir escriba "salir"
                    ______________________________________
                    Introduce un código:                  """);

                        codigoDulce = codigoDulce.toLowerCase();

                        if (codigoDulce.equals("m1")
                                || codigoDulce.equals("p1")
                                || codigoDulce.equals("t1")
                                || codigoDulce.equals("t2")
                                || codigoDulce.equals("m2")) {

                            JOptionPane.showMessageDialog(null, "Código correcto");

                        } else if (codigoDulce.equals("salir")) {
                            JOptionPane.showMessageDialog(null, "Saliendo del programa");
                        } else {
                            JOptionPane.showMessageDialog(null, "Código incorrecto");
                        }
                    } while (!codigoDulce.equals("m1")
                            && !codigoDulce.equals("p1")
                            && !codigoDulce.equals("t1")
                            && !codigoDulce.equals("t2")
                            && !codigoDulce.equals("m2")
                            && !codigoDulce.equals("salir"));

                    if (!codigoDulce.equals("salir")){
                    do {
                                precioMateriaPrima = Double.parseDouble(
                                        JOptionPane.showInputDialog(
                                                "¿Cuál es el precio de la materia prima que "
                                                + "se gasta en fabricar una unidad "
                                                + "de este tipo?"));

                                if (precioMateriaPrima >= LIMITE_INFERIOR1
                                        && precioMateriaPrima <= LIMITE_SUPERIOR1) {
                                    JOptionPane.showMessageDialog(null, "Precio materia prima correcto");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Precio materia prima incorrecto");
                                }

                            } while (precioMateriaPrima < LIMITE_INFERIOR1
                                    || precioMateriaPrima > LIMITE_SUPERIOR1);

                            do {
                                costeManoObra = Double.parseDouble(
                                        JOptionPane.showInputDialog(
                                                "¿Cuál es el coste de la mano de obra"));

                                if (costeManoObra >= LIMITE_INFERIOR2
                                        && costeManoObra <= LIMITE_SUPERIOR2) {
                                    JOptionPane.showMessageDialog(null, "Coste mano de obra correcto");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Coste mano de obra incorrecto");
                                }
                            } while (costeManoObra < LIMITE_INFERIOR2
                                    || costeManoObra > LIMITE_SUPERIOR2);
                                // Si es válido sigue el algoritmo
                                costeProduccion
                                        = precioMateriaPrima + costeManoObra;
                                // Calculamos precio de venta unitario
                                precioVentaUnitario
                                        = switch (codigoDulce) {
                                    // Si es "M1", "M2", "P1" es 50%
                                    case "m1", "m2", "p1" ->
                                        costeProduccion
                                        + (costeProduccion
                                        * PORCENTAJE_M1_M2_P1);
                                    // Si no, es 65%
                                    default ->
                                        costeProduccion
                                        + (costeProduccion
                                        * PORCENTAJE_T1_T2);

                                };

                                // Calculamos las unidades que tenemos 
                                // que vender para ganar al menos 2500€
                                cantidadUnidades
                                        = (int) Math.ceil((BENEFICIOS_MINIMOS
                                                / (precioVentaUnitario
                                                - costeProduccion)));

                                JOptionPane.showMessageDialog(
                                        null, """
                                        El precio de la materia prima que se gasta 
                                        en fabricarlo: %.2f €
                                        El coste de mano de obra: %.2f €
                                        El coste de producción es %.2f €
                                        Su precio de venta unitario es %.2f €
                                        La cantidad de unidades necesaria para 
                                        ganar al menos 2500 € es %d
                   
                                        """.formatted(precioMateriaPrima,
                                                costeManoObra,
                                                costeProduccion,
                                                precioVentaUnitario,
                                                cantidadUnidades));

                                // Si no es válido, se repite el bucle
                            
                } else {
            break;
            }}
                    
                case "salir", "2" ->
                    JOptionPane.showMessageDialog(null,
                            "Saliendo del programa");
                // Si es cualquier otra opción, se repite el bucle
                // Si la opción es 1, sigue el algoritmo

                // FILTRAMOS CÓDIGOS
                default ->
                    JOptionPane.showMessageDialog(null,
                            "Código incorrecto");
            }
            // Si la opción es 1, sigue el algoritmo
            // FILTRAMOS CÓDIGOS

        } while (!opcion.equals("2") && !opcion.equals("salir")
                && !codigoDulce.equals("salir"));

    }

}
