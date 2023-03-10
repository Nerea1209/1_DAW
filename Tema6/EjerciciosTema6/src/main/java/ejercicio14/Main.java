/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nerea
 */
public class Main {
    
    public static void main(String[] args) {
        
        List<Silencioso> objetosSilenciosos = new ArrayList<>();
        
        objetosSilenciosos.add(new Frigorifico(60, 150, "LG"));
        objetosSilenciosos.add(new Microondas(1200, 200, "Bosh"));
        
        // No se puede añadir CampanaExtractora porque no implementa esta interfaz,
        // por lo tanto no es objeto Silencioso
    }
    
}
