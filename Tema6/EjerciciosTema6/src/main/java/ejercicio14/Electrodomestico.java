/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author nerea
 */
public abstract class Electrodomestico {
    
    private double consumo;
    private String modelo;

    public Electrodomestico() {
    }
    
    public Electrodomestico(double consumo, String modelo) {
        this.consumo = consumo;
        this.modelo = modelo;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Electrodomestico: ");
        sb.append("consumo=").append(consumo);
        sb.append(", modelo=").append(modelo);
        return sb.toString();
    }
    
    
    
    
}
