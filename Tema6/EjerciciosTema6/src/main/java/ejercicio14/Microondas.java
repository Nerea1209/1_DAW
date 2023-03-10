/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author nerea
 */
public class Microondas extends Electrodomestico implements Silencioso {
    
    private int potenciaMax; // En vatios(w)

    public Microondas(double consumo, String modelo) {
        super(consumo, modelo);
    }

    public Microondas(int potenciaMax, double consumo, String modelo) {
        super(consumo, modelo);
        this.potenciaMax = potenciaMax;
    }

    public int getPotenciaMax() {
        return potenciaMax;
    }

    public void setPotenciaMax(int potenciaMax) {
        this.potenciaMax = potenciaMax;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("--> Microondas: ");
        sb.append("potenciaMax=").append(potenciaMax);
        return sb.toString();
    }

    @Override
    public void Silencio() {
        System.out.println("El microondas de consumo " + this.getConsumo() + "emite 40dB");
    }
    
    
    
}
