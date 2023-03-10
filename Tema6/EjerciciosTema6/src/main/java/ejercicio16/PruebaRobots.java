/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 *
 * @author nerea
 */
public class PruebaRobots {
    
    public static void main(String[] args) {
        
        List<Robot> lista = generarListaAleatoriaRobots();
        lista.forEach(System.out::println);
        Collections.sort(lista, (o1, o2) -> Integer.compare(o1.getPorcentajeVida(), o2.getPorcentajeVida()));
        System.out.println("---------------------------------------");
        System.out.println("Lista ordenada según porcentaje de vida");
        lista.forEach(System.out::println);
    }
    
    public static List<Robot> generarListaAleatoriaRobots(){
        List<Robot> lista = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            lista.add(new Robot(new Random().nextInt(1, Integer.MAX_VALUE)));
        }
        return lista;
    }
    
}
