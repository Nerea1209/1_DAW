/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoNerea;

import java.util.List;

/**
 *
 * @author Nerea
 */
public final class Fija extends Sala {
    
    private String estado;

    public Fija() {
    }

    public Fija(String estado, int salaID, List<Obra> obras, Temperatura sensorTemperatura, Humedad sensorHumedad) {
        super(salaID, obras, sensorTemperatura, sensorHumedad);
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("Fija{");
        sb.append("estado=").append(estado);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
