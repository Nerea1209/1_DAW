/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuraNerea;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author nerea
 */
public class Geometria {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        // Conjunto de figuras con dos objetos de cada tipo

        Set<Figura> figuras = new HashSet<>();
        figuras.add(new Triangulo(new Point(3, 0), new Point(2, 4), 3, 4, "1", "morado"));
        figuras.add(new Circulo(5, "6", "amarillo"));
        figuras.add(new Rectangulo(new Point(2, 0), new Point(0, 3), new Point(2, 3), 2, 3, "4", "morado"));
        figuras.add(new Circulo(3, "5", "rojo"));
        figuras.add(new Rectangulo(new Point(4, 0), new Point(0, 6), new Point(4, 6), 4, 6, "3", "azul"));
        figuras.add(new Triangulo(new Point(5, 0), new Point(3, 3), 5, 3, "2", "amarillo"));

        // Muestro los datos de las figuras usando un foreach, 
        // mostrando también el área de cada una.
        for (Figura figura : figuras) {
            System.out.println(figura.toString() + ", cuya área es " + figura.area());
        }
        System.out.println("");

        // Lista a partir del conjunto de figuras.
        List<Figura> listaFiguras = new ArrayList<>(figuras);

        // Ordeno la lista de figuras por color y por id, 
        // haciendo uso de <<Comparator>> y una expresión lambda. 
        Comparator<Figura> criterioColor = (o1, o2) -> o1.getColor().compareToIgnoreCase(o2.getColor());
        Comparator<Figura> criterioColorID = criterioColor
                .thenComparing((o1, o2) -> o1.getId().compareToIgnoreCase(o2.getId()));
        Collections.sort(listaFiguras, criterioColorID);

        // Muestro la lista de figuras ordenadas.
        System.out.println("Lista de figuras ordenadas por color y por id");
        listaFiguras.forEach(System.out::println);
        System.out.println("");

        // Solicito al usuario por teclado que introduzca un id de una figura. 
        System.out.println("Introduzca el id de la figura a buscar: ");
        String idFigura = teclado.nextLine();
//        System.out.println(listaFiguras.contains(new Circulo(0,
//                idFigura, "")));
        // Búsqueda binaria según el id introducido, 
        // mostrando la posición que ocupa en la lista, si existe.
        Figura figuraABuscar = new Circulo(0,idFigura, "");
        int pos = Collections.binarySearch(listaFiguras, figuraABuscar, (o1, o2) -> o1.getId().compareToIgnoreCase(o2.getId()) );
        System.out.println("La figura a buscar con id " + idFigura + " se encuentra en la posición "
        + pos + " de la lista de figuras");

        // Recorre la lista de figuras y guarda en una nueva lista todas 
        // aquellas que sean dibujables, en otra todas aquellas que sean 
        // movibles y aquellas que sean Comparable. 
        List<Dibujable> dibujables = new ArrayList<>();
        List<Movible> movibles = new ArrayList<>();
        List<Comparable> comparables = new ArrayList<>();
        for (Figura figura : listaFiguras) {
            if (figura instanceof Movible movible) { // Conversión explícita e implícita
                movibles.add(movible);
                // Los rectángulos pueden ser movibles y dibujables al mismo tiempo
                if (movible instanceof Dibujable dibujable) { // Conversión explícita e implícita
                    dibujables.add(dibujable);
                }
            } else { // Ya que solo quedarían los triangulos que son comparables
                Comparable comparable = (Comparable) figura; // Conversión explícita
                comparables.add(comparable);
            }
        }

        // Comprobamos las listas
        System.out.println("Lista de dibujables");
        dibujables.forEach(System.out::println);
        System.out.println("");
        System.out.println("Lista de movibles");
        movibles.forEach(System.out::println);
        System.out.println("");
        System.out.println("Lista de comparables");
        comparables.forEach(System.out::println);
        System.out.println("");

        // Recorre la lista de objetos Dibujable y 
        // llama al método dibujar de cada uno.
        for (Dibujable dibujable : dibujables) {
            if (dibujable instanceof Rectangulo rectangulo) { // Conversión explícita e implícita
                rectangulo.dibujar();
                System.out.println("");
            }

        }

        // Recorre la lista de objetos Movible y 
        // mueve a la derecha dos unidades aquellos objetos Rectángulo y 
        // tres unidades arriba los objetos Circulo.
        for (Movible movible : movibles) {
            if (movible instanceof Rectangulo rectangulo) { // Conversión explícita e implícita
                rectangulo.moverDer(2);
            } else { // Ya que si no son rectangulos, son circulos
                Circulo circulo = (Circulo) movible; // Conversión explícita
                circulo.moverArr(3);
            }
        }

        // Compruebo si se han movido bien las figuras
        System.out.println("Lista de movibles movidas");
        movibles.forEach(System.out::println);

    }

}
