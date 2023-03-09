/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioRepaso;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author nerea
 */
public class Main {
    
    public static void main(String[] args) {
        
        Silla s1 = new Silla(12, "Silla1");
        Silla s2 = new Silla(83, "ASilla2");
        Silla s3 = new Silla(23, "Silla3");
        Silla s4 = new Silla(42, "ZSilla4");
        Silla s5 = new Silla(16, "4Silla5");
        
        Map<Silla, Double> map = new TreeMap<>();
        
        map.put(s1, s1.getPeso());
        map.put(s2, s2.getPeso());
        map.put(s3, s3.getPeso());
        map.put(s4, s4.getPeso());
        map.put(s5, s5.getPeso());
        
        map.forEach((key, value) -> System.out.println("key: " +
                key + ", value: " + value));
        
        
        List<Silla> listaSillas = new ArrayList<>();
        
        listaSillas.add(s1);
        listaSillas.add(s2);
        listaSillas.add(s3);
        listaSillas.add(s4);
        listaSillas.add(s5);
        
        System.out.println("Lista de sillas, según orden de inserción");
        listaSillas.forEach(s -> System.out.println("Nombre: " + s.getNombre()));
        
        System.out.println("Lista de sillas, según orden orden natural");
        Collections.sort(listaSillas);
        listaSillas.forEach(s -> System.out.println("Nombre: " + s.getNombre()));
        
        System.out.println("Lista de sillas, según peso");
//        CriterioPeso criterio = new CriterioPeso();
        // criterio es de tipo CriterioPeso, Object, Comparator
        // cuando una clase implementa una interfaz,
        // la clase se vuelve objeto de la interfaz
//        Collections.sort(listaSillas, criterio);

        // Si tuviesemos 30 criterios habría que crear 30 clases
        // Para ahorrarnos eso, podemos crear la clase directamente en el método
//        Collections.sort(listaSillas, new Comparator<Silla>() {
//            @Override
//            public int compare(Silla o1, Silla o2) {
//                return Double.compare(o1.getPeso(), o2.getPeso());
//            }
//        });
        
        // Como esto sigue siendo horrible, utilizamos lambda
        Collections.sort(listaSillas, (o1,o2) -> Double.compare(o1.getPeso(), o2.getPeso()));
        
        listaSillas.forEach(s -> System.out.println("Peso: " + s.getPeso()));
        
    }
    
}
