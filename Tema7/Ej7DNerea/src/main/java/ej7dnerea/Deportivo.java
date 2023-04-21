/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7dnerea;

/**
 *
 * @author nerea
 */
public class Deportivo extends Vehiculo {
    
    private int cilindrada; // Atributo específico para Deportivo

    public Deportivo(int cilindrada, Long bastidor, String matricula, Marca marca, Modelo modelo, Color color, double tarifa, boolean disponible) {
        super(bastidor, matricula, marca, modelo, color, tarifa, disponible);
        this.cilindrada = cilindrada;
    }
    
    public Deportivo(){
        cilindrada = 4;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
   
    public void metodoDeportivo(){
        System.out.println("Este método es de la clase Deportivo");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("1 - ").append(super.toString());
        sb.append(":").append(cilindrada);
        return sb.toString();
    }
    
    
}
