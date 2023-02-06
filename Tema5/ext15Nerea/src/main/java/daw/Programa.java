/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author nerea
 */
public class Programa {
    
    
    
    public static void main(String[] args) {
        
        int year = pedirYear();
        Calendario.imprimirCalendarios(Calendario.calendarioAnual(year));
        int dia = pedirDia();
        int mes = pedirMes();
        System.out.println(Calendario.diaSemana(dia, new Calendario(mes, year)));
    }
    
    public static int pedirYear(){
        int year = 0;
        Scanner teclado = new Scanner(System.in);
        do {            
            System.out.println("Inserte un año entre 1950 y 2050");
            try {
                year = teclado.nextInt();
            } catch (InputMismatchException ime) {
                teclado.nextLine(); // Limpiamos buffer
                System.out.println("""
                                   No has introducido un número entero.
                                   Por favor, inténtelo de nuevo.""");
            }
        } while (year < 1950 || year > 2050);
        return year;
    }
    
    public static int pedirDia(){
        int dia = 0;
        Scanner teclado = new Scanner(System.in);
        do {            
            System.out.println("Inserte un día");
            try {
                dia = teclado.nextInt();
            } catch (InputMismatchException ime) {
                teclado.nextLine(); // Limpiamos buffer
                System.out.println("""
                                   No has introducido un número entero.
                                   Por favor, inténtelo de nuevo.""");
            }
        } while (dia < 1|| dia > 31);
        return dia;
    }
    
    public static int pedirMes(){
        int mes = 0;
        Scanner teclado = new Scanner(System.in);
        do {            
            System.out.println("Inserte un mes");
            try {
                mes = teclado.nextInt();
            } catch (InputMismatchException ime) {
                teclado.nextLine(); // Limpiamos buffer
                System.out.println("""
                                   No has introducido un número entero.
                                   Por favor, inténtelo de nuevo.""");
            }
        } while (mes < 1|| mes > 12);
        return mes;
    }
    
    
    
}
