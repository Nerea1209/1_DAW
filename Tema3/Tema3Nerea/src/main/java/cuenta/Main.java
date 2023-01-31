/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta;

/**
 *
 * @author nerea
 */
public class Main {
    // Creamos un par de objetos y probamos los métodos de CALCULOS CUENTA
    public static void main(String[] args) {
        
        Cuenta cuenta1 = new Cuenta();
        cuenta1.setNifCliente("79056703P");
        cuenta1.setNombreCliente("Maria");
        cuenta1.setSaldoActual(100);
        cuenta1.setInteres(-1561);
        
        System.out.println("Cuenta 1: " + cuenta1.toString());
        
        CalculosCuenta.ingresarIntereses(cuenta1);
        
        System.out.println("Saldo actual de la Cuenta 1: " + cuenta1.getSaldoActual());
        
        CalculosCuenta.ingresarDinero(cuenta1,34556.0);
        
        System.out.println("Cuenta 1: " + cuenta1.toString());
        
        CalculosCuenta.retirarDinero(cuenta1, 600);
        
        System.out.println("Cuenta 1: " + cuenta1.toString());
        
        Cuenta cuenta2 = new Cuenta("", "79056783I", 
                "Fede", 150, 300);

        
        System.out.println("Cuenta 2: " + cuenta2.toString());
        
        CalculosCuenta.ingresarIntereses(cuenta2);
        
        System.out.println("Cuenta 2: " + cuenta2.toString());
        
        CalculosCuenta.ingresarDinero(cuenta2, 52.0);
        
        System.out.println("Cuenta 2: " + cuenta2.toString());
        
        CalculosCuenta.retirarDinero(cuenta2, 200);
        
        System.out.println("Cuenta 2: " + cuenta2.toString());
    }
    
    
    
}
