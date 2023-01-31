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
public class Ejercicio3ENerea {

    public static void main(String[] args) {

/*En un nuevo proyecto llamado Ejercicio3E+tunombre realiza las siguientes 
modificaciones sobre el ejercicio de la fábrica de dulces.
El programa debe tener dos opciones, la primera es realizar los cálculos para 
ver la viabilidad de los productos y la segunda debe ser “terminar”. 
Para terminar el programa el usuario debe escribir la palabra Salir 
(ignorando mayúsculas y minúsculas). En caso de escribir otra cosa, 
el programa volverá al menú principal.
El programa debe filtrar los códigos de los productos. En caso de introducir 
un código inexistente, el programa preguntará de nuevo por el código 
a introducir. Si el usuario escribe Salir (ignorando mayúsculas y 
minúsculas) el programa termina.
También se debe filtrar el precio de la materia prima. En caso de que el 
usuario introduzca un número fuera del rango, el programa debe 
solicitarlo de nuevo.
En este ejercicio también se debe solicitar el coste de la mano de obra 
para ese producto (siempre entre 0.5€ y 0.9€). En caso de error al 
introducir este dato, el programa solicitará de nuevo esta información.
El resto de restricciones son las mismas que en el ejercicio 3B, pero intenta 
aplicar las posibles correcciones del ejercicio que hicimos en clase, 
para que tu código no sea tan repetitivo y sea más legible.
Incluye comentarios en el código que permiten leer mejor tu programa.

Sube el archivo ZIP con el proyecto.*/

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
        String codigoDulce;
        double precioMateriaPrima;
        double costeManoObra;
        double costeProduccion;
        double precioVentaUnitario;
        int cantidadUnidades;
        
        
        // PROCESO
        
        //FILTRAMOS OPCIONES
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

            if (opcion.equals("1")) {
                // Si la opción es 1, sigue el algoritmo
                
                // FILTRAMOS CÓDIGOS
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
                    
                    // Pasamos todo en minúsculas para ignorar las mayúsculas
                    // y minúsculas
                    codigoDulce = codigoDulce.toLowerCase();

                    if (codigoDulce.equals("m1")
                        || codigoDulce.equals("p1")
                        || codigoDulce.equals("t1")
                        || codigoDulce.equals("t2")
                        || codigoDulce.equals("m2")) {
                        
                        // FILTRAMOS PRECIO DE MATERIA PRIMA
                        // Si el código es correcto, sigue el algoritmo
                        do {
                            precioMateriaPrima = Double.parseDouble(
                                JOptionPane.showInputDialog(
                                "¿Cuál es el precio de la materia prima que "
                                        + "se gasta en fabricar una unidad "
                                        + "de este tipo?"));
                            
                            if (precioMateriaPrima >= LIMITE_INFERIOR1
                                && precioMateriaPrima <= LIMITE_SUPERIOR1) {
                                
                                // FILTRAMOS COSTE DE MANO DE OBRA
                                // Si es válido sigue el algoritmo
                                do {
                                    costeManoObra = Double.parseDouble(
                                    JOptionPane.showInputDialog(
                                    "¿Cuál es el coste de la mano de obra"));
                                    
                                    if (costeManoObra >= LIMITE_INFERIOR2
                                        && costeManoObra <= LIMITE_SUPERIOR2) {
                                        
                                        // Si es válido sigue el algoritmo
                                        costeProduccion = 
                                            precioMateriaPrima + costeManoObra;
                                        // Calculamos precio de venta unitario
                                        precioVentaUnitario = 
                                            switch (codigoDulce) {
                                            // Si es "M1", "M2", "P1" es 50%
                                                case "m1", "m2", "p1" ->
                                                costeProduccion + 
                                                (costeProduccion * 
                                                PORCENTAJE_M1_M2_P1);
                                            // Si no, es 65%
                                            default ->
                                                costeProduccion + 
                                                (costeProduccion * 
                                                PORCENTAJE_T1_T2);

                                        };
                                        
                                        // Calculamos las unidades que tenemos 
                                        // que vender para ganar al menos 2500€
                                        cantidadUnidades = 
                                            (int) Math.ceil((BENEFICIOS_MINIMOS
                                            / (precioVentaUnitario - 
                                            costeProduccion)));

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
                                        JOptionPane.showMessageDialog(
                                        null,
                                        "Coste fuera del rango");
                                    }

                                } while (costeManoObra < LIMITE_INFERIOR2
                                        || costeManoObra > LIMITE_SUPERIOR2);
                                
                                // Si no es válido, se repite el bucle
                            } else {
                                JOptionPane.showMessageDialog(null,
                                "Precio fuera del rango");
                            }

                        } while (precioMateriaPrima < LIMITE_INFERIOR1
                                || precioMateriaPrima > LIMITE_SUPERIOR1);

                        // Si escribe salir, sale del programa
                    } else if (codigoDulce.equals("salir")) {
                        JOptionPane.showMessageDialog(null,
                                "Saliendo del programa");
                        
                        // Si es incorrecto, se repite el bucle
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Código incorrecto");
                    }

                } while (!codigoDulce.equals("m1")
                        && !codigoDulce.equals("p1")
                        && !codigoDulce.equals("t1")
                        && !codigoDulce.equals("t2")
                        && !codigoDulce.equals("m2")
                        && !codigoDulce.equals("salir"));
                
                // Si escribe salir o la opción es 2 sale del programa
            } else if (opcion.equals("salir") || opcion.equals("2")) {
                JOptionPane.showMessageDialog(null,
                        "Saliendo del programa");
                
                // Si es cualquier otra opción, se repite el bucle
            } else {
                JOptionPane.showMessageDialog(null,
                        "Código incorrecto");
            }

        } while (!opcion.equals("2") && !opcion.equals("salir"));
    }
}
