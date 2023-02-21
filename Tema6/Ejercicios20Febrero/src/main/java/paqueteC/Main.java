/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Nerea
 */
public class Main {
    
    public static void main(String[] args) {
        
        List<Figura> figuras = new ArrayList<>();
        
        Cuadrado cu1 = new Cuadrado(4, Color.ROJO, "Cuadrado 1");
        Cuadrado cu2 = new Cuadrado(5.6, Color.AMARILLO, "Cuadrado 2");
        Circulo ci1 = new Circulo(2, Color.MARRÓN, "Circulo 1");
        Circulo ci2 = new Circulo(1.34, Color.AZUL, "Circulo 2");
        
        figuras.add(cu1);
        figuras.add(ci2);
        figuras.add(ci1);
        figuras.add(cu2);
        
        for (int i = 0; i < figuras.size(); i++) {
            if (figuras.get(i) instanceof Cuadrado) { // Conversión explícita
                Cuadrado cuadrado = (Cuadrado) figuras.get(i); // Conversión explícita
                System.out.println(cuadrado.toString());
                System.out.println("Área: " + cuadrado.calcularArea());
                System.out.println("Perímetro: " + cuadrado.calcularPerimetro());
            } else {
                Circulo circulo = (Circulo) figuras.get(i); // Conversión explícita
                System.out.println(circulo.toString());
                System.out.println("Área: " + circulo.calcularArea());
                System.out.println("Perímetro: " + circulo.calcularPerimetro());
            }
        }
        
        System.out.println("Ordenación por nombre de figura");
        Collections.sort(figuras, (o1, o2)-> o1.getNombre().compareTo(o2.getNombre()));
        figuras.forEach(System.out::println);
        
        System.out.println("Búsqueda binaria por nombre");
        Figura aux = new Cuadrado(0, Color.ROJO, "Cuadrado 1");
        int pos = Collections.binarySearch(figuras, aux, (o1, o2)-> o1.getNombre().compareTo(o2.getNombre()));
        System.out.println("El cuadrado de color rojo está en la posición " + pos);
    }
    
}
