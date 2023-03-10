/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

import java.time.LocalDate;

/**
 *
 * @author nerea
 */
// Clase final implica que no puede tener herencia
public final class Interino extends Profesor implements Comparable<Interino>{

    private LocalDate fechaInicio, fechaFin;

    public Interino() {
    }

    public Interino(LocalDate fechaInicio, LocalDate fechaFin, String especialidad, String nombre, String apellidos, String nif, Direccion direccion) {
        super(especialidad, nombre, apellidos, nif, direccion);
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(" --> Interino, ");
        sb.append("fechaInicio=").append(fechaInicio);
        sb.append(", fechaFin=").append(fechaFin);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Interino o) {
        return this.fechaInicio.compareTo(o.getFechaInicio());
    }
    


    
    
}
