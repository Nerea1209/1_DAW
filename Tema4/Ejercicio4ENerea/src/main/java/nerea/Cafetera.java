/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package nerea;

/**
 *
 * @author Nerea
 */
public class Cafetera {

    private double capacidadMaxima; 
    private double cantidadActual;

    public Cafetera() {
        this.capacidadMaxima = 1000;
    }

    public Cafetera(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadMaxima;
    }

    public Cafetera(double capacidadMaxima, double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        if(cantidadActual > capacidadMaxima){
            this.cantidadActual = capacidadMaxima;
        }
        if (cantidadActual <= capacidadMaxima && cantidadActual >= 0){
            this.cantidadActual = cantidadActual;
        }
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cafetera{");
        sb.append("capacidadMaxima=").append(capacidadMaxima);
        sb.append(", cantidadActual=").append(cantidadActual);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    public void llenarCafetera(){
        this.cantidadActual = this.capacidadMaxima;
    }
    
    public void servirTaza(double cantidadAServir){
        cantidadAServir = Math.abs(cantidadAServir);
        if(this.cantidadActual >= cantidadAServir){
            this.cantidadActual -= cantidadAServir;
        } else {
            this.cantidadActual = 0;
        } 
    }
    
    public void vaciarCafetera(){
        this.cantidadActual = 0;
    }
    
    public void agregarCafe(double cantidadAgregar){
        cantidadAgregar = Math.abs(cantidadAgregar);
        if(cantidadAgregar > (this.capacidadMaxima - this.cantidadActual)){
            this.cantidadActual = this.capacidadMaxima; 
        } else {
            this.cantidadActual += cantidadAgregar; 
        }
    }
    
    
    
    
    
    
    
    
    
}
