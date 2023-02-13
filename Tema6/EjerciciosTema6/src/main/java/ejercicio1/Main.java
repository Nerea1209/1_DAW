/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nerea
 */
public class Main {
    
    public static void main(String[] args) {
        
        
        Ventana v1 = new VentanaAbatible(90, 10, 20, 
                60, "Cuarto", new Persiana(Color.ROJO), true);
        
        Ventana v2 = new VentanaCorredera(90, 10, 20, 
                60, "Cuarto", new Persiana(Color.ROJO), true);
        
        List<Ventana> conjuntoVentanas = new ArrayList<>();
        
        conjuntoVentanas.add(v1);
        conjuntoVentanas.add(v2);
        
       
    }
    
}
