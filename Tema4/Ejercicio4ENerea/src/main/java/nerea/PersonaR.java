/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package nerea;

/**
 *
 * @author nerea
 */
public record PersonaR(int edad, String nombre) {
    public void hacerCafe(Cafetera c){
        c.llenarCafetera();
    }
    
    public void beberCafe(Cafetera c, int cantidad){
        c.servirTaza(cantidad);
    }
}
