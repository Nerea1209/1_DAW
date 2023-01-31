/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author nerea
 */
public class Cuenta {
    
    /*
    ATRIBUTOS
    - nº cuenta(20 digitos)
    - nif cliente
    - nombre cliente
    - saldo actual
    - interes % (entre 0.1 y 3)
    MÉTODOS
    - Constructor por defecto. nº cuenta aleatorio
    - Constructor parametrizado. nº cuenta aleatorio
    - Getter y Setter. No hay set para nº cuenta
    - ToString
    */
    
    private final String numeroCuenta;
    private String nifCliente;
    private String nombreCliente;
    private double saldoActual;
    private double interes; // En %, entre 0.1 y 3

    public Cuenta() {
        numeroCuenta = generaNumeroCuenta();
    }

    public Cuenta(String numeroCuenta, String nifCliente, String nombreCliente, double saldoActual, double interes) {
        numeroCuenta = generaNumeroCuenta();
        this.numeroCuenta=numeroCuenta;
        this.nifCliente = nifCliente;
        this.nombreCliente = nombreCliente;
        this.saldoActual = saldoActual;
        this.interes = filtrarInteres(interes);
    }
    
    private String generaNumeroCuenta(){
        return RandomStringUtils.randomNumeric(20);
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNifCliente() {
        return nifCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setNifCliente(String nifCliente) {
        this.nifCliente = nifCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", nifCliente=" + nifCliente + ", nombreCliente=" + nombreCliente + ", saldoActual=" + saldoActual + ", interes=" + interes + '}';
    }
    
    private double filtrarInteres(Cuenta cuenta, double interes){
        interes=0;
        if(interes<=0.1){
            cuenta.setInteres(0.1);
        } else{
            cuenta.setInteres(3);
        }
        return interes;
    }
    
    
}
