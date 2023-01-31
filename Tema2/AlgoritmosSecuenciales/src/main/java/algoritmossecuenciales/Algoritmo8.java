/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmossecuenciales;

import java.util.Scanner;

/**
 *
 * @author ubuntu
 */
public class Algoritmo8 {
    
    public static void main(String[] args) {
        // En un hospital existen tres áreas: Ginecología, Pediatría y 
        // Traumatología. El presupuesto anual del hospital se reparte de la 
        // siguiente forma: Ginecología 40%, Traumatología 30%, Pediatría 30%. 
        // Obtener la cantidad de dinero que recibirá cada área, para cualquier 
        // cantidad de presupuesto
        
        // VARIABLES
        double presupuesto;
        
        // CONSTANTES
        final double PORCENTAJE_GINECOLOGIA = 0.4;
        final double PORCENTAJE_TRAUMATOLOGIA = 0.3;
        final double PORCENTAJE_PEDIATRIA = 0.3;
        
        // Pido el presupuesto total que tiene el hospital
        System.out.println("¿Qué presupuesto tiene el hospital?");
        
        Scanner entradaTeclado = new Scanner(System.in);
        presupuesto = entradaTeclado.nextDouble();
        
        // Para saber el presupuesto de cada parte, se multiplica el porcentaje
        // por el presupuesto total
        double dineroGinecologia = PORCENTAJE_GINECOLOGIA*presupuesto;
        double dineroTraumatologia = PORCENTAJE_TRAUMATOLOGIA*presupuesto;
        double dineroPediatria= PORCENTAJE_PEDIATRIA*presupuesto;
        
        // Muestro el resultado por pantalla
        System.out.println("""
                        Teniendo un presupuesto de %.2f €,
                        ginecología tendrá %.2f €,
                        traumatología %.2f € y
                        pediatría %.2f €.
                        """.formatted(presupuesto, dineroGinecologia,
                                dineroTraumatologia, dineroPediatria));
       
    }
}
