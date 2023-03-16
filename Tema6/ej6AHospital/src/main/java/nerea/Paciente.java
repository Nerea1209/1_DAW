/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerea;

import java.util.Random;

/**
 *
 * @author nerea
 */
public class Paciente extends Persona implements Nadador{
    
    private String numeroHistoria;

    public Paciente() {
    }

    public Paciente(String numeroHistoria, String nombre, String apellidos, Nif nif) {
        super(nombre, apellidos, nif);
        this.numeroHistoria = numeroHistoria;
    }

    public String getNumeroHistoria() {
        return numeroHistoria;
    }

    public void setNumeroHistoria(String numeroHistoria) {
        this.numeroHistoria = numeroHistoria;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("--> Paciente: ");
        sb.append("numeroHistoria=").append(numeroHistoria);
        return sb.toString();
    }
    
    public static void tomarMedicina(String medicina){
        boolean esCurado = new Random().nextBoolean();
        String cura = "";
        if (esCurado) {
            cura = "se ha curado";
        } else {
            cura = "no se ha curado";
        }
        System.out.println("El paciente " + cura + " al tomar " + medicina);
    }

    @Override
    public void nadar() {
        System.out.println("El paciente nada");
    }
    
    
    
}
