/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package nerea;

/**
 *
 * @author nerea
 */
public class Fibonachi {

    public static void main(String[] args) {

        System.out.println(fibonachiRecursivo(6));
        System.out.println(fibonachiIterativo(6));

    }

    public static int fibonachiRecursivo(int n) {
        n = Math.abs(n);
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonachiRecursivo(n - 1) + fibonachiRecursivo(n - 2);
        }
    }

    public static int fibonachiIterativo(int n) {
        n = Math.abs(n);
        int[] factorial = new int[n + 1];
        int resultado = 0;
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                factorial[i] = 0;
                resultado = 0;
            } else if (i == 1) {
                factorial[i] = 1;
                resultado = 1;
            } else {
                factorial[i] = factorial[i - 1] + factorial[i - 2];
                resultado = factorial[i];
            }
            
        }
        return resultado;
    }
}