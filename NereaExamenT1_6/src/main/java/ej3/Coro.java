/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author nerea
 */
public class Coro {
    
    private List<Voz> voces;
    

    public Coro() {
    }

    public Coro(List<Voz> voces) {
        this.voces = voces;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Coro{");
        sb.append("voces=").append(voces);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    public static List<Voz> generarVoces(int numero){
        List<Voz> lista;
        if (numero >= 6) {
            lista = new ArrayList<>(numero);
            for (int i = 0; i < numero; i++) {
                lista.add(Voz.randomVoz());
            }
        } else {
            throw new IllegalArgumentException();
        }
        return lista;
    }
    
    public static int getNumeroCorosMixtos(List<Voz> lista){
        int contratenor = 0;
        int tenor = 0;
        int baritono = 0;
        int soprano = 0;
        int mezzosoprano = 0;
        int contralto = 0;
        
        for (int i = 0; i < lista.size(); i++) {
            switch (lista.get(i)) {
                case CONTRATENOR -> contratenor++;
                case BARITONO -> baritono++;
                case TENOR -> tenor++;
                case SOPRANO -> soprano++;
                case MEZZOSOPRANO -> mezzosoprano++;
                default -> contralto++;
            }
        }
        
        List<Integer> repeticiones = new ArrayList<>();
        repeticiones.add(contratenor);
        repeticiones.add(tenor);
        repeticiones.add(baritono);
        repeticiones.add(soprano);
        repeticiones.add(mezzosoprano);
        repeticiones.add(contralto);
        
        Collections.sort(repeticiones);
        return repeticiones.get(0);
        
        
        
        
    }
    
    public static Set<Voz> buscarVozMasRepetida(List<Voz> lista){
        int contratenor = 0;
        int tenor = 0;
        int baritono = 0;
        int soprano = 0;
        int mezzosoprano = 0;
        int contralto = 0;
        Set<Voz> vocesRepetidas = new HashSet();
        Map<Voz, Integer> repetidos= new TreeMap<>();
        
        for (int i = 0; i < lista.size(); i++) {
            switch (lista.get(i)) {
                case CONTRATENOR -> contratenor++;
                case BARITONO -> baritono++;
                case TENOR -> tenor++;
                case SOPRANO -> soprano++;
                case MEZZOSOPRANO -> mezzosoprano++;
                default -> contralto++;
            }
        }
        
        repetidos.put(Voz.CONTRATENOR, contratenor);
        repetidos.put(Voz.BARITONO, baritono);
        repetidos.put(Voz.TENOR, tenor);
        repetidos.put(Voz.SOPRANO, soprano);
        repetidos.put(Voz.MEZZOSOPRANO, mezzosoprano);
        repetidos.put(Voz.CONTALTO, contralto);
        
        List<Integer> repeticiones = new ArrayList<>(repetidos.values());
        
        Comparator<Integer> comparator = Collections.reverseOrder();
        Collections.sort(repeticiones, comparator);
        
        
        
        for (Map.Entry<Voz, Integer> entry: repetidos.entrySet()){
            int mayor = repeticiones.get(0);
            if (mayor == (entry.getValue())) {
                vocesRepetidas.add( entry.getKey());
            }
        }
        
        return vocesRepetidas;
    }

    public List<Voz> getVoces() {
        return voces;
    }

    public void setVoces(List<Voz> voces) {
        this.voces = voces;
    }
    
}
