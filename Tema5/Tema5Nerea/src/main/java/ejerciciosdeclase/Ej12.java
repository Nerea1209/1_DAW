/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejerciciosdeclase;

/**
 *
 * @author nerea
 */
public class Ej12 {

    /*
    Declara e inicializa una matriz de caracteres de 2x3, con los valores que 
    tú quieras. Implementa un método, en la misma clase que el método main(), 
    que reciba una matriz de caracteres y la imprima por consola.
    */
    
    public static void main(String[] args) {
        char[][] matriz = {{'a', 'b', 'c'},{'c', 'b', 'a'}};
        imprimirMatriz(matriz);
    }
    
    public static void imprimirMatriz(char[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "  ");
                if(j == matriz[i].length -1){
                    System.out.println("");
                }
            } //j
        } //i
    }
}
