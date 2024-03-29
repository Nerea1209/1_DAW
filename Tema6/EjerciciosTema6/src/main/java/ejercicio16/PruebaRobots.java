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
        Collections.sort(lista, (o1, o2) -> Integer.compare(o1.getNumSerie(), o2.getNumSerie()));
        System.out.println("Lista ordenada según número de serie");
        lista.forEach(System.out::println);
        System.out.println("Búsqueda binaria del robot con numero de serie 3");
        int pos = Collections.binarySearch(lista, new Robot(3), 
                (o1, o2) -> Integer.compare(o1.getNumSerie(), o2.getNumSerie()));
        System.out.println("Se encuentra en la posición " + pos);
        
        System.out.println("---------------");
        
        System.out.println("Robots con más del 50% de vida");
        for (Robot robot : lista) {
            if (robot.getPorcentajeVida() >= 50) {
                System.out.println(robot);
            }
        }
        long cantRobots = lista.stream()
                .filter((r)-> r.getPorcentajeVida()>= 50)
                .count();
        System.out.println(cantRobots);
        
        lista.stream()
                .limit(3) // Para coger los 3 primeros
                .forEach(r -> System.out.println(r.getNumSerie()));
    }
    
    public static List<Robot> getListaRobots(int num){
        var listaRobots = new ArrayList<Robot>();
        Random random = new Random();
        if (num <= 0) {
            throw new IllegalArgumentException("El número de robots a crear no es válido");
        }
        
        for (int i = 0; i < num; i++) {
            listaRobots.add(new Robot(random.nextInt(0, 5000), random.nextInt(1, 101)));
        }
        return listaRobots;
    }
    
    public static List<Robot> generarListaAleatoriaRobots(){
        List<Robot> lista = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; set.size() < 20; i++) {
            int numSerie = new Random().nextInt(1, 21);
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
