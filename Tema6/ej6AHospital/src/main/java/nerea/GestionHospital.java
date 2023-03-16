/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerea;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author nerea
 */
public class GestionHospital {
    
    public static void main(String[] args) {
        String randomText = RandomStringUtils.randomAlphabetic(new Random().nextInt(3, 8));
        long randomNumber = new Random().nextLong(10000000, 100000000);
        Hospital hospital = new Hospital("Hospital Costa del Sol", 
                "Calle Andalucía", (int) randomNumber, generarPacientesAleatorios(6), 
                generarEmpleadosAleatorios(6));
        
        Medico medico = (Medico)hospital.getEmpleados().get(4);
        Paciente paciente = hospital.getPacientes().get(new Random().nextInt(0, 5));
        medico.tratar(paciente, "Pancetamol");
        
        for (Empleado empleado : hospital.getEmpleados()) {
            System.out.println("El empleado " + empleado + 
                    "tiene un irpf de " + empleado.calcularIRPF());
        }
        
        paciente.renovarNif(LocalDate.now());
        
    }
    
    public static Paciente crearPaciente(){
        String randomText = RandomStringUtils.random(new Random().nextInt(3, 8));
        long randomNumber = new Random().nextLong(10000000, 100000000);
        return new Paciente(String.valueOf(randomNumber), randomText, 
                randomText, new Nif(randomNumber));
    }
    
    public static Medico crearMedico(){
        String randomText = RandomStringUtils.random(new Random().nextInt(3, 8));
        long randomNumber = new Random().nextLong(10000000, 100000000);
        return new Medico(randomText, randomText, 
                randomNumber, randomText, randomText, 
                new Nif(randomNumber));
    }
    
    public static Administrativo crearPersonalPAS(){
        String randomText = RandomStringUtils.random(new Random().nextInt(3, 8));
        long randomNumber = new Random().nextLong(10000000, 100000000);
        return new Administrativo(Grupo.randomGroup(), 
                String.valueOf(randomNumber), 
                randomNumber, randomText, randomText, 
                new Nif(randomNumber));
    }
    
    public static List<Paciente> generarPacientesAleatorios(int numero){
        List<Paciente> lista = new ArrayList<>(numero);
        for (int i = 0; i < numero; i++) {
            lista.add(crearPaciente());
        }
        return lista;
    }
    
    public static List<Empleado> generarEmpleadosAleatorios(int numero){
        List<Empleado> lista = new ArrayList<>(numero);
        for (int i = 0; i < numero; i++) {
            boolean empleado = new Random().nextBoolean();
            if (empleado) {
                lista.add(crearMedico());
            } else {
                lista.add(crearPersonalPAS());
            }
            
        }
        return lista;
    }
    
}
