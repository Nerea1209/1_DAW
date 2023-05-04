
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio3;

import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author nerea
 */
public class Trabajadores {
    
    private List<Trabajador> trabajadores;

    public Trabajadores(List<String> lineas) {
        this.trabajadores = obtenerListaTrabajador(lineas);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.trabajadores);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Trabajadores other = (Trabajadores) obj;
        return Objects.equals(this.trabajadores, other.trabajadores);
    }
    
    public List<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(List<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(imprimirLista(trabajadores));
        return sb.toString();
    }
    
    private static String imprimirLista (List<Trabajador> trabajadores) {
        String texto = "";
        for (Trabajador trabajador : trabajadores) {
            texto += trabajador.toString() + "\n";
        }
        return texto;
    }
    
    private static List<Trabajador> obtenerListaTrabajador (List<String> lineas) {
        List<Trabajador> trabajadores = new ArrayList<>();
        
        for (int i = 1; i < lineas.size(); i++) {
            String[] partes = lineas.get(i).split("\",\"|,\"");
            String[] horasIniciales = partes[7].split(":");
            String[] totalHoras = partes[8].split(":");
            Time horas1 = new Time(Integer.parseInt(horasIniciales[0]),Integer.parseInt(horasIniciales[1]),0);
            Time horas2 = new Time(Integer.parseInt(totalHoras[0]),Integer.parseInt(totalHoras[1]),0);
            trabajadores.add(new Trabajador(partes[0].replace("\"", ""), partes[1], transformarEnum(partes[2]), 
                    partes[3], esHorarioPersonalizado(partes[4]), 
                    formatearFecha(partes[5]), formatearFecha(partes[6]), 
                    horas1, 
                    horas2, 
                    esActivo(partes[9])));
        }
        return trabajadores;
    }
    
    private static TipoPersonal transformarEnum(String tipo) {
        if (tipo.equalsIgnoreCase("Docente Funcionario")) {
            return TipoPersonal.DOCENTE_FUNCIONARIO;
        } else if (tipo.equalsIgnoreCase("Docente Laboral")) {
            return TipoPersonal.DOCENTE_LABORAL;
        } else if (tipo.equalsIgnoreCase("No Docente Laboral")) {
            return TipoPersonal.NO_DOCENTE_LABORAL;
        } else if (tipo.equalsIgnoreCase("No Docente Funcionario")) {
            return TipoPersonal.NO_DOCENTE_FUNCIONARIO;
        } else {
            throw new IllegalArgumentException("El tipo de personal introducido no existe");
        }
    }
    
    private static boolean esHorarioPersonalizado (String horario) {
        if (horario.equalsIgnoreCase("Si")) {
            return true;
        } else if (horario.equalsIgnoreCase("No")) {
            return false;
        }else {
            throw new IllegalArgumentException("Error en el horario personalizado");
        }
    }
    
    private static LocalDate formatearFecha(String fechaString){
        if (!fechaString.equals("")) {
            String[] separado = fechaString.split("/");
            String fecha = separado[2] + "-" + separado[1] + "-" + separado[0];
            return LocalDate.parse(fecha);
        } else {
            return null;
        }
    }
    
    private static boolean esActivo (String activo) {
        String booleano = activo.replaceAll("\"", "");
        if (booleano.equalsIgnoreCase("S")) {
            return true;
        } else if (booleano.equalsIgnoreCase("N")) {
            return false;
        }else {
            throw new IllegalArgumentException("Error en si es activo o no");
        }
    }

    
    
    
}
