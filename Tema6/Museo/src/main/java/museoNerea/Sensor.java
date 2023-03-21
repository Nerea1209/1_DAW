/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoNerea;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Nerea
 */
public abstract class Sensor {
    
    // Atributos encapsulados
    private int sensorID;
    private static Set<Integer> sensoresID = new HashSet<>();

    // Constructors
    public Sensor() {
    }

    public Sensor(int sensorID) {
        if (!sensoresID.contains(sensorID)) { // Si no existe el id
            sensoresID.add(sensorID); // Lo añade
            this.sensorID = sensorID; // Crea el sensor
        } else { // Si no lanza una exception
            throw new IllegalArgumentException("El ID introducido ya existe.");
        }
    }

    // Getters and setters
    public int getSensorID() {
        return sensorID;
    }

    // equals and hashCode by sensorID
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

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sensor{");
        sb.append("sensorID=").append(sensorID);
        sb.append('}');
        return sb.toString();
    }
    
    // abstract method
    public abstract void alarma();
    
}
