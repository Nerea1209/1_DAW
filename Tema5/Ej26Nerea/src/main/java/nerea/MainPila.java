/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerea;

/**
 *
 * @author nerea
 */
public class MainPila {
    
    public static void main(String[] args) {
        
        Pila<String> pilaString = new Pila<>();
        
        pilaString.push("Hola");
        pilaString.push("Buenos días");
        pilaString.push("Adiós");
        pilaString.push("Buenas noches");
        pilaString.push("Buenas tardes");
        
        pilaString.mostrarElementos();
        System.out.println("");
        
        pilaString.pop();
        
        pilaString.mostrarElementos();
        System.out.println("");
        
        System.out.println("¿Está llena la pila? " + pilaString.estaLlena());
        
        System.out.println("¿Está vacía la pila? " + pilaString.estaVacia());
        System.out.println("");
        
        pilaString.mostrarPilaSegunSalida();
        System.out.println("");
        
        System.out.println("¿Cuántos elementos tiene la pila? " + pilaString.numElementos());
        System.out.println("");
        
        String[] arrayString = {"uno", "dos", "tres", "cuatro", "cinco", "seis"};
        pilaString.rellenarPila(arrayString);
        
        pilaString.mostrarElementos();
        System.out.println("");
        
        pilaString.sacarElementos();
        
        pilaString.mostrarElementos();
    }
    
}
