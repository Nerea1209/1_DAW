/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerea;

import java.util.Objects;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author nerea
 */
public class Cliente {
    
    private Nombre nombre;
    private String nif;
    private Apellido apellido;

    public Cliente() {
        nombre = Nombre.getAleatorio();
        nif = generaNIF();
        apellido = Apellido.getAleatorio();
    }

    public Nombre getNombre() {
        return nombre;
    }

    public String getNif() {
        return nif;
    }

    public Apellido getApellido() {
        return apellido;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }

    public void setApellido(Apellido apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("nombre=").append(nombre);
        sb.append(", nif=").append(nif);
        sb.append(", apellido=").append(apellido);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.nombre);
        hash = 73 * hash + Objects.hashCode(this.nif);
        hash = 73 * hash + Objects.hashCode(this.apellido);
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
        final Cliente other = (Cliente) obj;
        return Objects.equals(this.nif, other.nif);
    }    
    
    private String generaNIF(){
       String numString = RandomStringUtils.randomNumeric(8);
       int numAleatorio = Integer.parseInt(numString);
       char[] letraNIF={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
       char letra = letraNIF[numAleatorio%23];
       return numString + letra;
    }
    
}
