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
    
    AZUL, VIOLETA, AMARILLO, NARANJA, ROJO, VERDE, BLANCO, NEGRO, GRIS;
    
    public static Color randomColor(){
        Color[] colores = values();
        return colores[new Random().nextInt(0, colores.length)];
    }
    
    public static Color obtenerColor(String color){
        return switch (color) {
            case "AZUL" -> Color.AZUL;
            case "VIOLETA" -> Color.VIOLETA;
            case "AMARILLO" -> Color.AMARILLO;
            case "NARANJA" -> Color.NARANJA;
            case "ROJO" -> Color.ROJO;
            case "VERDE" -> Color.VERDE;
            case "BLANCO" -> Color.BLANCO;
            case "NEGRO" -> Color.NEGRO;
            case "GRIS" -> Color.GRIS;
            default -> { throw new IllegalArgumentException();
            }
        };
    }
    
    
}
