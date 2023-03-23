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
        System.out.println("Lista de productos");
        productos.forEach(System.out::println);
        System.out.println("");

        // Ordeno la lista de productos según el precio, 
        // haciendo uso de <<Comparator>> y una expresión lambda. 
        Collections.sort(productos,
                (o1, o2) -> Double.compare(o1.getPrecio(), o2.getPrecio()));

        // Muestra la lista de productos ordenados por precio.
        System.out.println("Lista de productos ordenadas por precio");
        productos.forEach(System.out::println);
        System.out.println("");

        // Ordeno la lista de productos según el codigo, 
        // haciendo uso de <<Comparator>> y una expresión lambda. 
        Collections.sort(productos,
                (o1, o2) -> Double.compare(o1.getCodigo(), o2.getCodigo()));

        // Muestra la lista de productos ordenados por codigo.
        System.out.println("Lista de productos ordenada por código");
        productos.forEach(System.out::println);
        System.out.println("");

        // Realiza la búsqueda binaria, según su código, de algún producto 
        // que exista dentro de la lista y otro que no exista, 
        // mostrando la posición que ocupa en la lista.
        
        // Producto que existe
        int pos1 = Collections.binarySearch(productos, productoABuscar,
                (o1, o2) -> Double.compare(o1.getCodigo(), o2.getCodigo()));

        System.out.println("El producto a buscar " + productoABuscar
                + " se encuentra en la posición " + pos1 + " de la lista de productos.");
        System.out.println("");

        // Producto que no existe
        int pos2 = Collections.binarySearch(productos, new Pantalon(Talla.L, Marca.ZARA, 80, 67, 3, ""),
                (o1, o2) -> Double.compare(o1.getCodigo(), o2.getCodigo()));

        System.out.println("El producto a buscar " + productoABuscar
                + " se encuentra en la posición " + pos2 + " de la lista de productos.");
        System.out.println("");
        
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
        System.out.println("");
        
        // Ordena los libros según ISBN, haciendo uso de <<Comparable>>. 
        Collections.sort(libros);
        // Muestra la lista de libros ordenada. 
        System.out.println("Lista de libros ordenados por isbn");
        libros.forEach(System.out::println);
        System.out.println("");
        
        // Recorre de nuevo la lista de libros y en cada iteración, 
        // ejecuta enviar() o descargar() en función del tipo de libro.     
        
        // DUDA: Si he usado anteriormente un iterator
        // y lo quiero volver a utilizar, ¿cómo hago que empiece desde el principio
        // a recorrer la lista?
        for (Libro libro : libros) {
            if (libro instanceof LibroPapel libroPapel) { // Explícita e implícita
                libroPapel.enviar(RandomStringUtils.randomAlphabetic(5));
            } else {
                LibroDigital libroDigital = (LibroDigital) libro; // Explícita
                libroDigital.descargar();
            }
        }
        System.out.println("");
        
        // Utiliza el método contains(Object) sobre la lista de 
        // libros para comprobar si existe un libro o no existe.
        
        // Libro que existe
        System.out.println("¿El libro " + productoABuscar + " está en la lista de productos?");
        System.out.println(libros.contains(productoABuscar));
        System.out.println("");
        
        // Libro que no existe
        Libro key = new LibroDigital(0, "1", 90, 0, 0, "");
        System.out.println("¿El libro " + key + " está en la lista de productos?");
        System.out.println(libros.contains(key));
        System.out.println("");

        // Usando la lista de productos inicial, 
        // crea una nueva lista con todos los objetos que Se Envian.
        List<SeEnvia> enviados = new ArrayList<>();
        for (Producto p : productos) {
            if (p instanceof SeEnvia seEnvia) {
                enviados.add(seEnvia);
            }
        }
        System.out.println("");
        
        // Mostramos la lista de enviados para comprobarlo
        System.out.println("Lista de productos enviados");
        enviados.forEach(System.out::println);
        System.out.println("");

        // Recorre la lista de objetos que Se Envian y llama 
        // al método de la interfaz.
        for (SeEnvia enviado : enviados) {
            enviado.enviar(RandomStringUtils.randomAlphabetic(5));
        }
        System.out.println("");
        
        // Inventa un método abstracto en Libro que tenga 
        // comportamientos diferentes en las subclases. 
        // Implementa los métodos en las clases hijas.
        for (Libro libro : libros) {
            libro.pasarPagina();
        }
        
        

    }

}
