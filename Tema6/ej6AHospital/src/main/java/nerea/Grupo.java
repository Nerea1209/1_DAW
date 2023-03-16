/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package nerea;

/**
 *
 * @author nerea
 */
public enum Grupo {
    
    C(0.175),
    D(0.18),
    E(0.185);
    
    private double irpf;
    
    private Grupo(double irpf){
        this.irpf = irpf;
    }

    public double getIrpf() {
        return irpf;
    }

    public void setIrpf(double irpf) {
        this.irpf = irpf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Grupo{");
        sb.append("irpf=").append(irpf);
        return sb.toString();
    }
    
    
}
