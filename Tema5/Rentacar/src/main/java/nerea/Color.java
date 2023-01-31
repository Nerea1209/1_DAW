/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package nerea;

import java.util.Random;

/**
 *
 * @author nerea
 */
public enum Color {
    ROJO, NEGRO, AMARILLO, VERDE, AZUL, BLANCO;
    
    public static Color getAleatorio(){
        var r = new Random();
        Color[] colores = Color.values();
        int posicion = r.nextInt(0, colores.length);
        return colores[posicion];
    }
}
