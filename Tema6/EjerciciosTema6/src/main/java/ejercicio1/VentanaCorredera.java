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

    public VentanaCorredera(double ancho, double largo, double alturaSobleSuelo) {
        super(ancho, largo, alturaSobleSuelo);
    }

    @Override
    public void abrir(){
        System.out.println("La ventana corredera se está abriendo hacia la derecha");
    }
    
    @Override
    public void cerrar(){
        System.out.println("La ventana corredera se está cerrando hacia la izquierda");
    }
    
}
