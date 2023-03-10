/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author nerea
 */
public class CampanaExtractora extends Electrodomestico {
    
    private int decibelios;

    public CampanaExtractora() {
    }

    public CampanaExtractora(int decibelios, double consumo, String modelo) {
        super(consumo, modelo);
        if (decibelios < 50) {
            this.decibelios = 50;
        } else {
            this.decibelios = decibelios;
        }
    }

    public int getDecibelios() {
        return decibelios;
    }

    public void setDecibelios(int decibelios) {
        this.decibelios = decibelios;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("--> CampanaExtractora: ");
        sb.append("decibelios=").append(decibelios);
        return sb.toString();
    }
    
    
    
    
    
}
