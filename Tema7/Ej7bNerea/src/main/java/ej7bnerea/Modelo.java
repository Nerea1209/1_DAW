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
    
    public static Modelo obtenerModelo(String modelo){
        return switch (modelo) {
            case "MÉGANE" -> Modelo.MÉGANE;
            case "CLIO" -> Modelo.CLIO;
            case "TWINGO" -> Modelo.TWINGO;
            case "ARKANA" -> Modelo.ARKANA;
            case "C3" -> Modelo.C3;
            case "C4" ->  Modelo.C4;
            case "DS4" -> Modelo.DS4;
            case "IBIZA" -> Modelo.IBIZA;
            case "ATECA" -> Modelo.ATECA;
            case "LEÓN" -> Modelo.LEÓN;
            case "E208" -> Modelo.E208;
            case "ERIFTER" -> Modelo.ERIFTER;
            case "HIBRID508" -> Modelo.HIBRID508;
            case "MONDEO" -> Modelo.MONDEO;
            case "FOCUS" -> Modelo.FOCUS;
            case "MUNSTANG" -> Modelo.MUNSTANG;
            case "ASTRA" -> Modelo.ASTRA;
            case "CORSA" -> Modelo.CORSA;
            case "GOLF" -> Modelo.GOLF;
            case "POLO" -> Modelo.POLO;
            case "PASSAT" -> Modelo.PASSAT;
            case "GLA" -> Modelo.GLA;
            case "CLASE_C" -> Modelo.CLASE_C;
            case "EQE" -> Modelo.EQE;
            default -> { throw new IllegalArgumentException();
            }
        };
    }
    
}
