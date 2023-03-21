/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoNerea;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Nerea
 */
public abstract class Sala {
    
    // Atributos encapsulados
    private int salaID;
    private static Set<Integer> salasID = new HashSet<>();
    private List<Obra> obras;
    private Temperatura sensorTemperatura;
    private Humedad sensorHumedad;
    private static int contador;

    // Constructors
    public Sala() {
    }

    public Sala(int salaID, List<Obra> obras) {
        if (!salasID.contains(salaID)) { // Si no existe el id de sala
            salasID.add(salaID); // Lo añade
            this.salaID = salaID; // Crea la sala
            this.obras = obras;
            // Inicializamos ya los sensores (uno de cada)
            // para que sea composición fuerte
            this.sensorTemperatura = new Temperatura(contador++);
            this.sensorHumedad =  new Humedad(contador++);
            
        } else { // Si no lanza una exception
            throw new IllegalArgumentException("El ID introducido ya existe.");
        }
    }
    
    // Getters and setters
    public List<Obra> getObras() {
        return obras;
    }

    public void setObras(List<Obra> obras) {
        this.obras = obras;
    }

    public int getSalaID() {
        return salaID;
    }
    
    public Sensor getSensorTemperatura() {
        return sensorTemperatura;
    }

    public Sensor getSensorHumedad() {
        return sensorHumedad;
    }

    public void setSensorTemperatura(Temperatura sensorTemperatura) {
        this.sensorTemperatura = sensorTemperatura;
    }

    public void setSensorHumedad(Humedad sensorHumedad) {
        this.sensorHumedad = sensorHumedad;
    }

    // equals and hashCode by salaID
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.salaID;
        return hash;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sala other = (Sala) obj;
        return this.salaID == other.salaID;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sala{");
        sb.append("salaID=").append(salaID);
        sb.append(", sensorTemperatura=").append(sensorTemperatura);
        sb.append(", sensorHumedad=").append(sensorHumedad);
        sb.append('}');
        return sb.toString();
    }
}
