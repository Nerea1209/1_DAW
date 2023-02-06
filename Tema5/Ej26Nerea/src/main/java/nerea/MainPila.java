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
        
        
        
        Pila<Cancion> pilaCancion = new Pila<>();
        
        Cancion c1 = new Cancion("Ahora y siempre", "Quevedo", 3.45);
        Cancion c2 = new Cancion("Quedate", "Quevedo", 4.56);
        Cancion c3 = new Cancion("La vida de antes", "Funambulista", 3.22);
        
        pilaCancion.push(c1);
        pilaCancion.push(c2);
        pilaCancion.push(c3);
        
        pilaCancion.mostrarElementos();
        System.out.println("");
        
        pilaCancion.pop();
        
        pilaCancion.mostrarElementos();
        System.out.println("");
        
        System.out.println("¿Está llena la pila? " + pilaCancion.estaLlena());
        
        System.out.println("¿Está vacía la pila? " + pilaCancion.estaVacia());
        System.out.println("");
        
        pilaCancion.mostrarPilaSegunSalida();
        System.out.println("");
        
        System.out.println("¿Cuántos elementos tiene la pila? " + pilaCancion.numElementos());
        System.out.println("");
        
        Cancion[] arrayCancion = {c3,c1};
        pilaCancion.rellenarPila(arrayCancion);
        
        pilaCancion.mostrarElementos();
        System.out.println("");
        
        pilaCancion.sacarElementos();
        
        pilaCancion.mostrarElementos();
    }
    
}
