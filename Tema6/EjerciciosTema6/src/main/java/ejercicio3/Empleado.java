/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Nerea
 */
public class Empleado extends Persona {
    
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empleado() {
    }

    public Empleado(double salario, String nombre, String nif, int edad) {
        super(nombre, nif, edad);
        this.salario = salario;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("nombre=").append(this.getNombre());
        sb.append(", nif=").append(this.getNif());
        sb.append(", edad=").append(this.getEdad());
        sb.append(", salario=").append(salario);
        sb.append('}');
        return sb.toString();
    }
    
    public void aumentarSalario(int cantidad){
        if (cantidad > this.salario) {
            setSalario(cantidad);
        }
    }
    
    
    
}
