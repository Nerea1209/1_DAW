/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteC;

/**
 *
 * @author Nerea
 */
public abstract class Figura {
    
    private Color color;
    private String nombre;
    private double perimetro;
    private double area;

    public Figura() {
    }

    public Figura(Color color, String nombre) {
        this.color = color;
        this.nombre = nombre;
        this.perimetro = calcularPerimetro();
        this.area = calcularArea();
    }

    public Color getColor() {
        return color;
    }

    public String getNombre() {
        return nombre;
    }
    
    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figura: ");
        sb.append("color = ").append(color);
        sb.append(", nombre = ").append(nombre);
        return sb.toString();
    }
    
    public abstract double calcularPerimetro();
    
    public abstract double calcularArea();
    
}
