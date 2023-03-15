/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2;

import daw.Desfibrilador;
import daw.UtilesDesfibrilador;

/**
 *
 * @author nerea
 */
public class Prueba {
    
    public static void main(String[] args) {
        MapDesfibrilador mapDesfibriladores = new MapDesfibrilador(
                UtilesDesfibrilador.getDesfibriladores(), true);
        System.out.println(mapDesfibriladores.estaDesfibrilador(new Desfibrilador("8304", 
                "DEA_251", "Calle Calvario, 26", "registro2@emasa.es", "783770062")));
        System.out.println(mapDesfibriladores.estaDesfibrilador(new Desfibrilador("5648", 
                "DEA_251", "Calle Calvario, 26", "5646dawd@emasa.es", "783770062")));
        System.out.println("Mapa de desfibriladores");
        mapDesfibriladores.getMapDesfibriladores().forEach((key, value) -> System.out.println(key + value));
        System.out.println("Lista de desfibriladores");
        mapDesfibriladores.listaDesfibriladores().forEach(System.out::println);
        System.out.println("ToString de MapDesfibriladores");
        System.out.println(mapDesfibriladores.toString());
    }
    
    
    
}
