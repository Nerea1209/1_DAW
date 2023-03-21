/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoNerea;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author Nerea
 */
public abstract class Obra {
    
    // Atributos encapsulados
    private Integer obraID;
    private String autor;
    private static Set<Integer> obrasID = new HashSet<>();

    // Constructors
    public Obra() {
    }

    public Obra(Integer obraID, String autor) {
         if (!obrasID.contains(obraID)) { // Si no existe el nif
             obrasID.add(obraID); // Lo añade
            this.obraID = obraID; // Crea la obra
            this.autor = autor;
            
        } else { // Si existe lanza una exception
            throw new IllegalArgumentException("El ID introducido ya existe.");
        }
    }

    // Getters and setters
    public Integer getObraID() {
        return obraID;
    }

    public void setObraID(Integer obraID) {
        this.obraID = obraID;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // equals and hashCode by obraID
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.obraID);
        return hash;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Obra other = (Obra) obj;
        return Objects.equals(this.obraID, other.obraID);
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Obra{");
        sb.append("obraID=").append(obraID);
        sb.append(", autor=").append(autor);
        sb.append('}');
        return sb.toString();
    }
    
}
