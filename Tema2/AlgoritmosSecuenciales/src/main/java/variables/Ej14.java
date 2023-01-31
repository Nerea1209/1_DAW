/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variables;

import java.util.Scanner;

/**
 *
 * @author ubuntu
 */
public class Ej14 {
    
    public static void main(String[] args) {
        
        /*
        8.- Crea una nueva clase llamada Ej14, que contenga una llamada 
        al método public static void main(String[] args). El programa 
        tendrá una variable entera tiempo inicializada con un valor leído 
        por teclado, en segundos, y queremos conocer este tiempo pero 
        expresado en horas, minutos y segundos, mostrando los resultados 
        por pantalla.
        */
        
        int tiempo;
        int horas;
        int minutos;
        int minutos1;
        int segundos;
        final int CONVERSOR = 60;
        
        System.out.println("Inserte el tiempo en segundos:");
        Scanner entradaTeclado = new Scanner(System.in);
        tiempo = entradaTeclado.nextInt();
        
        minutos1 = tiempo / CONVERSOR;
        segundos = tiempo % CONVERSOR;
        horas = minutos1 / CONVERSOR;
        minutos = minutos1 % CONVERSOR;
        
        System.out.println(tiempo + " segundos son " + horas + " horas "
        + minutos + " minutos " + segundos + " segundos.");
        
        
    }
    
}
