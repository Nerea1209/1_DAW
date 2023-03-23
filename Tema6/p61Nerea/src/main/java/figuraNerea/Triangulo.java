/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuraNerea;

import java.awt.Point;

/**
 *
 * @author nerea
 */
public final class Triangulo extends Poligono implements Comparable<Triangulo>{

    private Point punto1 = new Point(0, 0);
    private Point punto2, punto3;
    public final static int NUM_lADOS = 3;
    public final static int DENOMINADOR = 2;

    public Triangulo() {
    }

    public Triangulo(Point punto2, Point punto3, int base, int altura, String id, String color) {
        super(base, altura, NUM_lADOS, id, color);
        this.punto2 = punto2;
        this.punto3 = punto3;
    }
    
    public Point getPunto1() {
        return punto1;
    }

    public void setPunto1(Point punto1) {
        this.punto1 = punto1;
    }

    public Point getPunto2() {
        return punto2;
    }

    public void setPunto2(Point punto2) {
        this.punto2 = punto2;
    }

    public Point getPunto3() {
        return punto3;
    }

    public void setPunto3(Point punto3) {
        this.punto3 = punto3;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("Triangulo{");
        sb.append("punto1=").append(punto1);
        sb.append(", punto2=").append(punto2);
        sb.append(", punto3=").append(punto3);
        sb.append('}');
        return sb.toString();
    }
    
    
    @Override
    public double area() {
        return (this.getBase() * this.getAltura()) / DENOMINADOR;
    }

    @Override
    public int compareTo(Triangulo o) {
        return Integer.compare(this.getBase(), o.getBase());
    }

    
    
}
