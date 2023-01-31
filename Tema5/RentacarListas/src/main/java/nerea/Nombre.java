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
public enum Nombre {
    NURIA, MARIA, JOSE, JAVI, ANTONIO, JUAN, NEREA, CRISTINA, EDUARDO, FRANCISCO, 
    LORENA, ESTRELLA, MIGUEL, CARLOS, EVA, IGNACIO, ANDRÉS, LUCÍA, YUMARA;
    
    public static Nombre getAleatorio(){
        var r = new Random();
        Nombre[] nombres = Nombre.values();
        int posicion = r.nextInt(0, nombres.length);
        return nombres[posicion];
    }
}
