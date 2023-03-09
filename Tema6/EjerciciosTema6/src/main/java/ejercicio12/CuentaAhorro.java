/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author nerea
 */
public class CuentaAhorro extends Cuenta {

    private double intereses;
    private double comisionAnual;

    public CuentaAhorro() {
    }

    public CuentaAhorro(double intereses, double comisionAnual, Persona cliente) {
        super(cliente);
        this.intereses = intereses;
        this.comisionAnual = comisionAnual;
    }
    
    public double getIntereses() {
        return intereses;
    }

    public void setIntereses(double intereses) {
        this.intereses = intereses;
    }

    public double getComisionAnual() {
        return comisionAnual;
    }

    public void setComisionAnual(double comisionAnual) {
        this.comisionAnual = comisionAnual;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" intereses = ").append(intereses);
        sb.append(", comisionAnual = ").append(comisionAnual);
        return sb.toString();
    }
    
    @Override
    public void actualizarSaldo() {
        super.setSaldo((super.getSaldo() + (super.getSaldo() * this.intereses))
        - this.comisionAnual);
    }

    @Override
    public void retirarSaldo(double cantidad) {
        cantidad = Math.abs(cantidad);
        if (super.getSaldo() >= cantidad) {
            super.setSaldo(super.getSaldo() - cantidad);
        } else {
            System.out.println("No hay suficiente saldo...");
        }
    }

    
}
