/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerea;

/**
 *
 * @author Nerea
 */
public class Main {
    
    public static void main(String[] args) {
        
        // Creación de cafeteras
        Cafetera c1 = new Cafetera();
        Cafetera c2 = new Cafetera(1200);
        Cafetera c3 = new Cafetera(400, 243);
        
        // Mostramos valores por pantalla
        System.out.println("c1: " + c1.toString());
        System.out.println("c2: " + c2.toString());
        System.out.println("c3: " + c3.toString());
        
        // Llenamos la cafetera c1
        System.out.println("Llenamos la cafetera c1");
        c1.llenarCafetera();
        System.out.println("c1: " + c1.toString());
        
        // Servimos una taza de la cafetera c2
        System.out.println("Servimos una taza de 125 ml de c2");
        c2.servirTaza(125);
        System.out.println("c2: " + c2.toString());
        
        // Vaciamos la cafetera c3
        System.out.println("Vaciamos la cafetera c3");
        c3.vaciarCafetera();
        System.out.println("c3: " + c3.toString());
        
        // Agregamos cafe en la cafetera c3
        System.out.println("Agregamos 678ml a la cafetera c3");
        c3.agregarCafe(678);
        System.out.println("c3: " + c3.toString());
        
        // Creación de personas
        Persona p1 = new Persona();
        p1.setEdad(5);
        p1.setNombre("Pedro");
        
        Persona p2 = new Persona(25, "Anastasia");
        
        // Mostramos las personas por pantalla
        System.out.println("_____________________________________________");
        System.out.println("p1: " + p1.toString());
        System.out.println("p2: " + p2.toString());
        
        // La persona p1 hace cafe
        System.out.println("La persona p1 hace café con la cafetera c2");
        p1.hacerCafe(c2);
        System.out.println("c2: " + c2.toString());
        
        // La persona p2 bebe cafe de la cafetera c1 y de la cafetera c3
        System.out.println("La persona p2 bebe café de la cafetera c1 y c3");
        p2.beberCafe(c1, 145);
        p2.beberCafe(c3, 456);
        System.out.println("c1: " + c1.toString());
        System.out.println("c3: " + c3.toString());
        
        // Construcción de persona record
        PersonaR pepe = new PersonaR(64, "Pepe");
        System.out.println("pepe: " + pepe.toString());
        PersonaR ana = new PersonaR(24, "Ana");
        System.out.println("ana: " + ana.toString());
        
        // Pepe hace cafe en c1
        System.out.println("Pepe hace café en la cafetera c1");
        pepe.hacerCafe(c1);
        System.out.println("c1: " + c1.toString());
        
        // ¿Son iguales pepe y ana?
        System.out.println("¿Son iguales pepe y ana? " + pepe.equals(ana));
        
        
        
        
    }
    
}
