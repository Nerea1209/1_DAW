/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuraNerea;

import java.util.Objects;

/**
 *
 * @author nerea
 */
public abstract class Figura {
    
    private String id, color;

    public Figura() {
    }

    public Figura(String id, String color) {
            this.id = id;
            this.color = color;
    }

    public String getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public final int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
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
        // INTENTAR MEJORAR LUEGO
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
        if (obj instanceof Rectangulo o && getClass() == o.getClass() && getClass() != obj.getClass()) {
            return false;
        } else if (obj instanceof Triangulo o && getClass() == o.getClass() && getClass() != obj.getClass()){
            return false;
        } else if (obj instanceof Circulo o && getClass() == o.getClass() && getClass() != obj.getClass()){
            return false;
        } else if (obj instanceof Comparable o && getClass() == o.getClass() && getClass() != obj.getClass()){
            return false;
        } else if (obj instanceof Movible o && getClass() == o.getClass() && getClass() != obj.getClass()){
            return false;
        } else if (obj instanceof Dibujable o && getClass() == o.getClass() && getClass() != obj.getClass()){
            return false;
        } 
        
        final Figura other = (Figura) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figura{");
        sb.append("id=").append(id);
        sb.append(", color=").append(color);
        sb.append('}');
        return sb.toString();
    }
    
    public abstract double area();
    
    
    
}
