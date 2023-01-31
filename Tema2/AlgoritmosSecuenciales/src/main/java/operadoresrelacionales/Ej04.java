/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadoresrelacionales;

/**
 *
 * @author ubuntu
 */
public class Ej04 {
    
    public static void main(String[] args) {
        /*
        En el proyecto Tema2+tunombre, crea una nueva clase llamada Ej04, 
        dentro del paquete operadoresrelacionales, que contenga una llamada 
        al método public static void main(String[] args). La aplicación Java 
        contendrá comentarios descriptivos del código y realizará lo siguiente:
	a.- Declara e inicializa dos variables int (a=10,  b=20).
	b.- Declara cuatro variables booleanas.
        c.- Guarda, en las variables booleanas, el resultado de realizar 
        las siguientes operaciones relacionales: a<b, a>b, a==b, a!=b.
	d.- Muestra en pantalla el resultado de las operaciones, usando 
        las variables booleanas.
        */
        
        // Declara e inicializa dos variables int (a=10,  b=20).
        int a =10;
        int b = 20;
        
        // Declara cuatro variables booleanas.
        boolean booleana1;
        boolean booleana2;
        boolean booleana3;
        boolean booleana4;
        
        // Guarda, en las variables booleanas, el resultado de realizar 
        // las siguientes operaciones relacionales: a<b, a>b, a==b, a!=b.
        booleana1 = a<b;
        booleana2 = a>b;
        booleana3 = a==b;
        booleana4 = a!=b;
        
        // Muestra en pantalla el resultado de las operaciones, usando 
        // las variables booleanas.
        String resultado = ("""
                           ¿ %d < %d ? %b
                           ¿ %d > %d ? %b
                           ¿ %d = %d ? %b
                           ¿ %d ≠ %d ? %b
                           """.formatted(a, b, booleana1,
                                   a, b, booleana2, a, 
                                   b, booleana3, a, b, 
                                   booleana4));
        
        System.out.println(resultado);
    }
    
}
