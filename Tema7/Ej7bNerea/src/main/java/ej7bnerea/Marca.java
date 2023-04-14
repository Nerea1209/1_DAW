/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ej7bnerea;

import java.util.Random;

/**
 *
 * @author nerea
 */
public enum Marca {
    
    RENAULT, CITROËN, SEAT, PEUGEOT, FORD, OPEL, VOLKSWAGEN, MERCEDES;
    
    public static Marca randomMarca(){
        Marca[] marcas = values();
        return marcas[new Random().nextInt(0, marcas.length)];
    }
    
}
