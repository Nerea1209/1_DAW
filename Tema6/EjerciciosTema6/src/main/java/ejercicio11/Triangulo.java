/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author Nerea
 */
public class Triangulo extends Figura {

    private final int DIVIDENDO = 2;
    
    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        super(base, altura);
    }
    
    @Override
    public double calcularArea() {
        return (super.getBase()*super.getAltura())/DIVIDENDO;
    }
    
}
