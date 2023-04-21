/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7dnerea;

import java.util.Objects;

/**
 *
 * @author nerea
 */
public abstract class Vehiculo {
    
    private Long bastidor;
    private String matricula;
    private Marca marca;
    private Modelo modelo;
    private Color color;
    private double tarifa;
    private boolean disponible;
    
    public Vehiculo(Long bastidor, String matricula, Marca marca, Modelo modelo, Color color, double tarifa, boolean disponible) {
        this.bastidor = bastidor;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = disponible;
    }
    
     public Vehiculo(){
        this.bastidor = 1L;
        this.matricula = "0000 AAA"; 
    }

    public Long getBastidor() {
        return bastidor;
    }

    public void setBastidor(Long bastidor) {
        this.bastidor = bastidor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.bastidor);
        hash = 73 * hash + Objects.hashCode(this.matricula);
        hash = 73 * hash + Objects.hashCode(this.marca);
        hash = 73 * hash + Objects.hashCode(this.modelo);
        hash = 73 * hash + Objects.hashCode(this.color);
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.tarifa) ^ (Double.doubleToLongBits(this.tarifa) >>> 32));
        hash = 73 * hash + (this.disponible ? 1 : 0);
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
        final Vehiculo other = (Vehiculo) obj;
        if (Double.doubleToLongBits(this.tarifa) != Double.doubleToLongBits(other.tarifa)) {
            return false;
        }
        if (this.disponible != other.disponible) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return Objects.equals(this.bastidor, other.bastidor);
    }
     
     public void metodoVehiculo(){
        System.out.println("Método de vehículo");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(bastidor);
        sb.append(":").append(matricula);
        sb.append(":").append(marca);
        sb.append(":").append(modelo);
        sb.append(":").append(color);
        sb.append(":").append(tarifa);
        sb.append(":").append(disponible);
        return sb.toString();
    }
     
     
    
}
