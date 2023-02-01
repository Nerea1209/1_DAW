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
    
    
    public void guardarEjercito(int identificador, Ejercito ejercito){
        ejercitos.put(identificador, ejercito);
    }
    
    public void obtenerEjercito(int identificador){
      ejercitos.get(identificador);
    }
    
    public Collection<Ejercito> obtenerEjercitos(){
        return ejercitos.values();
    }
    
}
