/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package nerea;

/**
 *
 * @author Nerea
 */
public class Supermercado {

    public static void main(String[] args) {
        
        // Creamos productos con distintos tipos de iva
        // Iva 4%
        Producto agua = new Producto("Agua     ", 3, 1, Iva.CUATRO);
        Producto fanta = new Producto("Fanta    ", 2, 1.20, Iva.CUATRO);
        Producto cocacola = new Producto("Cocacola ", 2, 1.40, Iva.CUATRO);
        // Iva 10%
        Producto aguacate = new Producto("Aguacate ", 4, 0.77, Iva.DIEZ);
        Producto limon = new Producto("Limon    ", 6, 2.35, Iva.DIEZ);
        // Iva 21%
        Producto patata = new Producto("Patata   ", 9, 0.82, Iva.VEINTIUNO);
        Producto berenjena = new Producto("Berenjena", 1, 2.45, Iva.VEINTIUNO);
        Producto pan = new Producto("Pan      ", 3, 0.92, Iva.VEINTIUNO);
        Producto tortilla = new Producto("Tortilla ", 1, 3.33, Iva.VEINTIUNO);
        Producto platano = new Producto("Plátano  ", 1, 0.67, Iva.VEINTIUNO);
        
        // Creamos una caja
        Caja caja1 = new Caja();
        
        // Añadimos cada producto a la cinta
        caja1.getCinta().ponerProducto(agua);
        caja1.getCinta().ponerProducto(patata);
        caja1.getCinta().ponerProducto(berenjena);
        caja1.getCinta().ponerProducto(fanta);
        caja1.getCinta().ponerProducto(limon);
        caja1.getCinta().ponerProducto(pan);
        caja1.getCinta().ponerProducto(aguacate);
        caja1.getCinta().ponerProducto(cocacola);
        caja1.getCinta().ponerProducto(tortilla);
        caja1.getCinta().ponerProducto(platano);
        
//        caja1.getCinta().quitarProducto(fanta);
//        
//        System.out.println(caja1.getCinta().cintaVacia());
        
        // Generamos un ticket con los productos de la caja 1
        Ticket ticket1 = generarTicket(caja1);
        
        // Imprimimos el ticket generado
        ticket1.imprimirTicket();
        
    }
    
    // Métodos
    // Genera un ticket según los objetos de la cinta de la caja insertada
    public static Ticket generarTicket(Caja caja){
        return caja.generarTicket();
    }
    
}