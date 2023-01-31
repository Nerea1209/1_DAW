/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Random;

/**
 *
 * @author nerea
 */
public class Repaso {
    private static Random generador = new Random();
    /*
    Los clientes de una tienda casi siempre tienen descuento al llegar a pagar
    a la caja durante la semana loca. Cuando van a pagar tienen que sacar una
    bola de una bolsa, que es la que nos indica el descuento.
    Si la bola es de color azul se obtiene un 20%,
    si es roja un 25%,
    si es blanca no hay descuento
    y si es verde, se saca de la bolsa y vuelve a sacar otra de las restantes.
    Escribe un programa que lea el importe a pagar por el cliente e imprima la 
    bola que “sacó” de la bolsa y el importe con el descuento aplicado.
El programa, una vez finaliza un cliente, pregunta si hay otro en la cola para 
    operar de la misma forma. Si no hay clientes, el programa termina.
    Scanner y Excepciones
    */
    public static int generarAleatorioRangoNuevo(int minimo, int maximo) {
        Random generador = new Random();
        return generador.nextInt(minimo, maximo++);
    }
    public static String colorBola(){
        String color = "";
        int numBola = generarAleatorioRangoNuevo(1,4);
        if (numBola == 1){
            color = "azul";
        }
    
    }
}
