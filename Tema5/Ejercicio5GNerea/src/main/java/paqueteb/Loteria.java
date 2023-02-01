/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteb;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nerea
 */
public class Loteria {

    private Map<String, Integer> loteria = new HashMap<>();
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        Loteria loteria = new Loteria();

        for (int i = 0; loteria.loteria.size() <= 1000; i++) {
            loteria.guardarEntrada(generarDecimo(), generarPremio());
        }

//        loteria.loteria.forEach((clave, valor) -> System.out.println(clave + "  ------  " + valor));
//        loteria.guardarEntrada(generarDecimo(), 400_000);
//        loteria.guardarEntrada(generarDecimo(), 125_000);
//        loteria.guardarEntrada(generarDecimo(), 50_000);
//        loteria.guardarEntrada(generarDecimo(), 20_000);
//        loteria.guardarEntrada(generarDecimo(), 20_000);
//        loteria.guardarEntrada(generarDecimo(), 6_000);
//        loteria.guardarEntrada(generarDecimo(), 6_000);
//        loteria.guardarEntrada(generarDecimo(), 6_000);
//        loteria.guardarEntrada(generarDecimo(), 6_000);
//        loteria.guardarEntrada(generarDecimo(), 6_000);
//        loteria.guardarEntrada(generarDecimo(), 6_000);
//        loteria.guardarEntrada(generarDecimo(), 6_000);
//        loteria.guardarEntrada(generarDecimo(), 6_000);
        loteria.mostrarLoteria();
//
        String decimoUsuario = pedirDecimoUsuario();
        int premio = loteria.decirPremio(decimoUsuario);
        
        if (premio != 0) {
            System.out.println("Su premio es " + premio);
        } else {
            System.out.println("No tiene ningún premio");
        }

    }

    public Integer decirPremio(String decimoUsuario) {

//        int intDecimoUSuario = Integer.parseInt(decimoUsuario);
//        int delante = intDecimoUSuario + 1;
//        int detras = intDecimoUSuario - 1;
        if (this.loteria.containsKey(decimoUsuario)) {
            return this.loteria.get(decimoUsuario);
//        } else if (this.loteria.get(String.valueOf(delante)) == 400_000
//                || this.loteria.get(String.valueOf(detras)) == 400_000) {
//            premio = 2_000;
//        } else if (this.loteria.get(String.valueOf(delante)) == 125_000
//                || this.loteria.get(String.valueOf(detras)) == 125_000) {
//            premio = 1_250;
//        } else if (this.loteria.get(String.valueOf(delante)) == 50_000
//                || this.loteria.get(String.valueOf(detras)) == 50_000) {
//            premio = 960;
//        } else if(this.loteria.containsKey(delante)){
//            return this.loteria.get(decimoUsuario);
        }

        return 0;
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

    public void guardarEntrada(String decimo, int premio) {
        loteria.put(decimo, premio);
    }

    public List<String> crearListaDecimosPremiados() {
        return new ArrayList<>(loteria.keySet());
    }

    public List<Integer> crearListaPremios() {
        return new ArrayList<>(loteria.values());
    }

    public void mostrarLoteria() {
        loteria.forEach((clave, valor) -> System.out.println(clave.formatted("%5d") + "  ------  " + valor));
    }

    public static String generarDecimo() {
        int aleatorio = new Random().nextInt(0, 100000);
        Formatter fmt = new Formatter();
        fmt.format("%05d", aleatorio);
        return "" + fmt;
    }

    public static Integer generarPremio() {
        return new Random().nextInt(0, 400000);

    }

}
