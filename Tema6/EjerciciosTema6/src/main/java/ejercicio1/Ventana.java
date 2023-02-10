/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author nerea
 */
public class Ventana {
    
    private double ancho;
    private double largo;
    private double alturaSobleSuelo;
    private Persiana persiana;

    public Ventana() {
    }
    
    public Ventana(double ancho, double largo, double alturaSobleSuelo) {
        this.ancho = ancho;
        this.largo = largo;
        this.alturaSobleSuelo = alturaSobleSuelo;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ventana{");
        sb.append("ancho=").append(ancho);
        sb.append(", largo=").append(largo);
        sb.append(", alturaSobleSuelo=").append(alturaSobleSuelo);
        sb.append('}');
        return sb.toString();
    }
    
    public void abrir(){
        System.out.println("La ventana se está abriendo");
    }
    
    public void cerrar(){
        System.out.println("La ventana se está cerrando");
    }

    
    
}
