/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nerea
 */
public class PruebaLegislador {
    
    public static void main(String[] args) {
        
        List<Legislador> listaLegisladores = new ArrayList<>();
        
        listaLegisladores.add(new Diputado(18, "Málaga", "PP", "Pepe", "Manríquez"));
        listaLegisladores.add(new Diputado(23, "Barcelona", "Ciudadanos", "María", "Perez"));
        listaLegisladores.add(new Diputado(14, "Madrid", "PSOE", "Pedro", "Sánchez"));
        listaLegisladores.add(new Diputado(96, "Jaén", "Podemos", "Laura", "Rodríguez"));
        listaLegisladores.add(new Diputado(54, "Lugo", "VOX", "Beatriz", "Martínez"));
        listaLegisladores.add(new Senador(125.3, "Jaén", "PSOE", "Francisco", "Delgado"));
        listaLegisladores.add(new Senador(188.4, "Málaga", "PP", "Juan", "Vallejo"));
        listaLegisladores.add(new Senador(142, "Murcia", "Ciudadanos", "Miriam", "López"));
        listaLegisladores.add(new Senador(103.25, "Cáceres", "PSOE", "Carlos", "Lago"));
        listaLegisladores.add(new Senador(96, "Gerona", "Podemos", "Clara", "Avilés"));
        listaLegisladores.add(new Senador(147, "Salamanca", "VOX", "Yumara", "Sastre"));
        
        
        
        for (Legislador l : listaLegisladores) {
            if (l instanceof Senador) {
                Senador s = (Senador) l;
                System.out.println(s.toString()); 
                System.out.println("Trabaja en la cámara: " + s.getCamara());
            } else {
                Diputado d = (Diputado) l;
                System.out.println(d.toString()); 
                System.out.println("Trabaja en la cámara: " + d.getCamara());
                
                
            }
        }
        
    }
    
}
