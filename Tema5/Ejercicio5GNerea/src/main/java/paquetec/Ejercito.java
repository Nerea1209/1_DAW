/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetec;

/**
 *
 * @author nerea
 */
public class Ejercito {
    
    private int identificador;
    private String nombre;
    private int numSoldados;

    public Ejercito() {
    }

    public Ejercito(String nombre, int numSoldados) {
        this.nombre = nombre;
        this.numSoldados = numSoldados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumSoldados() {
        return numSoldados;
    }

    public void setNumSoldados(int numSoldados) {
        this.numSoldados = numSoldados;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ejercito{");
        sb.append("identificador=").append(identificador);
        sb.append(", nombre=").append(nombre);
        sb.append(", numSoldados=").append(numSoldados);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.identificador;
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
        return this.identificador == other.identificador;
    }
    
    
}
