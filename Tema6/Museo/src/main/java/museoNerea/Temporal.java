/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoNerea;

import java.time.LocalDate;

/**
 *
 * @author Nerea
 */
public final class Temporal extends Sala {
    
    private LocalDate fechaIni, fechaFin;

    public Temporal() {
    }

    public Temporal(LocalDate fechaIni, LocalDate fechaFin, int salaID, Sensor sensorTemperatura, Sensor sensorHumedad) {
        super(salaID, sensorTemperatura, sensorHumedad);
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
    }

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
