/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerea;

/**
 *
 * @author nerea
 */
public class Electrico extends Vehiculo {
    
    private int numBaterias;
    private double duracionCarga;

    public Electrico(int numBaterias, double duracionCarga, String matricula, 
            String bastidor, String marca, String modelo, String color, 
            double tarifa, boolean disponible) {
        super(matricula, bastidor, marca, modelo, color, tarifa, disponible);
        this.numBaterias = numBaterias;
        this.duracionCarga = duracionCarga;
    }
    
    public Electrico(){
        
    }

    public int getNumBaterias() {
        return numBaterias;
    }

    public void setNumBaterias(int numBaterias) {
        this.numBaterias = numBaterias;
    }

    public double getDuracionCarga() {
        return duracionCarga;
    }

    public void setDuracionCarga(double duracionCarga) {
        this.duracionCarga = duracionCarga;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Electrico{");
        sb.append("bastidor=").append(this.getBastidor());
        sb.append(", numBaterias=").append(numBaterias);
        sb.append(", duracionCarga=").append(duracionCarga);
        sb.append('}');
        return sb.toString();
    }
    
    @Override
    public void arrancar(){
        System.out.println("Soy un vehículo muy chulo " + this.getMatricula()+ " y estoy arrancando rum rummmmmm"); 
    }
    
    public void cargarBaterias(){
        System.out.println("El vehículo " + this.getMatricula() + " está cargando...");
    }
    
    public void cambiarBateria(){
        System.out.println("El vehículo " + this.getMatricula() + " está cambiando la batería...");
    }

    @Override
    public void parar() {
        System.out.println("El vehículo electrico " + this.getMatricula() + " se ha parado.");
    }
    
}
