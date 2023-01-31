/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package variables;

/**
 *
 * @author nerea
 */
public class Ej01 {

    public static void main(String[] args) {
        // Declara una variable primitiva de cada uno de los tipos estudiados.
        byte entero;
        short entero2;
        int entero3;
        long entero4;
        float real;
        double real2;
        char letra;
        boolean decision;
        
        // Declara una constante numérica de tipo double y otra de tipo int.
        // Presta especial atención a la hora de poner el nombre de estas 
        // constantes y usa el modificador final.
        
        final double DIA;
        final int AÑO;
        
        // Declara un objeto String.
        
        String texto;
        
        //Inicializa las variables, las constantes y el objeto con literales 
        // de tu elección.
        
        entero = 110;
        entero2 = -750;
        entero3 = 258_689;
        entero4 = 552_498_498L;
        real = -1.58846f;
        real2 = 3.6549890978756458;
        letra = 'e';
        decision = true;
        
        DIA = 12;
        AÑO = 2018;
        
        texto = "Hola Vico";
        
        // Muestra en pantalla cada una de las variables, constantes y 
        // objetos anteriores, en distintas líneas, usando println().
        
        System.out.println("El número entero tipo byte es " + entero);
        System.out.println("El número entero tipo short es " + entero2);
        System.out.println("El número entero tipo int es " + entero3);
        System.out.println("El número entero tipo long es " + entero4);
        // Utilizaprintf(), para limitar a dos dígitos la salida de 
        // variables de tipo float y double.
        System.out.printf("El número real tipo float es %.2f", real);
        System.out.printf("El número real tipo double es %.2f", real2);
        System.out.println("El caracter unicode tipo char es " + letra);
        System.out.println("El booleano es " + decision);
        System.out.println("Tipo final double (constante) es " + DIA);
        System.out.println("Tipo final int (constante) es " + AÑO);
        System.out.println("Texto, String es " + texto);
        
    }
}
