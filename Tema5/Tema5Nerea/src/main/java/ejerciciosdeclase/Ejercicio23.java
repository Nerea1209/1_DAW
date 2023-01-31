/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosdeclase;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Nerea
 */
public class Ejercicio23 {
    
    private static Random aleatorio = new Random();
    
    private static ArrayList<Integer> lista1 = new ArrayList<>();
    private static ArrayList<Integer> lista2 = new ArrayList<>();
    
    public static void main(String[] args) {

        rellenarLista(lista1, 5, 15);
        rellenarLista(lista2, 10, 20);

        System.out.println("Lista 1:");
        lista1.forEach(System.out::println);
        System.out.println("");
        System.out.println("Lista 2:");
        lista2.forEach(System.out::println);
        System.out.println("");

        ArrayList<Integer> lista3 = generarTerceraLista();
        System.out.println("Lista 3:");
        lista3.forEach(System.out::println);
        System.out.println("");
        
        ArrayList<Integer> lista4 = generarCuartaLista();
        System.out.println("Lista 4:");
        lista4.forEach(System.out::println);

    }

    private static void rellenarLista(ArrayList<Integer> lista, int minimo, int maximo) {
        int tamano = aleatorio.nextInt(minimo, maximo + 1);
        for (int i = 0; i < tamano; i++) {
            lista.add(aleatorio.nextInt(50, 101));
        }
    }

    private static ArrayList<Integer> generarTerceraLista() {
        ArrayList<Integer> lista3 = new ArrayList<Integer>();
        for (Integer aux : lista1) {
            if (!lista2.contains(aux)) {
                lista3.add(aux);
            }
        }
        return lista3;
    }
    
    private static ArrayList<Integer> generarCuartaLista(){
        ArrayList<Integer> lista4 = new ArrayList<>();
        for(Integer aux:lista1){
            if(aux%2 == 0){
                lista4.add(aux);
            }
        }
        for(Integer aux:lista2){
            if (aux%2 == 1){
                lista4.add(aux);
            }
        }
        return lista4;
    }
    
}
