/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author nerea
 */
public class Frigorifico extends Electrodomestico implements Silencioso {
    
    private int capacidadLitros;

    public Frigorifico(double consumo, String modelo) {
        super(consumo, modelo);
    }

    public Frigorifico(int capacidadLitros, double consumo, String modelo) {
        super(consumo, modelo);
        this.capacidadLitros = capacidadLitros;
    }

    public int getCapacidadLitros() {
        return capacidadLitros;
    }

    public void setCapacidadLitros(int capacidadLitros) {
        this.capacidadLitros = capacidadLitros;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(" --> Frigorifico: ");
        sb.append("capacidadLitros=").append(capacidadLitros);
        return sb.toString();
    }

    @Override
    public void Silencio() {
        System.out.println("El frigorífico del modelo " + this.getModelo() + " emite 50dB");
    }
    
    
    
}
