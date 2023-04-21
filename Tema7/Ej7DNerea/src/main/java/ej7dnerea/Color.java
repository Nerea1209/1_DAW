/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ej7dnerea;

import java.util.Random;

/**
 *
 * @author nerea
 */
public enum Color {
    
    AZUL, VIOLETA, AMARILLO, NARANJA, ROJO, VERDE, BLANCO, NEGRO;
    
    public static Color randomColor(){
        Color[] colores = values();
        return colores[new Random().nextInt(0, colores.length)];
    }
    
}
