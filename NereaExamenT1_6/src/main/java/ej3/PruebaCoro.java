/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author nerea
 */
public class PruebaCoro {
    
    public static void main(String[] args) {
        List<Coro> listaCoros = generarCorosAleatorios();
        listaCoros.forEach(System.out::println);
        List<Voz> listaVoces = Coro.generarVoces(6);
        listaVoces.forEach(System.out::println);
        Coro.buscarVozMasRepetida(listaVoces).forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.println("Número de coros mixtos posibles: " + Coro.getNumeroCorosMixtos(listaVoces));
    }
    
    public static List<Coro> generarCorosAleatorios(){
        int tamaño = 2;
        List<Coro> lista = new ArrayList<>(2);
        for (int i = 0; i < 20; i++) {
            lista.add(new Coro(Coro.generarVoces(new Random().nextInt(6, 20))));
        }
        return lista;
    }
    
    
}
