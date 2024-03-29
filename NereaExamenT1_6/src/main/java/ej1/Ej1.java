/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

import daw.Desfibrilador;
import daw.UtilesDesfibrilador;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author nerea
 */
public class Ej1 {
    
    public static void main(String[] args) {
        Set<Desfibrilador> desfibriladoresOrdenadosSinRepetidos = desfibriladoresSinRepetidos(UtilesDesfibrilador.getDesfibriladores());
        desfibriladoresOrdenadosSinRepetidos.forEach(System.out::println);
        
        Map<String, Desfibrilador> mapDesfibriladores = mapDesfibriladores(desfibriladoresOrdenadosSinRepetidos);
//        System.out.println(Map.entry(mapDesfibriladores.keySet(), mapDesfibriladores.values()));
        
        for (Map.Entry<String, Desfibrilador> entry : mapDesfibriladores.entrySet()) {
            String key = entry.getKey();
            Desfibrilador val = entry.getValue();
            System.out.println("Key " + key + " value " + val);
        }
    }
    
    public static Set<Desfibrilador> desfibriladoresSinRepetidos(Desfibrilador[] desfibriladores){
//        List<Desfibrilador> lista = new ArrayList<>(desfibriladores.length);
//        for (Desfibrilador desfibrilador : desfibriladores) {
//            lista.add(desfibrilador);
//        }
//        return new TreeSet<>(lista);
        return new TreeSet<>(Arrays.asList(desfibriladores));
        
    }
    
    public static Map<String, Desfibrilador> mapDesfibriladores(Set<Desfibrilador> set){
        Iterator<Desfibrilador> iterador = set.iterator();
        Map<String, Desfibrilador> map = new TreeMap<>();
        while(iterador.hasNext()){
            Desfibrilador d = iterador.next();
            map.put(d.getId(), d);
        }
        return map;
        
        // También se puede hacer con un for
//        Map<String, Desfibrilador> map = new HashMap<>();
//        
//        for (Iterator<Desfibrilador> iterador = set.iterator(); iterador.hasNext();) {
//            Desfibrilador d = iterador.next();
//            map.put(d.getId(), d);
//        }
    }
    
}
