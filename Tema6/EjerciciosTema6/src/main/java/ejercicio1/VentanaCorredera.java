/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author nerea
 */
public class VentanaCorredera extends Ventana {

    public VentanaCorredera() {
    }

    public VentanaCorredera(double ancho, double largo, double alturaSobleSuelo, String posicion, Persiana persiana) {
        super(ancho, largo, alturaSobleSuelo, posicion, persiana);
    }

    @Override
    public void abrir(){
        System.out.println("La ventana corredera " + this.getPosicion() + 
                " se está abriendo hacia la derecha");
    }
    
    @Override
    public void cerrar(){
        System.out.println("La ventana corredera " + this.getPosicion() + 
                " se está cerrando hacia la izquierda");
    }
    
}
