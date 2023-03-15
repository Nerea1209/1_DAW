/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio16;

import java.util.Random;

/**
 *
 * @author nerea
 */
public class Robot {
    
    private int numSerie, porcentajeVida;

    public Robot() {
    }

    public Robot(int numSerie) {
        this.numSerie = numSerie;
        this.porcentajeVida = generarVidaAleatorio();
    }

    public Robot(int numSerie, int porcentajeVida) {
        this.numSerie = numSerie;
        this.porcentajeVida = porcentajeVida;
    }
    
    

    public int getNumSerie() {
        return numSerie;
    }

    public int getPorcentajeVida() {
        return porcentajeVida;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Robot{");
        sb.append("numSerie=").append(numSerie);
        sb.append(",\tporcentajeVida=").append(porcentajeVida);
        sb.append('}');
        return sb.toString();
    }
    
    private int generarVidaAleatorio(){
        return new Random().nextInt(1, 101);
    }
    
}
