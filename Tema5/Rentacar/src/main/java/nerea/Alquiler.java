/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerea;

import java.time.LocalDate;

/**
 *
 * @author nerea
 */
public class Alquiler {
    
    private int alquilerID;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private LocalDate fechaInicio;
    private int duracionDias;
    private static int contador = 0;

    public Alquiler(Cliente cliente, Vehiculo vehiculo, LocalDate fechaInicio, int duracionDias) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaInicio = fechaInicio;
        this.duracionDias = duracionDias;
        contador++;
        this.alquilerID = contador;
    }

    public Alquiler() {
    }
    
    

    public int getDuracionDias() {
        return duracionDias;
    }

    public void setDuracionDias(int duracionDias) {
        this.duracionDias = duracionDias;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getAlquilerID() {
        return alquilerID;
    }

    public void setAlquilerID(int alquilerID) {
        this.alquilerID = alquilerID;
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alquiler{");
        sb.append("alquilerID=").append(alquilerID);
        sb.append(", cliente=").append(cliente.getNif());
        sb.append(", vehiculo=").append(vehiculo.getBastidor());
        sb.append(", fechaInicio=").append(fechaInicio);
        sb.append(", duracionDias=").append(duracionDias);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.alquilerID;
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
        final Alquiler other = (Alquiler) obj;
        return this.alquilerID == other.alquilerID;
    }
    
    
    
    
    
}
