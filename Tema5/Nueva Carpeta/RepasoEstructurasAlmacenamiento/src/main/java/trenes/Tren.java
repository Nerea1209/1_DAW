/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trenes;

/**
 *
 * @author Nerea
 */
public class Tren {
    
    // Atributos encapsulados de la clase Tren
    private int idTren;
    private int numVagones;
    private int numPasajerosTotal; // Considero que en cada vagón entra como máximo 200 pasajeros
    private int pasajerosABordo;

    // Constructor por defecto
    public Tren() {
    }

    // Constructor por parámetros
    public Tren(int idTren, int numVagones, int numPasajerosTotal, int pasajerosABordo) {
        this.idTren = idTren;
        this.numVagones = numVagones;
        this.numPasajerosTotal = numPasajerosTotal;
        this.pasajerosABordo = pasajerosABordo;
    }

    // Getters and setters
    public int getIdTren() {
        return idTren;
    }

    public int getNumVagones() {
        return numVagones;
    }

    public int getNumPasajerosTotal() {
        return numPasajerosTotal;
    }

    public void setNumVagones(int numVagones) {
        this.numVagones = numVagones;
    }

    public void setNumPasajerosTotal(int numPasajerosTotal) {
        this.numPasajerosTotal = numPasajerosTotal;
    }

    public int getPasajerosABordo() {
        return pasajerosABordo;
    }

    public void setPasajerosABordo(int pasajerosABordo) {
        this.pasajerosABordo = pasajerosABordo;
    }

    // Hash and equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.idTren;
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
        final Tren other = (Tren) obj;
        return this.idTren == other.idTren;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tren{");
        sb.append("idTren=").append(idTren);
        sb.append(", numVagones=").append(numVagones);
        sb.append(", numPasajerosTotal=").append(numPasajerosTotal);
        sb.append(", pasajerosABordo=").append(pasajerosABordo);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
