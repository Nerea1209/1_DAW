/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3;

import java.util.ArrayList;
import java.util.Collections;
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
public class Coro {
    
    private List<Voz> voces;
    Map<Voz, Integer> repetidos= new TreeMap<>();
    private int contratenor = 0;
    private int tenor = 0;
    private int baritono = 0;
    private int soprano = 0;
    private int mezzosoprano = 0;
    private int contralto = 0;

    public Coro() {
    }

    public Coro(List<Voz> voces) {
        this.voces = voces;
        
        for (int i = 0; i < voces.size(); i++) {
            switch (voces.get(i)) {
                case CONTRATENOR -> contratenor++;
                case BARITONO -> baritono++;
                case TENOR -> tenor++;
                case SOPRANO -> soprano++;
                case MEZZOSOPRANO -> mezzosoprano++;
                default -> contralto++;
            }
        }
        
        repetidos.put(Voz.CONTRATENOR, contratenor);
        repetidos.put(Voz.BARITONO, contratenor);
        repetidos.put(Voz.CONTRATENOR, contratenor);
        repetidos.put(Voz.CONTRATENOR, contratenor);
        repetidos.put(Voz.CONTRATENOR, contratenor);
        repetidos.put(Voz.CONTRATENOR, contratenor);
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
        int numero;
        int femeninas = 0;
        int masculinas = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getGenero().equals("Femenina")) {
                femeninas++;
            } else {
                masculinas++;
            }
        }
        
        numero = masculinas * femeninas;
        
        return numero;
    }
    
    public static Set<Voz> buscarVozMasRepetida(List<Voz> lista){
        Set<Voz> set = new TreeSet<>(lista);
        Collections.sort(lista, (o1, o2)-> o1.getNombre().compareToIgnoreCase(o2.getNombre()));
        
        return set;
    }

    public List<Voz> getVoces() {
        return voces;
    }

    public void setVoces(List<Voz> voces) {
        this.voces = voces;
    }
    
}
