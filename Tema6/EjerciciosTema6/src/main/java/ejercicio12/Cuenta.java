/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

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
    
    private static String generarNumeroCuenta(){
        return RandomStringUtils.randomAlphabetic(20);
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
    
    
    
}
