/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoNerea;

/**
 *
 * @author Nerea
 */
// Clase final Monitor que hereda de empleado y, por lo tanto, implementa
// la interfaz Comparable
public final class Monitor extends Empleado {
    
    // Atributos encapsulados
    private String especialidad;

    // Constructors
    public Monitor() {
    }

    public Monitor(String especialidad, String nif, String nombre) {
        super(nif, nombre);
        this.especialidad = especialidad;
    }

    // Getters and setters
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("Monitor{");
        sb.append("especialidad=").append(especialidad);
        sb.append('}');
        return sb.toString();
    }
    
}
