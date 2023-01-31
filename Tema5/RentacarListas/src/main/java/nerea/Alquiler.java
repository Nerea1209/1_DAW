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
    
    // Atributos encapsulados
    private int alquilerID;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private LocalDate fechaInicio;
    private int duracionDias;
    private boolean activo;
    private static int contador = 0;

    // Construcotr por parametros
    public Alquiler(Cliente cliente, Vehiculo vehiculo, int duracionDias) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaInicio = LocalDate.now();
        this.duracionDias = duracionDias;
        contador++;
        this.alquilerID = contador;
    }

    // Constructor por defecto
    public Alquiler() {
    }
    
    // Getters and setters

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
    
      public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // tostring
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alquiler{");
        sb.append("alquilerID=").append(alquilerID);
        sb.append(", cliente=").append(cliente);
        sb.append(", vehiculo=").append(vehiculo);
        sb.append(", fechaInicio=").append(fechaInicio);
        sb.append(", duracionDias=").append(duracionDias);
        sb.append(", activo=").append(activo);
        sb.append('}');
        return sb.toString();
    }

    // hashcode and equals
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

    // Métodos
    public boolean isActivo() {
        return activo;
    }

  
    
    
    
    
    
}
