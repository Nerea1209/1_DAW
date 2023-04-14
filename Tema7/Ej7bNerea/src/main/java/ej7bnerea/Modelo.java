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
public enum Modelo {
    
    MÉGANE, CLIO, TWINGO, ARKANA, C3, C4, DS4, IBIZA, ATECA, LEÓN, E208, ERIFTER, 
    HIBRID508, MONDEO, FOCUS, MUNSTANG, ASTRA, CORSA, GOLF, POLO, PASSAT,
    GLA, CLASE_C, EQE;
    
    public static Modelo randomModelo(Marca marca){
        Modelo[] modelos = values();
        int pos = switch (marca) {
            case RENAULT -> new Random().nextInt(0, 4);
            case CITROËN -> new Random().nextInt(4, 7);
            case SEAT -> new Random().nextInt(7, 10);
            case PEUGEOT -> new Random().nextInt(10, 13);
            case FORD -> new Random().nextInt(13, 16);
            case OPEL -> new Random().nextInt(16, 18);
            case VOLKSWAGEN -> new Random().nextInt(18, 21);
            default -> new Random().nextInt(21, modelos.length);
        };
        return modelos[pos];
    }
    
}
