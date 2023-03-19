/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoNerea;

/**
 *
 * @author Nerea
 */
public final class Fija extends Sala {
    
    private String estado;

    public Fija() {
    }

    public Fija(String estado, int salaID) {
        super(salaID);
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
