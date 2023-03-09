/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasoListasMapSet;

import java.util.Objects;

/**
 *
 * @author nerea
 */
public class Pasajero implements Comparable<Pasajero>{

    private String nombre;
    private String apellidos;
    private TipoPasajero tipo;

    public Pasajero() {
    }
    
    public Pasajero(String nombre, String apellidos, TipoPasajero tipo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public TipoPasajero getTipo() {
        return tipo;
    }

    public void setTipo(TipoPasajero tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.nombre);
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
        final Pasajero other = (Pasajero) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pasajero{");
        sb.append("nombre=").append(nombre);
        sb.append(", apellidos=").append(apellidos);
        sb.append(", tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }
    
    
    @Override
    public int compareTo(Pasajero o) {
        return this.nombre.compareToIgnoreCase(o.getNombre());
    }
    
}
