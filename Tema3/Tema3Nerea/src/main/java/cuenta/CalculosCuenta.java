/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta;

/**
 *
 * @author nerea
 */
public class CalculosCuenta {
    /*
    METODOS
    -ingresarIntereses (Cuenta cuenta). Aumenta el saldo de la cuenta
        saldo = saldo + saldo*interes
    - ingresarDinero(Cuenta cuenta, double cantidad).
    - retirarEfectivo(Cuenta cuenta, double cantidad). Hay que tener en 
    cuenta que no se puede retirar más del saldo actual.
    */
    
    public static void ingresarIntereses(Cuenta cuenta){
        double saldoActual=cuenta.getSaldoActual();
        cuenta.setSaldoActual(saldoActual + saldoActual*cuenta.getInteres());
    }
    
    public static void ingresarDinero(Cuenta cuenta, double cantidad){
        cantidad = Math.abs(cantidad);
        double saldoActual=cuenta.getSaldoActual();
        cuenta.setSaldoActual(saldoActual + cantidad);
    }
    
    public static void retirarDinero(Cuenta cuenta, double cantidad){
        double saldoActual=cuenta.getSaldoActual();
        if(saldoActual<=cantidad){
            cuenta.setSaldoActual(0);;
        } else{
          cuenta.setSaldoActual(saldoActual - cantidad);  
        }
    }
}
