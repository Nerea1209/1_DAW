/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerea;

import java.util.Random;

/**
 *
 * @author Nerea
 */
public class ValoresAleatorios {
    public static void main(String[] args) {

        // Objeto random para crear valores aleatorios
        Random random = new Random();

        // El método nextInt() genera un número int aleaotorio entre 
        // Integer.MAX_VALUE e Integer.MIN_VALUE
        int enteroAleatorio = random.nextInt();
        System.out.println("Entero aleatorio: " + enteroAleatorio);

        // El método nextInt(int valor) genera un int aleaotorio entre 0 y 
        // valor, exluyendo valor
        enteroAleatorio = random.nextInt(100); // 0 - 99
        System.out.println("Entero aleatorio (0-99): " + enteroAleatorio);

        // De la siguiente forma, obtenemos un número entre 1 y valor
        enteroAleatorio = random.nextInt(100) + 1;
        System.out.println("Entero aleatorio (1-100): " + enteroAleatorio);

        // Ahora entre n y m
        int n = 10, m = 20;
        enteroAleatorio = random.nextInt(m - n + 1) + n;
        System.out.println("Entero aleatorio (n-m): " + enteroAleatorio);

        // También se pueden generar varios números aleatorios a la vez, usando
        // Streams
        // El siguiente ejemplo guarda en un array de tamaño tam 
        // un conjunto de enteros aleatorios.
        // Los números están entre Integer.MAX_VALUE e Integer.MIN_VALUE
        // random.ints(cantidad_numeros_a_generar) devuelve un IntStream de
        // tamaño cantidad_numeros_a_generar. Con el método toArray() se 
        // guardan en un array de ese tamaño
        int tam = 10; // 15 enteros aleatorios dentro del rango de los int
        int[] intAleatorios = random.ints(tam).toArray();

        // array.length me da el tamaño del array
        for (int i = 0; i < intAleatorios.length; i++) {
            System.out.print(intAleatorios[i] + " # ");
        }

        System.out.println("\b\b");

        // Se puede limitar el rango, por ejemplo entre -30 y 30
        // Rango real es entre -30 y 29
        intAleatorios = random.ints(tam, -3, 3).toArray();

        for (int i = 0; i < intAleatorios.length; i++) {
            System.out.print(intAleatorios[i] + " # ");
        }

        System.out.println("\b\b");
        
        // De la misma forma se pueden crear números long, con el método
        // random.longs, y números double, con random.doubles
        
        // Para generar letras minúsculas
        // Se genera un número entre 0 y 25 (número de letras de a hasta z)
        // y luego se añade la letra incial del rango, en este caso 'a'
        char letraMinus = (char)(random.nextInt(26) + 'a');
        System.out.println("Letra minúscula " + letraMinus);
        
        // Para generar letras mayúsculas
        // Se genera un número entre 0 y 25 (número de letras de A hasta Z)
        // y luego se añade la letra incial del rango, en este caso 'A'
        char letraMayus = (char)(random.nextInt(26) + 'A');
        System.out.println("Letra mayúscula " + letraMayus);
        
        // Otra opción es usando un String y el método charAt
        final String LETRAS = "abcdefghijklmnñopqrstuvwxyz";
        int indiceLetraSacar = random.nextInt(LETRAS.length());
        // El método charAt devuelve un char del String que ocupa la posición
        // indice
        char letra = LETRAS.charAt(indiceLetraSacar);
        System.out.println("Letra sacada: " + letra);
    }
}
