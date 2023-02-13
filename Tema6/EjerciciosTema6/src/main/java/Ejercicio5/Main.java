/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author nerea
 */
public class Main {
    
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente("2", "Nerea", "López Sánchez");
        Cliente c3 = new Cliente("3", "Pedro", "Salazar");
        Cliente c4 = new Cliente("3", "Pedro", "Salazar");
        Cliente c5 = new Cliente("3", "Pedro", "Salazar");
        
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
        System.out.println(c5.hashCode());
        
    }
    
}
