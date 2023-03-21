/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoNerea;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Nerea
 */
// Clase temporal que hereda de Sala
public final class Temporal extends Sala {
    
    // Atributos encapsulados
    private LocalDate fechaIni, fechaFin;

    // Constructors
    public Temporal() {
    }

    public Temporal(LocalDate fechaIni, LocalDate fechaFin, int salaID, List<Obra> obras) {
        super(salaID, obras);
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
    }

    // Getters and setters
    public LocalDate getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(LocalDate fechaIni) {
        this.fechaIni = fechaIni;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("Temporal{");
        sb.append("fechaIni=").append(fechaIni);
        sb.append(", fechaFin=").append(fechaFin);
        sb.append('}');
        return sb.toString();
    }
}
