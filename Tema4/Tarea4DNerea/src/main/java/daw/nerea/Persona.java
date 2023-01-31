/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.nerea;

/**
 *
 * @author nerea
 */
public class Persona {
    
    // Atributos encapsulados de la clase Persona
    private String nombre;
    private int edad;
    
    // Constructor por defecto
    public Persona() {
    }
    
    // Constructor parametrizado
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    // toString()
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    // MÉTODOS
    
    // Este método hace que la persona en cuestión despierte al animal pet.
    public void llamar(Animal pet){
        pet.despertar();
    }
    
    // En este caso la persona alimenta a pet con una cantidad de comida.
    public void alimentar(Animal pet, double cantidadGramos){
        pet.comer(cantidadGramos);
    }
    
    // La persona juega con pet la cantidad de minutos indicada en el parámetro.
    // Este método debe controlar la excepción IllegalArgument, de forma que si 
    // la excepción se presenta entonces debe jugar con el animal la cantidad 
    // máxima de minutos.
    
    public void jugar(Animal pet, int cantidadMinutos){
        try{
            pet.jugar(cantidadMinutos);
        } catch (IllegalArgumentException iae){
            pet.jugar(180);
        }
    }
    
    
    
    
}
