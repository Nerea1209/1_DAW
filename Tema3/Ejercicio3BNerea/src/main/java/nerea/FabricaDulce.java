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
public class FabricaDulce {

    /* La fábrica de dulces "La Esteponera Turronera" produce algunos de 
    estos manjares con los siguientes códigos: M1 (Mantecados de Limón), 
    P1 (Polvorones), T1 (Turrón de chocolate), T2 (Turrón clásico) y M2 (Mazapanes).
    Cada especialidad tiene un coste de producción que se calcula según 
    la materia prima gastada y la mano de obra empleada en producir una unidad 
    (coste producción = materia prima + mano de obra). El coste de la mano de 
    obra para producir unidades con código M1 y T1 supone 0.15€; para los que 
    tienen código M2, T2 y P1, supone 0.22€.
    Además, cada producto tiene un precio de venta que se calcula en función 
    del coste de producción.
    Hay que tener en cuenta lo siguiente:
    Artículos M1, M2 y P1. 
    Precio de venta unitario = coste de producción + 50 % del coste de producción
    Resto de artículos. 
    Precio de venta unitario = coste de producción + 65 % del coste de producción
    La fábrica necesita un programa que realice algunos cálculos para ver 
    si es rentable vender un tipo de producto. El programa debe solicitar 
    el código de un dulce (si el código no es válido, el programa termina 
    informando de que no existe el código introducido) y el precio de la 
    materia prima que se gasta en fabricar una unidad de ese tipo (siempre 
    entre 0.1€ y 1€, en otro caso el programa terminará indicando que el 
    precio de la materia prima no es correcto). Se debe mostrar el coste 
    de producción unitario y precio de venta unitario. Además debe calcular 
    y mostrar el número de unidades a producir para que haya un beneficio 
    de al menos 2500€.
    Todas las entradas y salidas de datos deben hacerse usando JOptionPane. 
    Limita la salida a dos decimales en los casos necesarios.*/
    
    public static void main(String[] args) {
        
        // CONSTANTES
        
        final double PRECIO_MANO_OBRA1 = 0.15;
        final double PRECIO_MANO_OBRA2 = 0.22;
        final double PORCENTAJE1 = ((double) 50 / 100);
        final double PORCENTAJE2 = ((double) 65 / 100);
        final int BENEFICIOS_MINIMOS = 2500;

        // MENÚ
        
        String codigoDulce = JOptionPane.showInputDialog(
                """
                ***********CÓDIGO DE DULCES***********
                
                M1 -> Mantecados de Limón
                P1 -> Polvorones
                T1 -> Turrón de chocolate
                T2 -> Turrón clásico
                M2 -> Mazapanes
                
                **************************************
                Introduce un código:
                   """);
      
        
        switch (codigoDulce) {
            
            // Si el código es válido ejecuta lo siguiente:
            
            case "M1","P1","T1","T2","M2" -> {
                // Pide el precio de la materia prima
                double precioMateriaPrima = Double.parseDouble(
                        JOptionPane.showInputDialog(
                        "¿Cuál es el precio de la materia prima que se gasta "
                        + "en fabricar una unidad de este tipo?"));
                
                // Si el precio está entre 0.1 y 1, ejecuta lo siguiente:
                if (precioMateriaPrima >= 0.1 && precioMateriaPrima <= 1) {
                    // Muestra por pantalla el precio usando JOptionPane
                    JOptionPane.showMessageDialog(null,"""
                                                                            
                            El precio de la materia prima es %.2f € """.
                            formatted(precioMateriaPrima));
                    // Calculamos el coste de producción
                    double costeProduccion = switch (codigoDulce) {
                        // Si es "M1", "T1" el precio de mano de obre es 0.15
                        case "M1", "T1" ->
                            precioMateriaPrima + PRECIO_MANO_OBRA1;
                        // Si no, el precio de mano de obra es 0.22
                        default ->
                            precioMateriaPrima + PRECIO_MANO_OBRA2;
                    };
                    
                    // Calculamos precio de venta unitario
                    double precioVentaUnitario = switch (codigoDulce) {
                        // Si es "M1", "M2", "P1" el porcentaje es 50%
                        case "M1", "M2", "P1" ->
                            costeProduccion + (costeProduccion * PORCENTAJE1);
                        // Si no, es 65%
                        default ->
                            costeProduccion + (costeProduccion * PORCENTAJE2);
                    };
                    
                    // Calculamos las unidades que tenemos que vender para
                    // ganar al menos 2500€
                    int cantidadUnidades = (int) Math.ceil((BENEFICIOS_MINIMOS / 
                            (precioVentaUnitario - costeProduccion)));
                    
                    // Mostramos por pantalla el coste de producción,
                    // su precio unitario y la cantidad de unidades que
                    // necesitamos verder para ganar 2500 como mínimo
                    JOptionPane.showMessageDialog(null, """
                        El coste de producción es %.2f €
                        Su precio unitario es %.2f €
                        La cantidad de unidades necesaria 
                        para ganar al menos 2500 € es %d
                        """.formatted(costeProduccion, 
                                precioVentaUnitario, 
                                cantidadUnidades));
                
                } else {
                    // Si el precio no está entre 0.1 y 1 termina el programa
                    // informando que el precio no es correcto
                    JOptionPane.showMessageDialog(null,
                            "El precio de la materia prima no es "
                                    + "correcto.");
                }
            }
            
            // Si el código no es válido, el programa termina 
            // informando de que no existe el código introducido
            
            default ->
                JOptionPane.showMessageDialog(null, 
                        "No existe el código introducido");

        }
    }
}
