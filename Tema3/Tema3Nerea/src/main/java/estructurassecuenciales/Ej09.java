/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurassecuenciales;

/**
 *
 * @author ubuntu
 */
public class Ej09 {

    public static void main(String[] args) {

        int variable = 3, variable2;
        switch (variable) {

            case 1:
                variable2 = 5;
                break;
            case 2:
                variable2 = 20;
                break;
            case 3:
                variable2 = 30;
            case 4:
                variable2 = 10;
            default:
                variable2 = 100;
                break;

        }
        System.out.println(variable2);
        // variable2=100 ya que no pone "break" en el caso 3 y 4.
        // Entoces salta el caso 1, pasa al siguiente, salta el caso 2, 
        // pasa al siguiente, hace el caso 3 (variable2=30), pasa al siguiente,
        // hace el caso 4 (variable2=10), pasa al siguiente, hace el default
        // (variable2=100) y termina el swith
    }

}
