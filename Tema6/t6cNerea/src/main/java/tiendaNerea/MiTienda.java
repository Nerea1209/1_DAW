/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaNerea;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author nerea
 */
public class MiTienda {

    public static void main(String[] args) {

        // Lista de productos con dos objetos de cada tipo
        List<Producto> productos = new ArrayList<>();

        productos.add(new Pantalon(Talla.L, Marca.ZARA, 0,
                20, 21, "Largo de campana, negro"));
        productos.add(new Pantalon(Talla.S, Marca.SCALPERS, 1,
                52, 21, "Cargo corto verde"));
        Producto productoABuscar = new LibroPapel(120, "a1", 2,
                14, 21, "Muy bonito");
        productos.add(productoABuscar);
        productos.add(new LibroPapel(400, "a2", 3,
                25, 21, "Muy largo"));
        productos.add(new LibroDigital(35, "b1", 4,
                6, 21, "Muy digital"));
        productos.add(new LibroDigital(60, "b2", 5,
                8, 21, "Libro corto"));
        productos.add(new Musica("The Beatles", 6, 2,
                21, "Un clásico"));
        productos.add(new Musica("ACDC", 7, 3,
                21, "sdfkjhsdifh"));

        // Muestro los datos de los productos usando un foreach
        productos.forEach(System.out::println);

        // Ordeno la lista de productos según el precio, 
        // haciendo uso de <<Comparator>> y una expresión lambda. 
        Collections.sort(productos,
                (o1, o2) -> Double.compare(o1.getPrecio(), o2.getPrecio()));

        // Muestra la lista de productos ordenados por precio.
        productos.forEach(System.out::println);

        // Ordeno la lista de productos según el codigo, 
        // haciendo uso de <<Comparator>> y una expresión lambda. 
        Collections.sort(productos,
                (o1, o2) -> Double.compare(o1.getCodigo(), o2.getCodigo()));

        // Muestra la lista de productos ordenados por codigo.
        productos.forEach(System.out::println);

        // Realiza la búsqueda binaria, según su código, de algún producto 
        // que exista dentro de la lista y otro que no exista, 
        // mostrando la posición que ocupa en la lista.
        int pos = Collections.binarySearch(productos, productoABuscar,
                (o1, o2) -> Double.compare(o1.getCodigo(), o2.getCodigo()));

        System.out.println("El producto a buscar " + productoABuscar
                + " se encuentra en la posición " + pos + " de la lista de productos.");

        // Recorre la lista de productos y guarda todos los libros 
        // en una lista de libros.
        List<Libro> libros = new ArrayList<>();
        for (Producto p : productos) {
            if (p instanceof Libro libro) {
                libros.add(libro);
            }
        }

        // Muestra los datos de la lista de libros usando un objeto Iterator. 
        System.out.println("Lista de libros");        
        Iterator<Libro> iterador = libros.iterator();
        while (iterador.hasNext()) {	
            Libro l = iterador.next();
            System.out.println(l.toString());
        }
        
        // Ordena los libros según ISBN, haciendo uso de <<Comparable>>. 
        Collections.sort(libros);
        // Muestra la lista de libros ordenada. 
        libros.forEach(System.out::println);

        
        // Recorre de nuevo la lista de libros y en cada iteración, 
        // ejecuta enviar() o descargar() en función del tipo de libro.     
        while (iterador.hasNext()) {	
            Libro l = iterador.next();
            if (l instanceof LibroPapel libroPapel) { // Explícita e implícita
                libroPapel.enviar(RandomStringUtils.randomAlphabetic(5));
            } else {
                LibroDigital libroDigital = (LibroDigital) l; // Explícita
                libroDigital.descargar();
            }
        }
        
        // Utiliza el método contains(Object) sobre la lista de 
        // libros para comprobar si existe un libro o no existe.
        System.out.println(libros.contains(productoABuscar));

        // Usando la lista de productos inicial, 
        // crea una nueva lista con todos los objetos que Se Envian.
        List<SeEnvia> enviados = new ArrayList<>();
        for (Producto p : productos) {
            if (p instanceof SeEnvia seEnvia) {
                enviados.add(seEnvia);
            }
        }

        // Recorre la lista de objetos que Se Envian y llama 
        // al método de la interfaz.
        for (SeEnvia enviado : enviados) {
            enviado.enviar(RandomStringUtils.randomAlphabetic(5));
        }
        
        // Inventa un método abstracto en Libro que tenga 
        // comportamientos diferentes en las subclases. 
        // Implementa los métodos en las clases hijas.

        
        

    }

}
