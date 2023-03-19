/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoNerea;

/**
 *
 * @author Nerea
 */
public final class Monitor extends Empleado {
    
    private String especialidad;

    public Monitor() {
    }

    public Monitor(String especialidad, String nif, String nombre) {
        super(nif, nombre);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("Monitor{");
        sb.append("especialidad=").append(especialidad);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
