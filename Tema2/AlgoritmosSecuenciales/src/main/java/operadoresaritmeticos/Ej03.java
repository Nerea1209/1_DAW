/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadoresaritmeticos;

/**
 *
 * @author nerea
 */
public class Ej03 {
    
    public static void main(String[] args) {
        
        // Declara e inicializa tres variables int (a=10,  b=5, i=0)
        int a = 10;
        int b = 5;
        int i = 0;
        
        // Declara e inicializa dos variables double (c=71.3 y d=4.8)
        double c = 71.3;
        double d = 4.8;
        
        /*
        Realiza las siguiente operaciones aritméticas a+b, a-b, a*b, 
        a/b, c+d, c-d, c*d, c/d. El resultado de cada operación se almacena 
        en una nuevas variables que se crearán para tal efecto, con el nombre 
        que tú decidas, siempre siguiendo las recomendaciones de legibilidad 
        de código.        
        */
        
        int suma1 = (a + b);
        int resta1 = (a - b);
        int multiplicacion1 = (a * b);
        int division1 = (a / b);
        double suma2 = (c + d);
        double resta2 = (c - d);
        double multiplicacion2 = (c * d);
        double division2 = (c / d);
        
        // Muestra el resultado de cada operación usando text blocks, 
        // usando las variables creadas en el paso c).
        
        String resultado1 = """
                           %d + %d = %d 
                           %d - %d = %d 
                           %d * %d = %d 
                           %d / %d = %d 
                           %.2f + %.1f = %.2f 
                           %.2f - %.1f = %.2f 
                           %.2f * %.1f = %.2f 
                           %.2f / %.1f = %.2f 
                           """.formatted(a, b, suma1, a, b, resta1, a, b,
                                   multiplicacion1, a, b, division1, c, d,
                                   suma2, c, d, resta2, c , d, multiplicacion2,
                                   c, d, division2);
        
        System.out.println(resultado1);
        
        //También muestra en pantalla los resultados de las siguientes 
        // operaciones: a*=3, b-=1, a/=b, c+=d.
        
        a*=3; // a = 10 * 3 = 30
        System.out.println("a = " + a);
        b-=1; // b = 5 - 1 = 4
        a/=b; // a =  30 / 4 = 7
        c+=d; // c = 71.3 + 4.8 = 76.1
        
        String resultado2 = """
                            b = %d
                            a = %d
                            c = %.2f
                            """;
        
        System.out.printf(resultado2.formatted(b,
           a, c));
        
        /*
        Finalmente, el programa muestra en consola la siguiente 
        información, en distintas instrucciones: valor de i, valor de i++, 
        valor de i y valor de ++i.
        */
        
        System.out.println("Valor de i: " + i); // i = 0
        System.out.println("Valor de i++: " + (i++)); // i = 0 + 1 = 1
        System.out.println("Valor de i: " + i); // i = 1
        System.out.println("Valor de i++: " + (++i)); // i = 1 + 1 = 2
        
        // Módulo
        a = 11;
        b = 5;
        
        int cociente = a/b;
        int resto = a%b; // El resto solo funciona con int
        
        
        
                
    }
     
}
