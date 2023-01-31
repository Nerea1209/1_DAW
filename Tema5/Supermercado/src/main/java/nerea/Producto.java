/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package nerea;

/**
 *
 * @author Nerea
 */

// Creamos clase record porque una vez creado el producto no va a cambiar su estado
public record Producto(String nombre, int cantidadAComprar, double precio ,Iva iva) {
    
    // Métodos
    // Precio del producto según su cantidad sin IVA
    public double precioTotalProductoSinIva(){
        return cantidadAComprar * precio;
    }
    
    // Precio del producto según su cantidad con IVA
    public double precioTotalProductoConIva(){
        return (cantidadAComprar * precio) + precio * iva.getValor();
    }
    
    // Para imprimir cada producto formato ticket
    public String imprimirProducto() {
        StringBuilder sb = new StringBuilder();
        sb.append(nombre).append("      ");
        // Para imprimir con dos decimales
        sb.append(String.format("%.2f", precio)).append("€          ");
        sb.append(cantidadAComprar).append("          ");
        // Para imprimir dos dígitos
        sb.append(String.format("%2d", iva.getValor())).append("%           ");
        sb.append(String.format("%.2f", precioTotalProductoSinIva())).append("€");
        return sb.toString();
    }
}
