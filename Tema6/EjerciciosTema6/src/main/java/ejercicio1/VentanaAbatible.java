/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author nerea
 */
public class VentanaAbatible extends Ventana {
    
    public VentanaAbatible() {
        
    }

    public VentanaAbatible(double ancho, double largo, double alturaSobleSuelo, String posicion, Persiana persiana) {
        super(ancho, largo, alturaSobleSuelo, posicion, persiana);
    }
    
    @Override
    public void abrir(){
        System.out.println("La ventana abatible " + this.getPosicion() + 
                " se está abriendo hacia arriba");
    }
    
    @Override
    public void cerrar(){
        System.out.println("La ventana abatible " + this.getPosicion() + 
                " se está cerrando hacia abajo");
    }
    
}
