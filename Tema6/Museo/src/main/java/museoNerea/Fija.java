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
// Clase final de Fija que hereda de Sala
public final class Fija extends Sala {
    
    // Atributos encapsulados
    private String estado;

    // Constructors
    public Fija() {
    }

    public Fija(String estado, int salaID, List<Obra> obras) {
        super(salaID, obras);
        this.estado = estado;
    }

    // Getters and setters
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("Fija{");
        sb.append("estado=").append(estado);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
