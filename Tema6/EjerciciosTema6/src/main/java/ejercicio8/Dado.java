/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

import java.util.Random;

/**
 *
 * @author nerea
 */
public class Dado extends Azar {

    public Dado() {
        super(6);
    }
    
    public Dado(int posibilidades) {
        this.posibilidades = posibilidades;
    }
    
    public void metodoDado(){
        System.out.println("El dado es de " + this.getPosibilidades() + " caras");
    }
    
    @Override
    public int lanzar() {
        return new Random().nextInt(1, this.getPosibilidades() + 1);
    }
    
    
}
