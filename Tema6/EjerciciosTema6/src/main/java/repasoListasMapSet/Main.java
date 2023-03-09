/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasoListasMapSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author nerea
 */
public class Main {

    public static void main(String[] args) {

        Pasajero p1 = new Pasajero("Nerea", "López Sánchez", TipoPasajero.TURISTA);
        Pasajero p2 = new Pasajero("Pepe", "Perez", TipoPasajero.TURISTA);
        Pasajero p3 = new Pasajero("maria", "jimenez", TipoPasajero.TURISTA);
        Pasajero p4 = new Pasajero("lucas", "hernandez", TipoPasajero.TURISTA);
        Pasajero p5 = new Pasajero("miguel", "duran", TipoPasajero.TURISTA);
        Pasajero p6 = new Pasajero("antonio", "lopez", TipoPasajero.PRIMERA);
        Pasajero p7 = new Pasajero("juan", "lopez", TipoPasajero.PRIMERA);
        Pasajero p8 = new Pasajero("ester", "rodriguez", TipoPasajero.PRIMERA);
        Pasajero p9 = new Pasajero("ismael", "sanchez", TipoPasajero.PRIMERA);
        Pasajero p10 = new Pasajero("laura", "cendan", TipoPasajero.PRIMERA);

        List<Pasajero> lista1 = new ArrayList<>();
        List<Pasajero> lista2 = new ArrayList<>();
        List<Pasajero> lista3 = new ArrayList<>();

        lista1.add(p1);
        lista1.add(p2);

        lista2.add(p2);
        lista2.add(p3);
        lista2.add(p7);
        lista2.add(p8);

        lista3.add(p6);
        lista3.add(p4);
        lista3.add(p5);

        Vuelo v1 = new Vuelo("Malaga", "Madrid", 3, lista1);
        Vuelo v2 = new Vuelo("Malaga", "Bali", 10, lista2);
        Vuelo v3 = new Vuelo("Mallorca", "Madrid", 3, lista3);
        Vuelo v4 = new Vuelo("Paris", "Jerez", 6, lista1);
        Vuelo v5 = new Vuelo("Bilbao", "Madrid", 1, lista2);
        Vuelo v6 = new Vuelo("Barcelona", "Malaga", 2, lista3);

        //  lista de  vuelos 
        List<Vuelo> listaVuelos = new ArrayList<>();

        listaVuelos.add(v1);
        listaVuelos.add(v2);
        listaVuelos.add(v3);
        listaVuelos.add(v4);
        listaVuelos.add(v5);
        listaVuelos.add(v6);

        // imprimo la lista
        Map<String, Integer> map1 = gentePorDestino(listaVuelos);

        map1.forEach((key, value) -> System.out.println("Key: " + key + ", value: " + value));

        // Apartado B
        Map<Integer, Set<Pasajero>> map2 = pasajerosPorVuelo(listaVuelos);

        map2.forEach((key, value) -> System.out.println("Key: " + key + ", value: " + value));

    }

    public static Map<String, Integer> gentePorDestino(List<Vuelo> listaVuelos) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < listaVuelos.size(); i++) {
            if (map.containsKey(listaVuelos.get(i).getDestino())) {
                map.replace(listaVuelos.get(i).getDestino(), 
                        map.get(listaVuelos.get(i).getDestino())
                + listaVuelos.get(i).getListaPasajeros().size());
            } else {
                map.put(listaVuelos.get(i).getDestino(), listaVuelos.get(i).getListaPasajeros().size());
            }
        }
        return map;
    }
    
    public static Map<Integer, Set<Pasajero>> pasajerosPorVuelo(List<Vuelo> listaVuelos){
        Map<Integer, Set<Pasajero>> map = new TreeMap<>();
        for (Vuelo vuelo : listaVuelos) {
            Set<Pasajero> pasajeros = new TreeSet<>();
            for (int i = 0; i < vuelo.getListaPasajeros().size(); i++) {
                pasajeros.add(vuelo.getListaPasajeros().get(i));
            }
            map.put(vuelo.getCodigo(), pasajeros);
        }
        return map;
    }

}
