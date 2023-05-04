/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.sql.Time;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author nerea
 */
public class Trabajador {
    
    private String nombreCompleto, dni;
    private TipoPersonal tipoPersonal;
    private String puestoTrabajo;
    private boolean esHorarioPersonalizado;
    private LocalDate fechalAlta, fechaBaja;
    private Time horasIniciales, totalHoras;
    private boolean esActivo;

    public Trabajador() {
    }

    public Trabajador(String nombreCompleto, String dni, TipoPersonal tipoPersonal, 
            String puestoTrabajo, boolean esHorarioPersonalizado, LocalDate fechalAlta, 
            LocalDate fechaBaja, Time horasIniciales, Time totalHoras, boolean esActivo) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.tipoPersonal = tipoPersonal;
        this.puestoTrabajo = puestoTrabajo;
        this.esHorarioPersonalizado = esHorarioPersonalizado;
        this.fechalAlta = fechalAlta;
        this.fechaBaja = fechaBaja;
        this.horasIniciales = horasIniciales;
        this.totalHoras = totalHoras;
        this.esActivo = esActivo;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public TipoPersonal getTipoPersonal() {
        return tipoPersonal;
    }

    public void setTipoPersonal(TipoPersonal tipoPersonal) {
        this.tipoPersonal = tipoPersonal;
    }

    public String getPuestoTrabajo() {
        return puestoTrabajo;
    }

    public void setPuestoTrabajo(String puestoTrabajo) {
        this.puestoTrabajo = puestoTrabajo;
    }

    public boolean isEsHorarioPersonalizado() {
        return esHorarioPersonalizado;
    }

    public void setEsHorarioPersonalizado(boolean esHorarioPersonalizado) {
        this.esHorarioPersonalizado = esHorarioPersonalizado;
    }

    public LocalDate getFechalAlta() {
        return fechalAlta;
    }

    public void setFechalAlta(LocalDate fechalAlta) {
        this.fechalAlta = fechalAlta;
    }

    public LocalDate getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public Time getHorasIniciales() {
        return horasIniciales;
    }

    public void setHorasIniciales(Time horasIniciales) {
        this.horasIniciales = horasIniciales;
    }

    public Time getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(Time totalHoras) {
        this.totalHoras = totalHoras;
    }

    public boolean isEsActivo() {
        return esActivo;
    }

    public void setEsActivo(boolean esActivo) {
        this.esActivo = esActivo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.dni);
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
        final Trabajador other = (Trabajador) obj;
        return Objects.equals(this.dni, other.dni);
    }

    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trabajador{");
        sb.append("nombreCompleto=").append(nombreCompleto);
        sb.append(", dni=").append(dni);
        sb.append(", tipoPersonal=").append(tipoPersonal);
        sb.append(", puestoTrabajo=").append(puestoTrabajo);
        sb.append(", esHorarioPersonalizado=").append(esHorarioPersonalizado);
        sb.append(", fechalAlta=").append(fechalAlta);
        sb.append(", fechaBaja=").append(fechaBaja);
        sb.append(", horasIniciales=").append(horasIniciales);
        sb.append(", totalHoras=").append(totalHoras);
        sb.append(", esActivo=").append(esActivo);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
