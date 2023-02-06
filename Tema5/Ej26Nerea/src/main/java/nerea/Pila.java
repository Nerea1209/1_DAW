/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package nerea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author nerea
 */
public class Pila<T> {

    private List<T> pila;
    private final int tamañoPila = 20;

    public Pila() {
        this.pila = new ArrayList<>(tamañoPila);
    }

    // La pila tiene un tamaño máximo
    //La pila siempre se creará vacía.
    // Apilar elemento (en inglés push), lo inserta donde proceda.
    public void push(T elemento) {
        this.pila.add(elemento);
    }

    // Desapilar (en inglés pop), que saca el elemento que toque.
    public void pop() {
        this.pila.remove(this.pila.size() - 1);
    }

    // Saber si la pila está vacía.
    public boolean estaVacia() {
        return this.pila.isEmpty();
    }

    // Saber si la pila está llena.
    public boolean estaLlena() {
        return this.pila.size() == tamañoPila;
    }

    // Saber el número de elementos que contiene la pila.
    public int numElementos() {
        return this.pila.size();
    }

    /* 
        Mostrar por consola los elementos de la pila, según el orden en el que 
        saldrían los elementos de la pila. Esta operación no debe alterar la 
        estructura de datos.
     */
    public void mostrarPilaSegunSalida() {
        for (int i = this.pila.size() - 1; i >= 0; i--) {
            System.out.println(this.pila.get(i));
        }
    }

    /*
        Rellenar (T[] array), almacena en la pila los objetos que hay en 
        el array. La pila se ajusta su tamaño según el número de elementos 
        que tenga el array.
     */
    public void rellenarPila(T[] array) {
        this.pila.clear();
        for (int i = 0; i < array.length; i++) {
            this.pila.add(array[i]);
        }
    }

    /*
        T[] sacarElementos(), saca los elementos de la pila y los devuelve en 
        un array de T. La pila, después de llamar a este método, queda vacía.
     */
    public Object[] sacarElementos() {
        Object[] array = this.pila.toArray();
//        Arrays.copyOf(this.pila.toArray(), this.pila.size());
//        T[] array = new T[this.pila.size()];
//        for (int i = 0; i < array.length; i++) {
//            for (int j = this.pila.size() - 1; j >= 0; j--) {
//                array[i] = this.pila.get(j);
//            }
//        }
        this.pila.clear();
        return array;
    }
    
    public void mostrarElementos(){
        for (T t : pila) {
            System.out.println(t);
        }
    }

}
