/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package daw.nerea;

import java.time.LocalDate;

/**
 *
 * @author nerea
 */
public class Animal {
    
    // Atributos encapsulados de la clase Animal
    private LocalDate fechaNacimiento;
    private String nombre;
    private String tipo;
    private double pesoGramos;
    private String estado;
    
    // MÉTODOS
    
    // Constructor por defecto
    public Animal() {
    }
    
    // Constructor parametrizado
    public Animal(LocalDate fechaNacimiento, String nombre, String tipo, double pesoGramos, String estado) {
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.tipo = tipo;
        this.pesoGramos = pesoGramos;
        this.estado = estado;
    }
    
    // Getters y Setters
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPesoGramos() {
        return pesoGramos;
    }

    public void setPesoGramos(double pesoGramos) {
        this.pesoGramos = pesoGramos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    // toString()
    @Override
    public String toString() {
        return "nació el " + fechaNacimiento + ", se llama " + 
                nombre + ", es un " + tipo + ", pesa " + pesoGramos + 
                "y se encuentra " + estado;
    }
    
    // Incrementará el peso del animal, aumentándolo según el parámetro 
    // indicado en cantidad. Este método no devuelve nada. Si el parámetro 
    // es negativo se considera como positivo.
    public void comer(double cantidadGramos){
        this.estado = "comiendo";
        cantidadGramos = Math.abs(cantidadGramos);
        this.pesoGramos = this.pesoGramos + cantidadGramos;
    }
    
    // Pone a dormir al animal
    public void dormir(){
        this.estado = "durmiendo";
    }
    
    // Despierta al animal
    public void despertar(){
        if (this.estado.equals("durmiendo")){
            this.estado = "despierto";
        }
    }
    
    // Pone al animal en reposo
    public void descansar(){
        this.estado = "en reposo";
    }
    
    // Este método le indica a la mascota que está jugando y recibe como 
    // parámetro la cantidad de minutos que estará el animal jugando. 
    // Por cada 30 minutos completos de juego, el peso del animal se verá 
    // reducido en 20 gr. Si la cantidad es menor de 30 minutos, se reducirá 
    // en 10 gramos. Si la cantidad de minutos es negativa se considera positiva.
    // Un animal no puede jugar más de 180 minutos, por lo tanto si se supera 
    // esa cantidad se lanzará una excepción de tipo IllegalArgument.
    public void jugar(int cantidadMinutos){
        this.estado = "jugando";
        if (cantidadMinutos<30){
            this.pesoGramos = this.pesoGramos - 10;
        } else if(cantidadMinutos >= 30 && cantidadMinutos <= 180){
            this.pesoGramos = this.pesoGramos - ((cantidadMinutos/30)*20);
        } else {
            throw new IllegalArgumentException("Un animal no puede jugar más"
                    + " de 180 minutos");
        }
    }
    
    /*
    Método de clase para clonar Animales, que recibe el objeto Animal que 
    queremos clonar, llamado pet, y devuelve el objeto con la copia de pet. 
    Ten en cuenta que este método crea un objeto nuevo. 
    Controla excepciones NullPointer en este método.
    */
//    public Animal clonar(Animal pet){
//        
//    }
    
    
    public static Animal clonar(Animal pet){
        Animal aux = new Animal();
        if(pet!=null){
            aux = new Animal(pet.fechaNacimiento, pet.nombre, pet.tipo,
                pet.pesoGramos, pet.estado);
        }
        return aux;
    }
    
    
}
