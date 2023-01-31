/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerea;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author nerea
 */
public class Ejercito{
    
    // Atributo encapsulado de Ejercito
    Set<Soldado> soldados;

    // Constructor por defecto
    public Ejercito() {
        soldados = new HashSet<>();
    }

    // HashCode & Equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.soldados);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ejercito other = (Ejercito) obj;
        return Objects.equals(this.soldados, other.soldados);
    }

    // ToString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ejercito{");
        sb.append("soldados=").append(soldados);
        sb.append('}');
        return sb.toString();
    }
    
    // Métodos
    
    // Saber el número de soldados que hay
    public int numeroSoldados(){
        return soldados.size();
    }
    
    // Alistar a un soldado
    public void alistarSoldado(Soldado soldado){
        this.soldados.add(soldado);
    }
    
    // Saber si el ejército no tiene soldados
    public boolean tieneSoldados(){
        return !this.soldados.isEmpty(); // Si el tamaño no es cero devuelve true
    }
    
    // Saber si un soldado está en el ejército
    public boolean estaEnEjercito(Soldado soldado){
        return this.soldados.contains(soldado);
    }
    
    // Sacar todos los soldados en forma de ArrayList
    public List<Soldado> listaSoldados(){
        return new ArrayList<>(this.soldados);
    }

    // Desmatricular a un soldado del ejército
    public void desmatricularSoldado(Soldado soldado){
        this.soldados.remove(soldado);
    }
    
    // Imprime la lista de soldados con salto de línea
    public void imprimirSoldados(List<Soldado> lista){
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + "\n");
        }
    }

    // Getter
    public Set<Soldado> getSoldados() {
        return soldados;
    }
    
}
