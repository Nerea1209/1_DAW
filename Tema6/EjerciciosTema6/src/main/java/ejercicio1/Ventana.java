/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author nerea
 */
public abstract class Ventana {
    
    private double ancho;
    private double largo;
    private double alturaSobleSuelo;
    private String posicion;
    private Persiana persiana;
    private boolean estado;

    public Ventana() {
    }

    public Ventana(double ancho, double largo, double alturaSobleSuelo, String posicion, Persiana persiana, boolean estado) {
        this.ancho = ancho;
        this.largo = largo;
        this.alturaSobleSuelo = alturaSobleSuelo;
        this.posicion = posicion;
        this.persiana = persiana;
        this.estado = estado;
    }

    
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAlturaSobleSuelo() {
        return alturaSobleSuelo;
    }

    public void setAlturaSobleSuelo(double alturaSobleSuelo) {
        this.alturaSobleSuelo = alturaSobleSuelo;
    }
    
    public Persiana getPersiana() {
        return persiana;
    }

    public void setPersiana(Persiana persiana) {
        this.persiana = persiana;
    }
    
    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ventana{");
        sb.append("ancho=").append(ancho);
        sb.append(", largo=").append(largo);
        sb.append(", alturaSobleSuelo=").append(alturaSobleSuelo);
        sb.append(", posicion=").append(posicion);
        sb.append(", persiana=").append(persiana);
        sb.append('}');
        return sb.toString();
    }

    
    public abstract void abrir(int numero);
    public abstract void cerrar(int numero);

    
    
}
