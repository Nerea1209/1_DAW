/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nerea
 */
public class Main {
    
    public static void main(String[] args) {
        
        Azar moneda = new Moneda();
        Azar dado = new Dado();
        Azar dadoDoceCaras = new Dado(12);
        
        List<Azar> objetosAzar = new ArrayList<>();
        objetosAzar.add(moneda);
        objetosAzar.add(dado);
        objetosAzar.add(dadoDoceCaras);
        objetosAzar.forEach(System.out::println);
        
        for (Azar azar : objetosAzar) {
            System.out.println("Lanzamiento " + azar.lanzar());
            if (azar instanceof Dado){
                ((Dado) azar).metodoDado();
            }
        }
        
//        System.out.println("Moneda: " + moneda.lanzar());
//        System.out.println("Dado de 6 caras: " + dado.lanzar());
//        System.out.println("Dado de 12 caras: " + dadoDoceCaras.lanzar());
        
    }
    
}
