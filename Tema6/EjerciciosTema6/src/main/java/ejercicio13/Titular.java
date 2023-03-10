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
public final class Titular extends Profesor {
    
    private LocalDate fechaJubilacion;

    public Titular() {
    }

    public Titular(LocalDate fechaJubilacion, String especialidad, String nombre, String apellidos, String nif, Direccion direccion) {
        super(especialidad, nombre, apellidos, nif, direccion);
        this.fechaJubilacion = fechaJubilacion;
    }

    public LocalDate getFechaJubilacion() {
        return fechaJubilacion;
    }

    public void setFechaJubilacion(LocalDate fechaJubilacion) {
        this.fechaJubilacion = fechaJubilacion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("--> Titular: ");
        sb.append("fechaJubilacion=").append(fechaJubilacion);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
