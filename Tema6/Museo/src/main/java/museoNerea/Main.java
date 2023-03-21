/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoNerea;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author nerea
 */
public class Main {
    
    public static void main(String[] args) {
        
        // Creamos una lista de obras con un cuadro para la sala fija 1
        List<Obra> obras1 = new ArrayList<>();
        Obra p1 = new Pintura(TipoPintura.ABSTRACTO, 1, "Picasso");
        obras1.add(p1);
        Sala s1 = new Fija("Completo", 1, obras1);
        
        // Creamos una lista de obras con una escultura para la sala fija 2
        List<Obra> obras2 = new ArrayList<>();
        Obra e1 = new Escultura(12, 3, 4, Material.MADERA, 2, "Henry Moore");
        obras2.add(e1);
        Sala s2 = new Fija("Completo", 2, obras2);
        
        // Creamos una lista de salas con las salas creadas anteriormente
        List<Sala> salas = new ArrayList<>();
        salas.add(s1);
        salas.add(s2);
        
        // Creamos un conservador escultórico y uno pictórico
        Conservador emp1 = new Escultorico(3, "3", "Paco");
        Conservador emp2 = new Pictorico(7, "4", "Alma");
        
        // Los añadimos a la lista de empleados del museo
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(emp1);
        empleados.add(emp2);
        
        // Creamos el museo
        Museo museo = new Museo("Picasso", "Málaga", empleados, salas);
        
        // Creamos un conjunto de obras únicas del museo
        Set<Obra> obrasUnicas = new HashSet<>();
        
        for (Sala sala : museo.getSalas()) { // Por cada sala del museo
            for (Obra obra : sala.getObras()) { // Recorremos cada una de sus obras
                obrasUnicas.add(obra); // Y las añadimos al conjunto de obrasUnicas
                for (Empleado empleado : museo.getEmpleados()) { // Por cada empleado del museo
                    if (empleado instanceof Pictorico pictorico) { // Si es pictoricos
                        pictorico.restaurar(obra); // Restauramos cada obra de cada sala
                    }
                }
            }
            
        }
        
        
           
                
    }
    
}
