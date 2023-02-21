/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteC;

/**
 *
 * @author Nerea
 */
public class Cuadrado extends Figura {

    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado, Color color, String nombre) {
        super(color, nombre);
        this.lado = lado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", lado = ").append(lado);
        return sb.toString();
    }
    
    @Override
    public double calcularPerimetro() {
        return lado * 4;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    public double getLado() {
        return lado;
    }

    public void changeSize(double lado) {
        this.lado = lado;
    }
    
}
