/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurassecuenciales;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ubuntu
 */
public class Ej06 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;

        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("4. Finalizar");

        System.out.print("Elija una opción: ");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            System.out.println("Ha seleccionado calcular el área de "
                    + "un cuadrado...");
            double ladoCuadrado = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Introduce la medida de un lado del cuadrado"));
            double areaCuadrado = ladoCuadrado * ladoCuadrado;
            JOptionPane.showMessageDialog(null, "El área del "
                    + "cuadrado es " + areaCuadrado);

        } else if (opcion == 2) {
            System.out.println("Ha seleccionado calcular el "
                    + "área de un triángulo...");
            double baseTriangulo = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Introduce la medida de la base del triángulo"));
            double alturaTriangulo = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Introduce la medida de la altura del triángulo"));
            double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
            JOptionPane.showMessageDialog(null, "El área del "
                    + "triángulo es " + areaTriangulo);
        } else if (opcion == 3) {
            System.out.println("Ha seleccionado calcular el área de un círculo...");
            double radioCirculo = Double.parseDouble(
                    JOptionPane.showInputDialog("Introduce la medida del radio del circulo"));
            double areaCirculo = Math.PI * Math.pow(radioCirculo, 2);
            JOptionPane.showMessageDialog(null, "El área del "
                    + "circulo es " + areaCirculo);
        } else if (opcion == 4) {
            System.out.println("Ha seleccionado terminar");
        } else {
            System.out.println("Opción no válida");
        }
    }
}
