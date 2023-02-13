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

    private int longApertura;
    
    public VentanaCorredera() {
    }

    public VentanaCorredera(int longApertura, double ancho, double largo, double alturaSobleSuelo, String posicion, Persiana persiana, boolean estado) {
        super(ancho, largo, alturaSobleSuelo, posicion, persiana, estado);
        this.longApertura = longApertura;
    }

    @Override
    public void abrir(int numero) {
       this.setEstado(true);
       this.longApertura = numero;
    }

    @Override
    public void cerrar(int numero) {
       this.setEstado(false);
       this.longApertura = 0;
    }
    
}
