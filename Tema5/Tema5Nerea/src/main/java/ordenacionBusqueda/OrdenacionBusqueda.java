/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenacionBusqueda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author nerea
 */
public class OrdenacionBusqueda {
    public static void main(String[] args) {
        List<Pais> paises = new ArrayList<>();
        paises.add(new Pais("España", 47, 505_400, "Euro"));
        paises.add(new Pais("Portugal", 23, 23_400, "Euro"));
        paises.add(new Pais("Estados Unidos", 146, 1_505_400, "Dólar Americano"));
        paises.add(new Pais("Italia", 47, 505_400, "Euro"));
        
        paises.forEach(System.out::println);
        System.out.println("-----------------------");
        // Ordenar usando orden natural (requiere que pais implemente comparable)
        Collections.sort(paises);
        paises.forEach(System.out::println);
        System.out.println("-----------------------");
        // Ordenación por poblacion usando comparator(proporcionamos el criterio
        // mediante una lambda)
        Comparator<Pais> criterioPoblacion = (p1,p2)->Long.compare(p1.getPoblacion(), p2.getPoblacion());
        Collections.sort(paises, criterioPoblacion);
        paises.forEach(System.out::println);
        System.out.println("------------------------");
        
        // Si queremos ordenarlo por poblacion pero del reves
        Collections.sort(paises, criterioPoblacion.reversed());
        paises.forEach(System.out::println);
        System.out.println("------------------------");
        
        // Ordenación por superficie
        Comparator<Pais> criterioSuperficie = (p1,p2)->Long.compare(p1.getSuperficie(), p2.getSuperficie());
        Collections.sort(paises, criterioPoblacion);
        paises.forEach(System.out::println);
        
        // Ordenacion por superficie, si tiene misma superficie, ordena por nombre
        System.out.println("------------------------");
        Comparator<Pais> criterioNombre = (p1, p2) -> p1.getNombre().compareToIgnoreCase(p2.getNombre());
        Collections.sort(paises, criterioSuperficie.thenComparing(criterioNombre));
        paises.forEach(System.out::println);
        
        // Búsqueda por orden natural (por nombre)
        // La lista donde buscar la informacion debe estar ordenada previamente
        // según el criterio de orden natural (nombre) --> Comparable en País
        Collections.sort(paises);
        System.out.println("-------------Búsqueda binaria-----------------");
        System.out.println("Lista ordenada según orden natural (nombre) ----");
        paises.forEach(System.out::println);
        Pais objetoBuscar = new Pais();
        objetoBuscar.setNombre("Portugal"); // Lista ordenada por nombre, busqueda por nombre, key es nombre
        int posicion = Collections.binarySearch(paises, objetoBuscar);
        System.out.println("Portugal está en la posición " + posicion);
        
        // Si intento buscar en la lista con un valor que no es nombre se puede obtener
        // una posición errónea
        objetoBuscar = new Pais();
        objetoBuscar.setPoblacion(23);
        
       posicion = Collections.binarySearch(paises, objetoBuscar);
        System.out.println("Portugal está en la posición " + posicion);
        
        // Si ordeno la lista por un criterio y busco por otro, el resultado es inesperado
        
        System.out.println("-------- Ordenación y búsqueda por poblacion -----");
        // Antes de usar binarySearch por poblacion, la lista debe estar ordenada por poblacion
        Collections.sort(paises, criterioPoblacion);
        paises.forEach(System.out::println);
        objetoBuscar = new Pais();
        objetoBuscar.setPoblacion(146);
        posicion = Collections.binarySearch(paises, objetoBuscar, criterioPoblacion);
        System.out.println("El país que tiene 146 millones es " + paises.get(posicion));
    }
    
    public static void ordenNatural(List<Pais> paises){
        Collections.sort(paises);
    }
    
    public static void ordenCriterio(List<Pais> paises, Comparator<Pais> criterio){
        Collections.sort(paises, criterio);
    }
    
    public static void ordenCriterioReves(List<Pais> paises, Comparator<Pais> criterio){
        Collections.sort(paises, criterio.reversed());
    }
    
    public static int busquedaBinariaNatural(List<Pais> paises, String nombre){
        ordenNatural(paises);
        Pais objetoBuscar = new Pais();
        objetoBuscar.setNombre(nombre); // Lista ordenada por nombre, busqueda por nombre, key es nombre
        int posicion = Collections.binarySearch(paises, objetoBuscar);
        return posicion;
    }
    
    
    

   
    
}