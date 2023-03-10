/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

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
        System.out.println("¿Cuántos robots tienen el porcentaje de vida mayor del 50%? " + robotsVidaMayor50(lista));
        System.out.println("Número de serie de los tres robots que tienen mayor porcentaje de vida: ");
        imprimirNumSeries3RobotsConMayorVida(lista);
    }
    
    public static List<Robot> generarListaAleatoriaRobots(){
        List<Robot> lista = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; set.size() < 20; i++) {
            int numSerie = new Random().nextInt(1, Integer.MAX_VALUE);
            if (!set.contains(numSerie)) {
                set.add(numSerie);
                lista.add(new Robot(numSerie));
            }
            
        }
        return lista;
    }
    
    public static int robotsVidaMayor50(List<Robot> lista){
        int cont = 0;
        for (Robot robot : lista) {
            if (robot.getPorcentajeVida() > 50) {
                cont++;
            }
        }
        return cont;
    }
    
    public static void imprimirNumSeries3RobotsConMayorVida(List<Robot> lista){
        Collections.sort(lista, 
            (o1, o2) -> Integer.compare(o2.getPorcentajeVida(), o1.getPorcentajeVida()));
        for (int i = 0; i < 3; i++) {
            System.out.println(lista.get(i));
        }
    }
    
}
