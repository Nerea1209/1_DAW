/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoNerea;

import java.util.Objects;
import java.util.Set;

/**
 *
 * @author Nerea
 */
public abstract class Empleado implements Comparable<Empleado> {
    
    private String nif, nombre;
    private static Set<String> nifs;

    public Empleado() {
    }

    public Empleado(String nif, String nombre) {
        if (!nifs.contains(nif)) {
            this.nif = nif;
            this.nombre = nombre;
            nifs.add(nif);
        } else {
            throw new IllegalArgumentException("El nif introducido ya existe");
        }
    }

    public String getNif() {
        return nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.nif);
        return hash;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        return Objects.equals(this.nif, other.nif);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("nif=").append(nif);
        sb.append(", nombre=").append(nombre);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Empleado o) {
        return this.nif.compareToIgnoreCase(o.getNif());
    }

   
    
    
    
    
    
}
