/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteb;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;



/**
 *
 * @author Nerea
 */
public class Loteria {
    
    private Map<String, Double> traductor = new HashMap<>();
    
    public String generarDecimo(){
        return "" + new Random().nextInt(0, 100000);
    }
    
    
    
}
