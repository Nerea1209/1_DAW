/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoNerea;

import java.util.Set;

/**
 *
 * @author Nerea
 */
public abstract class Sensor {
    
    private int sensorID;
    private static Set<Integer> sensoresID;

    public Sensor() {
    }

    public Sensor(int sensorID) {
        if (!sensoresID.contains(sensorID)) {
            this.sensorID = sensorID;
            sensoresID.add(sensorID);
        } else {
            throw new IllegalArgumentException("El ID introducido ya existe.");
        }
    }

    public int getSensorID() {
        return sensorID;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.sensorID;
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
        final Sensor other = (Sensor) obj;
        return this.sensorID == other.sensorID;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sensor{");
        sb.append("sensorID=").append(sensorID);
        sb.append('}');
        return sb.toString();
    }
    
    public abstract void alarma();
    
}
