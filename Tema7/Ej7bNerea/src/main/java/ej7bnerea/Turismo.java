/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7bnerea;

/**
 *
 * @author nerea
 */
public class Turismo extends Vehiculo {
     // Atributo propio de Turismo, que no existe en vehiculo
    private int numeroPuertas;
    
    // Constructor con parámetros. Recibe todos los parámetros de clase hija y padre
    public Turismo(int numeroPuertas, Long bastidor, String matricula, 
            Marca marca, Modelo modelo, Color color, double tarifa, boolean disponible) {
        // Primera línea de código de un constructor clase hija es llamar al constructor padre
        super(bastidor, matricula, marca, modelo, color, tarifa, disponible);
        // Inicialización de atributos propios de la subclase
        this.numeroPuertas = numeroPuertas;
        
    }
    
    // Sobrescribir el método toString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("0 - ").append(super.toString());
        sb.append(":").append(numeroPuertas);
        return sb.toString();
    }
   
    public Turismo(){
        // Llama al constructor por defecto de Vehiculo
        super();
        this.numeroPuertas = 5;
    }

    // Métodos propios de turismo
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    
    public void metodoTurismo(){
        System.out.println("Este es el método propio de turismo");
    }

}
