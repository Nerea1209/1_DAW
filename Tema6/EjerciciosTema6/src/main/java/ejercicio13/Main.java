/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nerea
 */
public class Main {
    
    public static void main(String[] args) {
        
        List<Persona> listaPersonas = new ArrayList<>();
        
        listaPersonas.add(new Estudiante(0, "Nerea", "López", 
                "123456789z", new Direccion("Avenida Andalucía", 
                    "Marbella", "29670", "España")));
        listaPersonas.add(new Titular(LocalDate.now(), "Repostero",
                "Jaimito", "Perez", "2", 
                new Direccion("", "", "", "")));
        listaPersonas.add(new Interino(LocalDate.MIN, LocalDate.MIN, 
                "Matemáticas", "Manolito", "Polinomio", "3", 
                new Direccion("", "", "", "")));
        
        for (Persona p : listaPersonas) {
            p.identificate();
        }
        
        for (Persona p : listaPersonas) {
            if (p instanceof Interino interino) {
                var tmp = interino.getFechaInicio();
                System.out.println(tmp);
            } else if (p instanceof Titular titular) {
                var tmp = titular.getFechaJubilacion();
                System.out.println(tmp);
            } else {
                ((Estudiante) p).estudiarPoco();
            }
        }
        
    }
    
}
