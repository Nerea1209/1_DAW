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
    
    private String nombre;
    private String nif;
    private String apellido;
    private static int contador = 0;

    public Cliente() {
        nombre = RandomStringUtils.randomAlphabetic(5);
        apellido = RandomStringUtils.randomAlphabetic(5);
        contador++;
        nif = String.valueOf(contador);
    }

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        contador++;
        nif = String.valueOf(contador);
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public String getNif() {
        return nif;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNif(String nif) {
        this.nif = nif;
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

    
    
//    private String generaNIF(){
//       String numString = RandomStringUtils.randomNumeric(8);
//       int numAleatorio = Integer.parseInt(numString);
//       char[] letraNIF={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
//       char letra = letraNIF[numAleatorio%23];
//       return numString + letra;
//    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.nif);
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
    
}
