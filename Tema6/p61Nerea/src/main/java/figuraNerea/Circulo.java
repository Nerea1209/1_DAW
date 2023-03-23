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
public class Circulo extends Figura implements Movible {
    
    private int longitudRadio;
    private Point punto1 = new Point(0, 0);

    public Circulo() {
    }

    public Circulo(int longitudRadio, String id, String color) {
        super(id, color);
        this.longitudRadio = longitudRadio;
    }

    public int getLongitudRadio() {
        return longitudRadio;
    }

    public void setLongitudRadio(int longitudRadio) {
        this.longitudRadio = longitudRadio;
    }

    public Point getPunto1() {
        return punto1;
    }

    public void setPunto1(Point punto1) {
        this.punto1 = punto1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("Circulo{");
        sb.append("longitudRadio=").append(longitudRadio);
        sb.append(", punto1=").append(punto1);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(longitudRadio, 2);
    }

    @Override
    public void moverIzq(int x) {
        this.punto1.x -= x;
    }

    @Override
    public void moverDer(int x) {
        this.punto1.x += x;
    }

    @Override
    public void moverArr(int y) {
        this.punto1.y += y;
    }

    @Override
    public void moverAba(int y) {
        this.punto1.y -= y;
    }
    
    
    
}
