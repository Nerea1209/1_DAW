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
    
    private int gradosApertura;
    
    public VentanaAbatible() {
        
    }

    public VentanaAbatible(int gradosApertura, double ancho, double largo, double alturaSobleSuelo, String posicion, Persiana persiana, boolean estado) {
        super(ancho, largo, alturaSobleSuelo, posicion, persiana, estado);
        this.gradosApertura = gradosApertura;
    }
    
    @Override
    public void abrir(int numero){
        // Hay que indicar que está abierta y además los grados de apertura
        // se calculan dividiendo el numero entre 2
        this.setEstado(true);
        this.gradosApertura = numero/2;
    }
    
    @Override
    public void cerrar(int numero){
        this.setEstado(true);
        this.gradosApertura = 0;
    }
    
}
