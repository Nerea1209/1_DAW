/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio16;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author nerea
 */
public class PruebaRobots {
    
    public static void main(String[] args) {
        
        generarListaAleatoriaRobots().forEach(System.out::println);
        
    }
    
    public static List<Robot> generarListaAleatoriaRobots(){
        List<Robot> lista = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            lista.add(new Robot(new Random().nextInt(1, Integer.MAX_VALUE)));
        }
        return lista;
    }
    
}
