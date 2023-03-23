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
public final class Rectangulo extends Poligono implements Dibujable, Movible {
    
    private Point punto1 = new Point(0, 0);
    private Point punto2, punto3, punto4;
    private final static int NUM_lADOS = 4;

    public Rectangulo() {
    }

    public Rectangulo(Point punto2, Point punto3, Point punto4, int base, int altura, String id, String color) {
        super(base, altura, NUM_lADOS, id, color);
        this.punto2 = punto2;
        this.punto3 = punto3;
        this.punto4 = punto4;
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

    public Point getPunto4() {
        return punto4;
    }

    public void setPunto4(Point punto4) {
        this.punto4 = punto4;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("Rectangulo{");
        sb.append("punto1=").append(punto1);
        sb.append(", punto2=").append(punto2);
        sb.append(", punto3=").append(punto3);
        sb.append(", punto4=").append(punto4);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double area() {
        return this.getBase() * this.getAltura();
    }

    @Override
    public void dibujar() {
        char[][] matriz = new char[this.getAltura()][this.getBase()];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == 0 || i == matriz.length - 1 || 
                        j == 0 || j == matriz[0].length - 1) {
                    matriz[i][j] = '*';
                } else {
                    matriz[i][j] = ' ';
                }

            }
        }
        imprimirMatriz(matriz);
    }
    
    public static void imprimirMatriz(char[][] matriz){
        for (char[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[j] + " ");
            }
            System.out.println("");
        }
    }

    @Override
    public void moverIzq(int x) {
        this.punto1.x -= x;
        this.punto2.x -= x;
        this.punto3.x -= x;
        this.punto4.x -= x;
    }

    @Override
    public void moverDer(int x) {
        this.punto1.x += x;
        this.punto2.x += x;
        this.punto3.x += x;
        this.punto4.x += x;
    }

    @Override
    public void moverArr(int y) {
        this.punto1.y += y;
        this.punto2.y += y;
        this.punto3.y += y;
        this.punto4.y += y;
    }

    @Override
    public void moverAba(int y) {
        this.punto1.y -= y;
        this.punto2.y -= y;
        this.punto3.y -= y;
        this.punto4.y -= y;
    }

}
