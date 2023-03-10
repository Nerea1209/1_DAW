/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author nerea
 */
public abstract class Legislador extends Persona {
    
    private String provincia, partidoPolitico;

    public Legislador() {
    }

    public Legislador(String provincia, String partidoPolitico, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.provincia = provincia;
        this.partidoPolitico = partidoPolitico;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Legislador -> ");
        sb.append("nombre=").append(super.getNombre());
        sb.append(", apellidos=").append(super.getApellidos());
        sb.append(", provincia=").append(provincia);
        sb.append(", partidoPolitico=").append(partidoPolitico);
        return sb.toString();
    }
    public abstract String getCamara();
    
    
}
