/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerea;

import java.util.Random;
import static nerea.GestionHospital.df;

/**
 *
 * @author nerea
 */
public class Medico extends Empleado implements Nadador{
    
    private String especialidad;

    public Medico() {
    }

    public Medico(String especialidad, String numeroSeguridadSocial, double salario, String nombre, String apellidos, Nif nif) {
        super(numeroSeguridadSocial, salario, nombre, apellidos, nif);
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
        sb.append(super.toString()).append("--> Medico: ");
        sb.append("especialidad=").append(especialidad);
        return sb.toString();
    }

    public void tratar(Paciente paciente, String medicina){
        System.out.println("El médico " + this.getNombre() + " trata a "
        + paciente.getNombre() + " con la medicina " + medicina);
        Paciente.tomarMedicina(medicina);
    }
    
    @Override
    public double calcularIRPF() {
        double irpf;
        if (this.especialidad.equalsIgnoreCase("cirugía")) {
            irpf = this.getSalario()- (this.getSalario()*0.25);
        } else {
            irpf = this.getSalario()- (this.getSalario()*0.235);
        }
        return Double.parseDouble(df.format(irpf));
    }

    @Override
    public void nadar() {
        System.out.println("El médico nada");
    }
    
}
