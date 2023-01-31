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
public enum Apellido {
    GONZÁLEZ, FERNÁNDEZ, RODRÍGUEZ, SÁNCHEZ, DÍAZ, GARCÍA, LÓPEZ, BLANCO,
    ORELLANA, ALONSO, TORRES, RUIZ, HERNÁNDEZ, VÁZQUEZ, MUÑOZ, MARTÍNEZ;
    
    public static Apellido getAleatorio(){
        var r = new Random();
        Apellido[] apellidos = Apellido.values();
        int posicion = r.nextInt(0, apellidos.length);
        return apellidos[posicion];
    }
}
