/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerea;

import java.time.LocalDate;

/**
 *
 * @author nerea
 */
public class Edificio {
    
    public static void main(String[] args) {
        
        Elevador e1 = new Elevador("Pepe Fernández", 
                7, 750);
        
        Elevador e2 = new Elevador("Juan Carlos Rodríguez", 
                12, 973);
        
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        
        viaje(e1, 5, 345, 8);
        System.out.println(e1.toString());
        
        viaje(e2, 5, 45, 2);
        System.out.println(e2.toString());
        
       
        
    }
    
    private static void viaje(Elevador elevador, int numeroViajeros, double pesoTotal, int plantaDeseada){
        
        // Si los parámetros son válidos y la planta en la que es estamos es
        // mayor a la planta deseada, estamos subiendo y la nueva planta será la deseada
        if (Elevador.mover(elevador, numeroViajeros, pesoTotal, plantaDeseada) && elevador.getPlanta() > plantaDeseada){
            elevador.setEstado("Bajando"); 
            elevador.setPlanta(plantaDeseada);
        
        // Si los parámetros son válidos y la planta deseada es mayor, estamos subiendo
        } else if(Elevador.mover(elevador, numeroViajeros, pesoTotal, plantaDeseada)  && plantaDeseada > elevador.getPlanta() ){
            elevador.setEstado("Subiendo");
            elevador.setPlanta(plantaDeseada);
        } else {
            elevador.setEstado("Parado");
        }
        
        
        
    }
    
    private static LocalDate fechaProximaRevision(Elevador elevador){
        elevador.setFechaUltimaRevision(elevador.getFechaUltimaRevision().plusMonths(6));
        return elevador.getFechaUltimaRevision();
    }
    
}
