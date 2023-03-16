/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerea;

import java.util.List;

/**
 *
 * @author nerea
 */
public class Hospital {
    
    private String nombre, direccion;
    private int numeroCamas;
    private List<Paciente> pacientes;
    private List<Empleado> empleados;

    public Hospital() {
    }

    public Hospital(String nombre, String direccion, int numeroCamas, List<Paciente> pacientes, List<Empleado> empleados) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroCamas = numeroCamas;
        this.pacientes = pacientes;
        this.empleados = empleados;
    }

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

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hospital{");
        sb.append("nombre=").append(nombre);
        sb.append(", direccion=").append(direccion);
        sb.append(", numeroCamas=").append(numeroCamas);
        sb.append(", pacientes=").append(pacientes);
        sb.append(", empleados=").append(empleados);
        sb.append('}');
        return sb.toString();
    }
    
    public void contratarEmpleado(Empleado emp){
        empleados.add(emp);
    }
    
    public void ingresarPaciente(Paciente paciente){
        pacientes.add(paciente);
    }
    
}
