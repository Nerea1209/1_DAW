/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoNerea;

/**
 *
 * @author Nerea
 */
// Clase Vigilante que hereda de Empleado y, con lo cual, implementa la
// interfaz Comparable
public final class Vigilante extends Empleado {
    
    // Atributos encapsulados
    private String zona;

    // Constructors
    public Vigilante() {
    }

    public Vigilante(String zona, String nif, String nombre) {
        super(nif, nombre);
        this.zona = zona;
    }

    // Getters and setters
    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("Vigilante{");
        sb.append("zona=").append(zona);
        sb.append('}');
        return sb.toString();
    }
}
