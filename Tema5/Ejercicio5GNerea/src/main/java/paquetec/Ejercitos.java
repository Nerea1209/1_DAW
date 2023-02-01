/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetec;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;



/**
 *
 * @author nerea
 */
public class Ejercitos {
    
    private Map<Integer, Ejercito> ejercitos = new HashMap<>();
    
    public static void main(String[] args) {
        
        Ejercitos ejercitos = new Ejercitos();
        ejercitos.guardarEjercito(0, new Ejercito("ej1", 170));
        ejercitos.guardarEjercito(1, new Ejercito("ej2", 1983));
        ejercitos.guardarEjercito(2, new Ejercito("ej3", 32));
        ejercitos.guardarEjercito(3, new Ejercito("ej4", 1456));
        ejercitos.guardarEjercito(4, new Ejercito("ej5", 8753));
        
        System.out.println(ejercitos.obtenerEjercito(2));
        
        ejercitos.obtenerEjercitos();
        
        ejercitos.mostrarEjercitos();
        
    }
    
    public void guardarEjercito(int identificador, Ejercito ejercito){
        ejercitos.put(identificador, ejercito);
    }
    
    public Ejercito obtenerEjercito(int identificador){
      return ejercitos.get(identificador);
    }
    
    public Collection<Ejercito> obtenerEjercitos(){
        return ejercitos.values();
    }
    
    public void mostrarEjercitos(){
         ejercitos.forEach((clave, valor) -> System.out.println( clave + "  ------  " + valor));
    }
    
}
