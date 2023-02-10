/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerea;

/**
 *
 * @author nerea
 */
public class Vehiculo {
    
    // Atributos
    private String matricula;
    private String bastidor;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa; // Precio alquiler día
    private boolean disponible; // Alquilado o libre
    
    public void parar(){
        System.out.println("El vehículo " + this.getMatricula() + " ha parado");
    }
    
    public void arrancar(){
        System.out.println("El vehículo " + this.getMatricula() + " está arrancando...");
    }
    
    
    public Vehiculo(String matricula, String bastidor, String marca, String modelo, String color, double tarifa, boolean disponible) {
        this.matricula = matricula;
        this.bastidor = bastidor;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = disponible;
    }

    public Vehiculo() {
    }

    public Vehiculo(String bastidor, String modelo, double tarifa) {
        this.bastidor = bastidor;
        this.modelo = modelo;
        this.tarifa = tarifa;
    }
    
    public Vehiculo(Vehiculo origen){
        this.bastidor = origen.bastidor;
        this.color = origen.color;
        this.disponible = origen.disponible;
        this.marca = origen.marca;
        this.matricula = origen.matricula;
        this.modelo = origen.modelo;
        this.tarifa =  origen.tarifa;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", bastidor=" + bastidor + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tarifa=" + tarifa + ", disponible=" + disponible + '}';
    }

    public Vehiculo copiar(){
        Vehiculo aux = new Vehiculo(matricula, bastidor, marca, modelo, color, tarifa, disponible);
        return aux;
    }
    
    public static Vehiculo copiar(Vehiculo origen){
        Vehiculo aux = new Vehiculo(origen.matricula, origen.bastidor, origen.marca,
                origen.modelo, origen.color, origen.tarifa, origen.disponible);
        return aux;
    }
    
}
