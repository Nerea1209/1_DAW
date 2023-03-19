/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoNerea;

/**
 *
 * @author Nerea
 */
public class Vigilante extends Empleado {
    
    private String zona;

    public Vigilante() {
    }

    public Vigilante(String zona, String nif, String nombre) {
        super(nif, nombre);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("Vigilante{");
        sb.append("zona=").append(zona);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
