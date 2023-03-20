/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoNerea;

import java.util.List;
import java.util.Set;

/**
 *
 * @author Nerea
 */
public abstract class Sala {
    
    private int salaID;
    private static Set<Integer> salasID;
    private List<Obra> obras;
    private Temperatura sensorTemperatura;
    private Humedad sensorHumedad;

    public Sala() {
    }

    public Sala(int salaID, List<Obra> obras, Temperatura sensorTemperatura, Humedad sensorHumedad) {
        if (!salasID.contains(salaID)) {
            this.salaID = salaID;
            this.obras = obras;
            this.sensorTemperatura = sensorTemperatura;
            this.sensorHumedad = sensorHumedad;
            salasID.add(salaID);
        } else {
            throw new IllegalArgumentException("El ID introducido ya existe.");
        }
        
    }
    
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
