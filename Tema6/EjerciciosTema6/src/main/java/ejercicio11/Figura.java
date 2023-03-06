/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author nerea
 */
public abstract class Figura {
    private double base;
    private double altura;
    private double area;

    public Figura() {
    }

    public Figura(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.area = calcularArea();
    }
    
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    
    
    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figura: ");
        sb.append("base = ").append(base);
        sb.append(", altura = ").append(altura);
        return sb.toString();
    }
    
    public abstract double calcularArea();

    
}
