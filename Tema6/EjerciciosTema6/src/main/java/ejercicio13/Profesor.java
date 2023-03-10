/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author nerea
 */
public abstract class Profesor extends Persona {

    private String especialidad;

    public Profesor() {
    }

    public Profesor(String especialidad, String nombre, String apellidos, String nif, Direccion direccion) {
        super(nombre, apellidos, nif, direccion);
        this.especialidad = especialidad;
    }
    
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("--> Profesor: ");
        sb.append("especialidad=").append(especialidad);
        sb.append('}');
        return sb.toString();
    }
    
    
    // El método final implica que no puede ser sobreescrito
    // en subclases
    @Override
    public final void identificate() {
        System.out.println("Soy un profesor");
    }

    
    
}
