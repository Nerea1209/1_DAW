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
public enum Marca {
    
    RENAULT, CITROËN, SEAT, PEUGEOT, FORD, OPEL, VOLKSWAGEN, MERCEDES;
    
    public static Marca randomMarca(){
        Marca[] marcas = values();
        return marcas[new Random().nextInt(0, marcas.length)];
    }
    
    public static Marca obtenerMarca(String marca){
        return switch (marca) {
            case "SEAT" -> Marca.SEAT;
            case "CITROËN" -> Marca.CITROËN;
            case "FORD" -> Marca.FORD;
            case "MERCEDES" -> Marca.MERCEDES;
            case "OPEL" -> Marca.OPEL;
            case "PEUGEOT" ->  Marca.PEUGEOT;
            case "RENAULT" -> Marca.RENAULT;
            case "VOLKSWAGEN" -> Marca.VOLKSWAGEN;
            default -> { throw new IllegalArgumentException();
            }
        };
    }
    
}
