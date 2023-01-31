/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmossecuenciales;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ubuntu
 */
public class Algoritmo12 {

    public static void main(String[] args) {

        /*Diseñar un algoritmo que nos diga el dinero que tenemos
        (en euros y céntimos) después de pedirnos cuantas monedas tenemos 
        (de 2€, 1€, 50 céntimos, 20 céntimos o 10 céntimos) */
        int euros;
        double centimosEnEuros;
        double centimos;
        int monedasDosEuros;
        int monedasUnEuro;
        int monedasCincuentaCentimos;
        int monedasVeinteCentimos;
        int monedasDiezCentimos;

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("¿Cuántas monedas de 2 € tienes?");
        monedasDosEuros = entradaTeclado.nextInt();

        System.out.println("¿Cuántas monedas de 1 € tienes?");
        monedasUnEuro = entradaTeclado.nextInt();

        String stringCincuentaCentimos = JOptionPane.showInputDialog(
                "¿Cuántas monedas de 50 cétimos tienes?");
        monedasCincuentaCentimos = Integer.parseInt(stringCincuentaCentimos);
        JOptionPane.showMessageDialog(null, "Tienes "
                + monedasCincuentaCentimos + " monedas de 50 céntimos");

        String stringVeinteCentimos = JOptionPane.showInputDialog(
                "¿Cuántas monedas de 20 cétimos tienes?");
        monedasVeinteCentimos = Integer.parseInt(stringVeinteCentimos);
        JOptionPane.showMessageDialog(null, "Tienes "
                + monedasVeinteCentimos + " monedas de 20 céntimos");

        System.out.println("¿Cuántas monedas de 10 céntimos tienes?");
        monedasDiezCentimos = entradaTeclado.nextInt();

        int dosEuros = monedasDosEuros * 200;
        int unEuro = monedasUnEuro * 100;
        int cincuentaCentimos = monedasCincuentaCentimos * 50;
        int veinteCentimos = monedasVeinteCentimos * 20;
        int diezCentimos = monedasDiezCentimos * 10;

        int centimosTotales = dosEuros + unEuro + cincuentaCentimos
                + veinteCentimos + diezCentimos;

        euros = centimosTotales / 100; // Euros
        centimosEnEuros = ((double) centimosTotales / 100) - euros; // Céntimos
        centimos = centimosEnEuros * 100;

        String resultado = """
                           Tienes %d monedas de 2€ = %d céntimos
                           Tienes %d monedas de 1€ = %d céntimos
                           Tienes %d monedas de 50 céntimos = %d céntimos
                           Tienes %d monedas de 20 céntimos = %d céntimos
                           Tienes %d monedas de 10 céntimos = %d céntimos
                           En total, tienes %d euros y %.0f céntimos.
                           """.formatted(monedasDosEuros, dosEuros,
                monedasUnEuro, unEuro, monedasCincuentaCentimos,
                cincuentaCentimos, monedasVeinteCentimos, veinteCentimos,
                monedasDiezCentimos, diezCentimos,
                euros, centimos);

        JOptionPane.showMessageDialog(null, resultado);

    }

}
