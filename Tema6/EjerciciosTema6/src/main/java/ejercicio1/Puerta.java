/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author nerea
 */
public class Puerta {
    
    private double altura;
    private double ancho;
    private Color color;

    public Puerta() {
    }

    public Puerta(double altura, double ancho, Color color) {
        this.altura = altura;
        this.ancho = ancho;
        this.color = color;
    }
    
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Puerta{");
        sb.append("altura=").append(altura);
        sb.append(", ancho=").append(ancho);
        sb.append(", color=").append(color);
        sb.append('}');
        return sb.toString();
    }
    
    public void abrir(){
        System.out.println("La puerta se está abriendo");
    }
    
    public void cerrar(){
        System.out.println("La puesta se está cerrando");
    }
    
}
