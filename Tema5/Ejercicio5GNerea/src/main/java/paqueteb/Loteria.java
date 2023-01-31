/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteb;

import java.util.Collection;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;



/**
 *
 * @author Nerea
 */
public class Loteria {
    
    private Map<String, Double> loteria = new HashMap<>();
    private static Scanner teclado = new Scanner(System.in);
    
   public static void main(String[] args) {
        
       Loteria loteria = new Loteria();
       loteria.guardarEntrada(generarDecimo(), 400_000);
       loteria.guardarEntrada(generarDecimo(), 125_000);
       loteria.guardarEntrada(generarDecimo(), 50_000);
       loteria.guardarEntrada(generarDecimo(), 20_000);
       loteria.guardarEntrada(generarDecimo(), 6_000);
       
       String decimoUsuario = pedirDecimoUsuario();
       
//       if (decimoUsuario.equals(loteria.loteria.)) {
//           
//       }
        
    }
    
    public static String pedirDecimoUsuario(){
        String decimo = "";
        do {            
            System.out.println("Introduce su número de décimo para comprobar premio");
            try {
              decimo = teclado.nextLine();
            } catch (InputMismatchException ime) {
                teclado.nextLine();
                System.out.println("""
                                   No has introducido un número entero.
                                   Por favor, vuelve a intentarlo.""");
            }
        } while (Integer.parseInt(decimo) < 0 || Integer.parseInt(decimo) > 99999);
        return decimo;
    }

    public void guardarEntrada(String decimo, double premio){
        loteria.put(decimo, premio);
    }
    
    public double decirPremio(String decimo){
        return loteria.get(decimo);
    }
    
    public Set<String> crearListaDecimosPremiados(){
        return loteria.keySet();
    }
    
    public Collection<Double> crearListaPremios(){
        return loteria.values();
    }
    
    public void mostrarLoteria(){
         loteria.forEach((clave, valor) -> System.out.println( clave + "  ------  " + valor));
    }
    
    public static String generarDecimo(){
        return "" + new Random().nextInt(0, 100000);
    }
    
 
   
    
    
    
}
