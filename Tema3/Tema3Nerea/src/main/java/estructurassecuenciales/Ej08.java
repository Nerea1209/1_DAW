/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurassecuenciales;

/**
 *
 * @author ubuntu
 */
public class Ej08 {

    public static void main(String args[]) {
        char departamento = 'B';

        switch (departamento) {
            case 'A':
                System.out.println("Desarrollo");
                break;
            case 'B':
                System.out.println("Recursos Humanos");
            break;
            case 'C':
                System.out.println("Finanzas");
                break;
            case 'D':
                System.out.println("Mercadeo");
            default:
                System.out.println("Departamento no válido");
      }
      System.out.println(
        "Código para el departamento es " + departamento);
      
      /*
      Imprime "Recursos Humanos" y "Código para el departaento es B"
      Ya que departamento no es A, pasa al siguiente caso, departamento es B,
      hace ese caso y ya salta el switch entero, sin comprobar los demás.
      Luego pasa a imprimir el código del departamento.
      */
   }
}
