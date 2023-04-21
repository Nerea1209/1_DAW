/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7dnerea;

/**
 *
 * @author nerea
 */
public class Furgoneta extends Vehiculo {

    private int carga; // En kg
    private int volumen; // En m3

    public Furgoneta(int carga, int volumen, Long bastidor, String matricula, Marca marca, Modelo modelo, Color color, double tarifa, boolean disponible) {
        super(bastidor, matricula, marca, modelo, color, tarifa, disponible);
        this.carga = carga;
        this.volumen = volumen;
    }

    public Furgoneta() {
        this.carga = 1000;
        this.volumen = 8;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }  
    
    public void metodoFurgoneta(){
        System.out.println("Este método es de la clase Furgoneta");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("2 - ").append(super.toString());
        sb.append(":").append(carga);
        sb.append(":").append(volumen);
        return sb.toString();
    }
    
    
    
}
