/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package museoNerea;

import java.util.List;

/**
 *
 * @author Nerea
 */
public class Museo {

    // Atributos encapsulados
    private String nombre, direccion;
    private List<Empleado> empleados;
    private List<Sala> salas;

    // Constructors
    public Museo() {
    }

    public Museo(String nombre, String direccion, List<Empleado> empleados, List<Sala> salas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.empleados = empleados;
        this.salas = salas;
    }

    // Getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Museo{");
        sb.append("nombre=").append(nombre);
        sb.append(", direccion=").append(direccion);
        sb.append(", empleados=").append(empleados);
        sb.append(", salas=").append(salas);
        sb.append('}');
        return sb.toString();
    }
    
    // METHODS
    
    public void contratar(Empleado e){
        this.empleados.add(e); 
    }
    
    public void despedir(Empleado e){
        this.empleados.remove(e);
    }
    
    public void addSala(Sala sala){
        this.salas.add(sala);
    }
    
    public void quitarSala(Sala sala){
        this.salas.remove(sala);
    }
    
}
