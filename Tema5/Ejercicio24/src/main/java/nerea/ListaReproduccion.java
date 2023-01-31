/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerea;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Nerea
 */
public class ListaReproduccion {
    
    private List<Cancion> canciones;

    public ListaReproduccion(List<Cancion> canciones) {
        this.canciones = new ArrayList<>();
    }
    
    public int numeroCanciones(){
        return this.canciones.size();
    }
    
    public boolean estaVacia(){
        return this.canciones.isEmpty();
    }
    
    public Cancion escucharCancion(int posicion){
        return this.canciones.get(posicion);
    }
    
    public void cambiarCancion(int posicionNueva, Cancion cancion){
        cancion = this.canciones.get(posicionNueva);
    }
    
    public void grabarCancion(Cancion cancionNueva){
        this.canciones.add(cancionNueva);
    }
    
    public void eliminaCancion(int posicion){
        this.canciones.remove(posicion);
    }
    
    public void eliminaCancion(Cancion c){
        this.canciones.remove(c);
    }
    
    public void imprimirLista(ListaReproduccion tmp){
        System.out.println(this.canciones);
    }
    
    public int buscarCancion(Cancion c){
        int i;
        for (i = 0; i < this.canciones.size(); i++) {
            if(this.canciones.get(i) == c){
                break;
            }
        }
        return i;
    }
    
    public int ordenarPorNombre(Cancion a, Cancion b) {
        return a.getNombre().compareTo(b.getNombre());
    }
    
    public int ordenarPorArtista(Cancion a, Cancion b) {
        return a.getArtista().compareTo(b.getArtista());
    }
    
    
}
