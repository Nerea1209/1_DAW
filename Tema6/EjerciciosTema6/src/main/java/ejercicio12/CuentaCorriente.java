/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author nerea
 */
public class CuentaCorriente extends Cuenta {

    private final double INTERES = 1.5;
    private double saldoMinimo;

    public CuentaCorriente() {
    }

    public CuentaCorriente(double saldoMinimo, Persona cliente) {
        super(cliente);
        this.saldoMinimo = saldoMinimo;
    }
    
    public double getINTERES() {
        return INTERES;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" interés = ").append(INTERES);
        sb.append(", saldoMinimo = ").append(saldoMinimo);
        return sb.toString();
    }
    
    @Override
    public void actualizarSaldo() {
        if (super.getSaldo() > 1000) {
            super.setSaldo(super.getSaldo() + (this.saldoMinimo * this.INTERES));
        } else {
            super.setSaldo(super.getSaldo() + (super.getSaldo() + this.INTERES));
        }
    }

    @Override
    public void retirarSaldo(double cantidad) {
        cantidad = Math.abs(cantidad);
        if (super.getSaldo() - cantidad < this.saldoMinimo) {
            System.out.println("No se puede superar el saldo mínimo");
        } else {
            super.setSaldo(super.getSaldo() - cantidad);
        }
    }

    @Override
    public void ingresar(double cantidad) {
        cantidad = Math.abs(cantidad);
        super.setSaldo(super.getSaldo() + cantidad);
    }

    
    
}
