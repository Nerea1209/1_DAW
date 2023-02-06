/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package nerea;

/**
 *
 * @author nerea
 */
public class FactorialIterativo {

    public static void main(String[] args) {

        System.out.println(factorial(3));
        System.out.println(factorialRecursivo(5));
    }

    public static int factorial(int n) {
        int factorial = 1;
        if (n >= 0 && n >= 2) {
            for (int i = 0; i < n; i++) {
                factorial *= n - i;
            }
        }
        return factorial;
    }
   
    
     public static int factorialRecursivo(int n) {
        int factorial = 1;
        if (n >= 0 && n >= 2) {
            factorial = n * factorialRecursivo(n - 1);
        }
        return factorial;
    }
}
