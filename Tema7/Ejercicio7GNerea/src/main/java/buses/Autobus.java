/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buses;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author nerea
 */
public class Autobus {
    private String linea, origen, ciudadDestino;
    private List<LocalTime> horasSalida;

    public Autobus() {
    }

    public Autobus(String linea, String origen, String ciudadDestino, List<LocalTime> horasSalida) {
        this.linea = linea;
        this.origen = origen;
        this.ciudadDestino = ciudadDestino;
        this.horasSalida = horasSalida;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public List<LocalTime> getHorasSalida() {
        return horasSalida;
    }

    public void setHorasSalida(List<LocalTime> horasSalida) {
        this.horasSalida = horasSalida;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.linea);
        hash = 59 * hash + Objects.hashCode(this.origen);
        hash = 59 * hash + Objects.hashCode(this.ciudadDestino);
        hash = 59 * hash + Objects.hashCode(this.horasSalida);
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
        final Autobus other = (Autobus) obj;
        if (!Objects.equals(this.linea, other.linea)) {
            return false;
        }
        if (!Objects.equals(this.origen, other.origen)) {
            return false;
        }
        if (!Objects.equals(this.ciudadDestino, other.ciudadDestino)) {
            return false;
        }
        return Objects.equals(this.horasSalida, other.horasSalida);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\"").append(linea).append("\" \"");
        sb.append(origen).append(" - ");
        sb.append(ciudadDestino).append("\" ");;
        sb.append(imprimirLista(horasSalida));
        return sb.toString();
    }
    
    private String imprimirLista(List<LocalTime> lista) {
        String texto = "";
        for (LocalTime localTime : lista) {
            texto += localTime.format(DateTimeFormatter.ofPattern("HH:mm")) + " ";
        }
        return texto;
    }
    
    
}
