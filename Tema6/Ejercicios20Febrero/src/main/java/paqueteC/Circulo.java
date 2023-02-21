/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteC;

/**
 *
 * @author Nerea
 */
public class Circulo extends Figura {

    private double radio;

    public Circulo() {
    }

    public Circulo(double radio, Color color, String nombre) {
        super(color, nombre);
        this.radio = radio;
    }
    
    public double getRadio() {
        return radio;
    }

    public void cambiarRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", radio = ").append(radio);
        return sb.toString();
    }
    
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    
    
}
