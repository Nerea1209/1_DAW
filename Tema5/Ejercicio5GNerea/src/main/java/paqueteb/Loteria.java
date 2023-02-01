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

        // Crea una loteria por defecto
        Loteria loteria = new Loteria();

        // Guarda una entrada en el map de loteria con un decimo
        // aleatorio y un premio aleatorio de hasta 400_000€ mil veces
        for (int i = 0; loteria.loteria.size() <= 1000; i++) {
            loteria.guardarEntrada(generarDecimo(), generarPremio());
        }

        // Imprime el contenido del map
        loteria.mostrarLoteria();

        // Pedimos el numero del decimo que quiere comprobar el usuario
        String decimoUsuario = pedirDecimoUsuario();

        // Vemos si tiene premio
        int premio = loteria.decirPremio(decimoUsuario);

        // Si tiene le decimos la cantidad
        if (premio != 0) {
            System.out.println("Su premio es " + premio);
        } else { // Si no le decimos que no tiene ningún premio
            System.out.println("No tiene ningún premio");
        }
    }

    // MÉTODOS
    // Si el decimo del usuario tiene premio devuelve la cantidad y sino 0
    public Integer decirPremio(String decimoUsuario) {
        if (this.loteria.containsKey(decimoUsuario)) {
            return this.loteria.get(decimoUsuario);
        }
        return 0;
    }

    // Controlamos que mete un numero de 5 cifras como maximo
    public static String pedirDecimoUsuario() {
        String decimo = "";
        do {
            System.out.println("Introduce su número de décimo para comprobar premio");
        } while (Double.parseDouble(decimo) < 0 || Double.parseDouble(decimo) > 99999);
        return decimo;
    }

    // Hacemos entry con clave y valor
    public void guardarEntrada(String decimo, int premio) {
        loteria.put(decimo, premio);
    }

    // Creamos lista de claves
    public List<String> crearListaDecimosPremiados() {
        return new ArrayList<>(loteria.keySet());
    }

    // Creamos lista de premios
    public List<Integer> crearListaPremios() {
        return new ArrayList<>(loteria.values());
    }

    // Imprime los datos de la loteria
    public void mostrarLoteria() {
        loteria.forEach((clave, valor) -> System.out.println(clave.formatted("%5d") + "  ------  " + valor));
    }

    // Genera decimos aleatorios de 5 cifras, rellenando con ceros
    public static String generarDecimo() {
        int aleatorio = new Random().nextInt(0, 100000);
        Formatter fmt = new Formatter();
        fmt.format("%05d", aleatorio);
        return "" + fmt;
    }

    // Genera premios
    public static Integer generarPremio() {
        return new Random().nextInt(0, 400000);

    }

    /*
    Ignora esto :)
    Al principio tenía una idea de programa de loteria realista,
    mostrando los decimos bola a bola del primer premio, segundo, tercero, etc
    Además de tener premio por tener el numero anterior y posterior,
    centena, pedrea, ultima cifra, etc,
    Pero, me estaba costando mucho con map y resulta que solo tenía que hacer
    decimos y premios aleatorios >>>
     */
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
//        int intDecimoUSuario = Integer.parseInt(decimoUsuario);
//        int delante = intDecimoUSuario + 1;
//        int detras = intDecimoUSuario - 1;
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
