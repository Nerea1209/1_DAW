/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.programa;

import daw.nerea.Animal;
import daw.nerea.Persona;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author nerea
 */
public class Prueba {
    
    public static void main(String[] args) {
        
        // Creamos animal a1 con contructor por defecto
        Animal a1 = new Animal();
        a1.setEstado("durmiendo");
        a1.setFechaNacimiento(LocalDate.of(2022, 11, 8));
        a1.setNombre("Cuqui");
        a1.setPesoGramos(756.2);
        a1.setTipo("gato");
        
        // Creamos animal a2 con constructor parametrizado
        Animal a2 = new Animal(LocalDate.of(2018, 
                Month.SEPTEMBER, 12), "Luna", 
                "periquito", 326.4, "en reposo");
        
        // Creamos persona p1 con constructor por defecto
        Persona p1 = new Persona();
        p1.setEdad(19);
        p1.setNombre("Antonio");
        
        // Creamos persona p2 con constructor parametrizado
        Persona p2 = new Persona("Elsa", 26);
        
        // Imprimimos las características con toString()
        System.out.println("El animal a1 " + a1.toString());
        System.out.println("El animal a2 " + a2.toString());
        
        
        // Crea una copia del animal a2 en un nuevo animal a3.
        System.out.println("Clonamos el animal a2 en a3:");
        Animal a3 = Animal.clonar(a2);
        System.out.println("El animal a3 " + a3.toString());
        
        // p1 debe despertar a todos los animales.
        System.out.println("La persona p1 debe despertar a todos los animales");
        
        System.out.println("El animal a1 estaba " + a1.getEstado());
        p1.llamar(a1);
        System.out.println("Ahora se encuentra " + a1.getEstado());
        
        System.out.println("El animal a2 estaba " + a2.getEstado());
        p1.llamar(a2);
        System.out.println("Ahora se encuentra " + a2.getEstado());
        
        // p2 juega con a2 durante 120 minutos.
        System.out.println("La persona p2 juega con a2 durante 120 minutos");
        p2.jugar(a2, 120);
        System.out.println("El estado del animal cambia a " + a2.getEstado() +
                "\n y ha perdido peso mientras jugaba. \n "
                        + "Ahora su nuevo peso es " + a2.getPesoGramos() + " gr");
        
        // p1 alimenta a a1 1000 gramos. Imprime el nuevo peso de a1.
        System.out.println("La persona p1 alimenta a a1 1000 gramos.");
        System.out.println("El animal a1 pesaba " + a1.getPesoGramos() + " gr");
        p1.alimentar(a1, 1000);
        System.out.println("El nuevo peso de a1 es " + a1.getPesoGramos() + " gr");
        
        // p1 debe jugar con a1 200 minutos. Imprime el nuevo peso de a1.
        System.out.println("La persona p1 debe jugar con a1 200 minutos");
        p1.jugar(a1, 200);
        System.out.println("Ahora el animal a1 pesará " + a1.getPesoGramos() + " gr");
    }
    
}
