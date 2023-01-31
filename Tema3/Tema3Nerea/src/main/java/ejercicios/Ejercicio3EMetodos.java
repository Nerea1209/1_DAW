/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.InputMismatchException;
import javax.swing.JOptionPane;

/**
 *
 * @author nerea
 */
public class Ejercicio3EMetodos {

    /*
    MÉTODOS
    1. mostrarMenuInicial
    2. leerCodigos
    3. filtrarCodigos
    4. leerMateriaPrima
    5. filtrarMateriaPrima
    6. leerManoObra
    7. filtrarManoObra
    8. calcularCosteProduccion
    9. calcularPrecioVentaUnitario
    10. calcularUnidadesBeneficio
     */
    
    public static final double LIMITE_INFERIOR1 = 0.1;
    public static final double LIMITE_SUPERIOR1 = 1;
    public static final double LIMITE_INFERIOR2 = 0.5;
    public static final double LIMITE_SUPERIOR2 = 0.9;
    
    public static void main(String[] args) {
        
        // VARIABLES
        String opcion = "";
        String codigoProducto = "";
        double precioMateriaPrima = 0;
        double costeManoObra = 0;
        double costeProduccion = 0;
        double porcentaje = 0;
        double precioVentaUnitario = 0;
        int cantidadUnidades = 0;
        
        // CONSTANTES
        final int BENEFICIOS_MINIMOS = 2500;
        
        
        
        do {
            opcion = pedirOpcion();

            if ((!opcion.equalsIgnoreCase("salir")) && 
                (!opcion.equalsIgnoreCase("2"))) {
                codigoProducto = pedirCodigoProducto();

                if ((!codigoProducto.equalsIgnoreCase("salir")) && 
                        (!opcion.equalsIgnoreCase("2"))) {
                    
                    precioMateriaPrima = pedirPrecioMateriaPrima();
                    costeManoObra = pedirCosteManoObra();
                    costeProduccion = costeProduccion(precioMateriaPrima, costeManoObra);
                    porcentaje = porcentaje(codigoProducto);
                    precioVentaUnitario = precioVentaUnitario(costeProduccion, porcentaje);
                    cantidadUnidades = cantidadUnidades(
                            BENEFICIOS_MINIMOS, costeProduccion, 
                            precioVentaUnitario);

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
                    // Solicitar y filtrar mano obra
                    // Calcular coste produccion
                    // Calcular precio venta unitario
                    // Calcular unidades hasta llegar el beneficio

                    // Mostrar toda la información
                } else { // Si es salir
                    opcion = "salir";
                }
            }

        } while (opcion.equalsIgnoreCase("1"));

    }
    
    // MÉTODOS
    // Mostrar menú inicial, pedir opción y filtrarla

    public static String mostrarMenuInicial() {

        // Se pone dentro del bloque try la sentencia que puede producir 
        // el error
        String opcion = JOptionPane.showInputDialog(
                """
            __________________________________________
            -----------------OPCIONES-----------------
            1. - Ver la viabilidad de los productos.
            2. - Salir.
            __________________________________________
            Introduce una opción:                     """);

        return opcion;
    }

    public static boolean mostrarMenuInicialValida(String opcion) {

        return (opcion.equalsIgnoreCase("1") || (opcion.equalsIgnoreCase("2"))
                || (opcion.equalsIgnoreCase("salir")));
    }

    public static String pedirOpcion() {
        String opcion;
        do {
            opcion = mostrarMenuInicial();

        } while (!mostrarMenuInicialValida(opcion));
        return opcion;
    }
    
    // Mostrar menú de códigos, pedirlo y filtrarlo

    public static String mostrarMenuCodigos() {

        String texto = """
                    -----------CÓDIGO DE DULCES-----------
                     
                    M1 -> Mantecados de Limón
                    P1 -> Polvorones
                    T1 -> Turrón de chocolate
                    T2 -> Turrón clásico
                    M2 -> Mazapanes
                    --------------------------------------
                    Si desea salir escriba "salir"
                    ______________________________________
                    Introduce un código:                  
                     """;
        String opcion = JOptionPane.showInputDialog(texto);
        return opcion;
    }

    public static boolean esCodigoProductoValido(String codigo) {

        return (codigo.equalsIgnoreCase("m1")
                || codigo.equalsIgnoreCase("p1")
                || codigo.equalsIgnoreCase("t1")
                || codigo.equalsIgnoreCase("t2")
                || codigo.equalsIgnoreCase("m2")
                || codigo.equalsIgnoreCase("salir"));
    }

    public static String pedirCodigoProducto() {
        String codigo;
        do {
            codigo = mostrarMenuCodigos();

        } while (!esCodigoProductoValido(codigo));
        return codigo;
    }
    
    // Pedir materia prima y filtrarla

    public static double solicitarMateriaPrimaSinErroresBucle() {

        double precioMateriaPrima = 0;
        // Se pone dentro del bloque try la sentencia que puede producir 
        // el error
        do {
            String texto = """
                           ¿Cuál es el precio de la materia prima que se gasta 
                           en fabricar una unidad de este tipo?
                           """;
            try {
                precioMateriaPrima = Double.parseDouble(
                        JOptionPane.showInputDialog(texto));

                break;
            } catch (NumberFormatException nfe) {
                // En caso de error
                JOptionPane.showMessageDialog(null, "Precio de la materia prima no válido");

            }
        } while (true);
        return precioMateriaPrima;
    }

    public static boolean comprobarMateriaPrimaRango(double precioMateriaPrima,
            double minimo, double maximo) {

        return (precioMateriaPrima >= minimo
                && precioMateriaPrima <= maximo);

    }

    public static double pedirPrecioMateriaPrima() {
        double precioMateriaPrima;
        do {
            precioMateriaPrima = solicitarMateriaPrimaSinErroresBucle();

        } while (!comprobarMateriaPrimaRango(precioMateriaPrima, LIMITE_INFERIOR1, LIMITE_SUPERIOR1));
        return precioMateriaPrima;
    }
    
    // Pedir coste de mano de obra y filtrarlo

    public static double solicitarManoObraSinErroresBucle() {

        double costeManoObra = 0;
        // Se pone dentro del bloque try la sentencia que puede producir 
        // el error
        do {
            String texto = "¿Cuál es el coste de la mano de obra";
            try {
                costeManoObra = Double.parseDouble(
                        JOptionPane.showInputDialog(texto));
                break;
            } catch (NumberFormatException nfe) {
                // En caso de error
                JOptionPane.showMessageDialog(null, "Coste de la mano obra no válido");

            }
        } while (true);
        return costeManoObra;
    }

    public static boolean comprobarCosteManoObraRango(double costeManoObra,
            double minimo, double maximo) {
        return (costeManoObra >= minimo && costeManoObra <= maximo);
    }

    public static double pedirCosteManoObra() {
        double costeManoObra;
        
        do {
            costeManoObra = solicitarManoObraSinErroresBucle();

        } while (!comprobarCosteManoObraRango(costeManoObra, LIMITE_INFERIOR2, LIMITE_SUPERIOR2));
        return costeManoObra;
    }
    
    // Calcular el coste de producción

    public static double costeProduccion(double precioMateriaPrima, double costeManoObra) {
        return precioMateriaPrima + costeManoObra;
    }
    
    // Calcular el porcentaje de beneficio por unidad

    public static double porcentaje(String codigo) {

        double porcentaje;

        if (codigo.equalsIgnoreCase("m1")
                || codigo.equalsIgnoreCase("m2")
                || codigo.equalsIgnoreCase("p1")) {
            porcentaje = ((double) 50 / 100);

        } else {
            porcentaje = ((double) 65 / 100);
        }
        return porcentaje;
    }
    
    // Calcular el precio de venta unitario

    public static double precioVentaUnitario(double costeProduccion, double porcentaje) {
        return costeProduccion + (costeProduccion * porcentaje);
    }
    
    // Calcular la cantidad de unidades que necesitamos vender para ganar al menos 2500€
    
    public static int cantidadUnidades(int beneficiosMinimos, double costeProduccion, double precioVentaUnitario) {
        return ((int) Math.ceil((beneficiosMinimos / (precioVentaUnitario) - costeProduccion)));
    }

}
