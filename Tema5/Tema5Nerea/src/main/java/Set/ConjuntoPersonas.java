/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Set;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author nerea
 */
public class ConjuntoPersonas {

    public static void main(String[] args) {
        // Una HashSet no permite duplicados
        // Es necesario que Persona tenga los métodos equals y hashcode 
        Set<Persona> juntaDirectiva = new HashSet<>();

        // Se añaden elmentos al set
        juntaDirectiva.add(new Persona("12345678A", "Pepe", "Perez", LocalDate.of(1990, 1, 2)));
        juntaDirectiva.add(new Persona("23456789B", "Juan", "Martínez", LocalDate.of(1991, 2, 3)));
        juntaDirectiva.add(new Persona("34567890C", "Ana", "Ramírez", LocalDate.of(1992, 3, 4)));
        juntaDirectiva.add(new Persona("45678901D", "María", "López", LocalDate.of(1993, 4, 5)));

        //Si tratamos de añadir un elemento repetido...
        //El set queda como estaba y el método devuelve false
        juntaDirectiva.add(new Persona("45678901D", "María", "López", LocalDate.of(1993, 4, 5)));
        //Comprobamos que al listarlos todos, no aparece duplicado
        //No hay orden aparente, ni siquiera el orden de inserción
        for (Persona p : juntaDirectiva) {
            System.out.println(p);
        }
        juntaDirectiva.add(new Persona("33678551D", "Lucas", "Vázquez", LocalDate.of(1988, 12, 5)));

        System.out.printf("Ahora el set contiene %d elementos", juntaDirectiva.size());
        System.out.println("------------------");

        juntaDirectiva.forEach(System.out::println);

        juntaDirectiva.remove(new Persona("45678901D", "María", "López", LocalDate.of(1993, 4, 5)));

        System.out.println("----- Después del borrado de María López ------------");
        juntaDirectiva.forEach(System.out::println);
    }

}
