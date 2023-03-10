/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author nerea
 */

public class Estudiante extends Persona {
    
    private int idEstudiante;

    public Estudiante() {
    }

    public Estudiante(int idEstudiante, String nombre, String apellidos, String nif, Direccion direccion) {
        super(nombre, apellidos, nif, direccion);
        this.idEstudiante = idEstudiante;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", idEstudiante=").append(idEstudiante);
        return sb.toString();
    }

    @Override
    public void identificate() {
        System.out.println("Soy un estudiante");
    }

    public void estudiarPoco(){
        System.out.println("Estudio, pero poco");
    }
    
    
}
