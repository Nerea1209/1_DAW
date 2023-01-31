/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadoresbooleanos;

/**
 *
 * @author ubuntu
 */
public class Ej05 {
    
    public static void main(String[] args) {
        
        // Declara e inicializa dos variables lógicas, una se llamará 
        // verdadero y valdrá true, la otra falso y valdrá false.
        boolean verdadero = true;
        boolean falso = false;
        boolean operacionLogica1 = verdadero && verdadero;
        boolean operacionLogica2 = verdadero && falso;
        boolean operacionLogica3 = falso && verdadero;
        boolean operacionLogica4 = falso && falso;
        boolean operacionLogica5 = verdadero || verdadero;
        boolean operacionLogica6 = verdadero || falso;
        boolean operacionLogica7 = falso || verdadero;
        boolean operacionLogica8 = falso || falso;
        
        /*
        Muestra las tablas de verdad de las operaciones lógicas && (AND) 
        y || (OR), usando las variables verdadero y falso. Usa text blocks y 
        la instrucción println() para mostrar los resultados de evaluar 
        las siguientes expresiones lógicas:
        */
        
        String operacionesLogicas = """
                             %b && %b = %b
                             %b && %b = %b
                             %b && %b = %b
                             %b && %b = %b
                             %b || %b = %b
                             %b || %b = %b
                             %b || %b = %b
                             %b || %b = %b
                             """.formatted(verdadero,verdadero,
                                     operacionLogica1, verdadero, 
                                     falso, operacionLogica2, falso,
                                     verdadero, operacionLogica3, 
                                     falso, falso, operacionLogica4,
                                     verdadero, verdadero, operacionLogica5,
                                     verdadero, falso, operacionLogica6,
                                     falso, verdadero,operacionLogica7,
                                     falso, falso,operacionLogica8);
        
        System.out.println(operacionesLogicas);
        
        // Muestra en pantalla el resultado de las 
        // expresiones !verdadero y !falso.
        System.out.println("La negación de "+ verdadero + " es " + !verdadero);
        System.out.println("La negación de "+ falso + " es " + !falso);
    }
}
