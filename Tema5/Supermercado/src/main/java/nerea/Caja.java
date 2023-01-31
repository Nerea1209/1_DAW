/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerea;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nerea
 */
public class Caja {
    
    // Atributos encapsulados del objeto Caja
    private int cajaId;
    private Cinta cinta;
    private static int contador = 0;

    // Constructor por defecto
    public Caja() {
        contador++;
        this.cajaId = contador;
        this.cinta = new Cinta();
    }

    // Getters and setters
    public int getCajaId() {
        return cajaId;
    }

//    public void setCajaId(int cajaId) {
//        this.cajaId = cajaId;
//    }

    public Cinta getCinta() {
        return cinta;
    }

    public void setCinta(Cinta cinta) {
        this.cinta = cinta;
    }

    // Hashcode and equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.cajaId;
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
        final Caja other = (Caja) obj;
        return this.cajaId == other.cajaId;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Caja{");
        sb.append("cajaId=").append(cajaId);
        sb.append(", cinta=").append(cinta);
        sb.append('}');
        return sb.toString();
    }
    
    // METODOS
    
    // Genera el ticket según los productos que tiene la cinta
    public Ticket generarTicket(){
        return new Ticket(this.cinta.getProductos());
    }
   
    
}
