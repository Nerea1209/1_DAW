/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteb;

import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author Nerea
 */
public class Loteria {

    private SortedMap<String, Double> loteria = new TreeMap<>();
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        Loteria loteria = new Loteria();
        loteria.guardarEntrada(generarDecimo(), 400_000);
        loteria.guardarEntrada(generarDecimo(), 125_000);
        loteria.guardarEntrada(generarDecimo(), 50_000);
        loteria.guardarEntrada(generarDecimo(), 20_000);
        loteria.guardarEntrada(generarDecimo(), 20_000);
        loteria.guardarEntrada(generarDecimo(), 6_000);
        loteria.guardarEntrada(generarDecimo(), 6_000);
        loteria.guardarEntrada(generarDecimo(), 6_000);
        loteria.guardarEntrada(generarDecimo(), 6_000);
        loteria.guardarEntrada(generarDecimo(), 6_000);
        loteria.guardarEntrada(generarDecimo(), 6_000);
        loteria.guardarEntrada(generarDecimo(), 6_000);
        loteria.guardarEntrada(generarDecimo(), 6_000);
        
        loteria.mostrarPremios();

        String decimoUsuario = pedirDecimoUsuario();
        loteria.decirPremio(decimoUsuario);

    }

    public Double decirPremio(String decimoUsuario) {
        double premio = 0;
        double doubleDecimoUSuario = Double.parseDouble(decimoUsuario);
        if (recibirPremio(decimoUsuario) == 0){
            if (this.loteria.get(String.valueOf(doubleDecimoUSuario + 1)) == 400_000 
                    || this.loteria.get(String.valueOf(doubleDecimoUSuario - 1)) == 400_000) {
                premio = 2_000;
                System.out.println("Su premio es " + premio);
            } else if (this.loteria.get(String.valueOf(doubleDecimoUSuario + 1)) == 125_000 
                    || this.loteria.get(String.valueOf(doubleDecimoUSuario - 1)) == 125_000) {
                premio = 1_250;
                System.out.println("Su premio es " + premio);
            } else if (this.loteria.get(String.valueOf(doubleDecimoUSuario + 1)) == 50_000 
                    || this.loteria.get(String.valueOf(doubleDecimoUSuario - 1)) == 50_000) {
                premio = 960;
                System.out.println("Su premio es " + premio);
            } else {
                System.out.println("No tiene ningún premio.");
                premio = 0;
            }
        }
        return premio;
    }

    public static String pedirDecimoUsuario() {
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
        } while (Double.parseDouble(decimo) < 0 || Double.parseDouble(decimo) > 99999);
        return decimo;
    }

    public void guardarEntrada(String decimo, double premio) {
        loteria.put(decimo, premio);
    }

    public Set<String> crearListaDecimosPremiados() {
        return loteria.keySet();
    }

    public Collection<Double> crearListaPremios() {
        return loteria.values();
    }

    public void mostrarLoteria() {
        loteria.forEach((clave, valor) -> System.out.println(clave + "  ------  " + valor));
    }

    public static String generarDecimo() {
        return "" + new Random().nextInt(0, 100000);
    }
    
    public void mostrarPremios(){
         loteria.forEach((clave, valor) -> System.out.println( clave + "  ------  " + valor));
    }
    
    public double recibirPremio(String decimo){
        if (this.loteria.get(decimo) != null){
        return this.loteria.get(decimo);
        } else {
            return 0;
        }
    }

}
