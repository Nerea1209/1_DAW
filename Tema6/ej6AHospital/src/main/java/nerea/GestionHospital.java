/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerea;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author nerea
 */
public class GestionHospital {

    public static DecimalFormat df = new DecimalFormat("#.00");
    
    public static void main(String[] args) {

        Hospital hospital = new Hospital("Hospital Costa del Sol",
                "Calle Andalucía", (int) new Random().nextLong(10000000, 100000000), generarPacientesAleatorios(6),
                generarEmpleadosAleatorios(2, 3));

        for (Empleado e : hospital.getEmpleados()) {
            if (e instanceof Medico m) {
                m.tratar(hospital.getPacientes()
                        .get(new Random().nextInt(0, hospital
                                .getPacientes().size())), 
                        "Pancetamol");
                break;
            }
        }

        for (Empleado empleado : hospital.getEmpleados()) {
            System.out.println("El empleado " + empleado.getNombre()
                    + " tiene un irpf de " + empleado.calcularIRPF());
        }
        
        System.out.println(hospital.getPacientes().get(3));
        hospital.getPacientes().get(3).renovarNif(LocalDate.now());
        System.out.println(hospital.getPacientes().get(3));
        
//        Administrativo adm = crearPersonalPASRandom();
//        adm.registrarDocumento("Compromiso");
//        
//        hospital.contratarEmpleado(crearMedicoRandom());
//        hospital.ingresarPaciente(crearPacienteRandom());
//        
//        System.out.println(hospital.toString());

    }

    public static Paciente crearPacienteRandom() {
        return new Paciente(String.valueOf(new Random().nextLong(10000000, 100000000)),
                RandomStringUtils.randomAlphabetic(new Random().nextInt(3, 8)),
                RandomStringUtils.randomAlphabetic(new Random().nextInt(3, 8)),
                new Nif(new Random().nextLong(10000000, 100000000)));
    }

    public static Medico crearMedicoRandom() {
        return new Medico(RandomStringUtils.randomAlphabetic(new Random().nextInt(3, 8)),
                String.valueOf(new Random().nextLong(10000000, 100000000)),
                Double.parseDouble(df.format(new Random().nextDouble(1080, 4000))),
                RandomStringUtils.randomAlphabetic(new Random().nextInt(3, 8)),
                RandomStringUtils.randomAlphabetic(new Random().nextInt(3, 8)),
                new Nif(new Random().nextLong(10000000, 100000000)));
    }

    public static Administrativo crearPersonalPASRandom() {
        return new Administrativo(Grupo.randomGroup(),
                String.valueOf(new Random().nextLong(10000000, 100000000)),
                Double.parseDouble(df.format(new Random().nextDouble(1080, 4000))),
                RandomStringUtils.randomAlphabetic(new Random().nextInt(3, 8)),
                RandomStringUtils.randomAlphabetic(new Random().nextInt(3, 8)),
                new Nif(new Random().nextLong(10000000, 100000000)));
    }

    public static List<Paciente> generarPacientesAleatorios(int numero) {
        List<Paciente> lista = new ArrayList<>(numero);
        for (int i = 0; i < numero; i++) {
            lista.add(crearPacienteRandom());
        }
        return lista;
    }

    public static List<Empleado> generarEmpleadosAleatorios(int medicos, int admins) {
        List<Empleado> lista = new ArrayList<>(medicos + admins);
        for (int i = 0; i < (medicos + admins); i++) {
            if (i < medicos) {
                lista.add(crearMedicoRandom());
            } else {
                lista.add(crearPersonalPASRandom());
            }

        }
        return lista;
    }

}
