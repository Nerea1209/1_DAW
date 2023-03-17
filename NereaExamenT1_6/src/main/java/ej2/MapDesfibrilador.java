/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2;

import daw.Desfibrilador;
import ej1.Ej1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author nerea
 */
public class MapDesfibrilador {
    
    private final Map<String, Desfibrilador> mapDesfibriladores;
    
    public MapDesfibrilador(Desfibrilador[] arrayDesfibriladores, boolean esOrdenada) {
         Map<String, Desfibrilador> map = Ej1.mapDesfibriladores(Ej1.desfibriladoresSinRepetidos(arrayDesfibriladores));
         this.mapDesfibriladores = esOrdenada? new TreeMap<>(map):map;
    }
    
    // No hace falta
//    private static Map<String, Desfibrilador> mapDesfibriladores(Desfibrilador[] arrayDesfibriladores, boolean esOrdenada){
//        Map<String, Desfibrilador> map;
//        if (esOrdenada) {
//            map = new TreeMap<>();
//        } else {
//            map = new HashMap<>();
//        }
//        for (int i = 0; i < arrayDesfibriladores.length; i++) {
//            map.put(arrayDesfibriladores[i].getId(), arrayDesfibriladores[i]);
//        }
//        return map;
//    }

    public Map<String, Desfibrilador> getMapDesfibriladores() {
        return mapDesfibriladores;
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String key : mapDesfibriladores.keySet()) {
            sb.append(key).append(" -> ");
            sb.append(mapDesfibriladores.get(key).getNombre()).append(" -> ");
            sb.append(mapDesfibriladores.get(key).getEmail());
        }
        return sb.toString();
    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(map);
//        sb.append("mapDesfibriladores=").append(mapDesfibriladores);
//        sb.append('}');
//        return sb.toString();
//    }
    
    public boolean estaDesfibrilador(Desfibrilador desfibrilador){
        return this.mapDesfibriladores.containsKey(desfibrilador.getId());
    }
    
    public List<Desfibrilador> listaDesfibriladores(){
        return new ArrayList<>(this.mapDesfibriladores.values());
    }

//    public Map<String, Integer> numDesfibriladorPorCorreo(){
//        Map<String, Integer> map = new HashMap<>();
//        Iterator<Desfibrilador> iterador = this.mapDesfibriladores.values().iterator();
//        while(iterador.hasNext()){
//            Desfibrilador d = iterador.next();
//            if (d.getEmail().equals(d)) {
//                
//            }
//            int cont = 
//            map.put(d.getEmail(), d);
//        }
//        for (int i = 0; i < this.mapDesfibriladores.keySet().size(); i++) {
//            map.put(this.mapDesfibriladores.get(i).getEmail(), i)
//        }
//        return map;
//    }
    
    public Map<String, Integer> numeroDesfiByEmail(){
        var nuevoMap = new HashMap<String, Integer>();
        for (Desfibrilador des : mapDesfibriladores.values()) {
            if (nuevoMap.containsKey(des.getEmail())) {
                nuevoMap.put(des.getEmail(), nuevoMap.get(des.getEmail()) + 1);
            } else {
                nuevoMap.put(des.getEmail(), 1);
            }
        }
        return nuevoMap;
    }
    
    
    
}
