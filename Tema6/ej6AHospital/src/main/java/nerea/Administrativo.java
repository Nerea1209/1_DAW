/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerea;

import static nerea.GestionHospital.df;

/**
 *
 * @author nerea
 */
public class Administrativo extends Empleado {
    
    private Grupo grupo;

    public Administrativo() {
    }

    public Administrativo(Grupo grupo, String numeroSeguridadSocial, double salario, String nombre, String apellidos, Nif nif) {
        super(numeroSeguridadSocial, salario, nombre, apellidos, nif);
        this.grupo = grupo;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(" --> Administrativo: ");
        sb.append("grupo=").append(grupo);
        return sb.toString();
    }
    
    public void registrarDocumento(String nombreDoc){
        System.out.println("** Registro documento **");
        System.out.println("Administratrivo --> " + this.getNombre() + " " + 
                this.getApellidos());
        System.out.println("Documento--> " + nombreDoc + ", cuyo hashcode es " + 
                nombreDoc.hashCode());
    }

    @Override
    public double calcularIRPF() {
        return Double.parseDouble(df.format(this.getSalario() * this.grupo.getIrpf()));
    }
    
}
