/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tiendaNerea;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author nerea
 */
public abstract class Producto {

    private int codigo;
    private double precio;
    private int iva;
    private String descripcion;
    private static Set<Integer> codigos = new HashSet<>(); // Para que los codigos sean únicos

    public Producto() {
    }

    public Producto(int codigo, double precio, int iva, String descripcion) {
        if (!codigos.contains(codigo)) { // Si no está en el set
            codigos.add(codigo); // Lo añade y lo crea
            this.codigo = codigo;
            this.precio = precio;
            this.iva = iva;
            this.descripcion = descripcion;
        } else { // Si no lanza una excepcion
            throw new IllegalArgumentException("El código introducido ya existe.");
        }
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + this.codigo;
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
        final Producto other = (Producto) obj;
        return this.codigo == other.codigo;
    }

    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{");
        sb.append("codigo=").append(codigo);
        sb.append(", precio=").append(precio);
        sb.append(", iva=").append(iva);
        sb.append(", descripcion=").append(descripcion);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
