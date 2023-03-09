/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

import java.util.HashSet;
import java.util.Set;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author Nerea
 */
public abstract class Cuenta {
    
    private String numeroCuenta;
    private double saldo;
    private Persona cliente;

    public Cuenta() {
    }

    public Cuenta(Persona cliente) {
        this.cliente = cliente;
        this.saldo = 0;
        this.numeroCuenta = generarNumeroCuenta();
    }
    
    private String generarNumeroCuenta(){
        Set <String> cuentasGeneradas = new HashSet<>();
        String resultado = "";
        while(true){
            String numCuentaAux = RandomStringUtils.randomAlphabetic(20);
            if (!cuentasGeneradas.contains(numCuentaAux)) {
                cuentasGeneradas.add(numCuentaAux);
                resultado = numCuentaAux;
                break;
            }
        }
        return resultado;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cuenta: ");
        sb.append("numeroCuenta = ").append(numeroCuenta);
        sb.append(", saldo = ").append(saldo);
        sb.append(", cliente = ").append(cliente);
        return sb.toString();
    }
    
    public abstract void actualizarSaldo();
    
    public abstract void retirarSaldo(double cantidad);
    
    public abstract void ingresar(double cantidad);
    
    
    
}
