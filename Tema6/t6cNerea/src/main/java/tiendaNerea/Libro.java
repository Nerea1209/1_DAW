/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaNerea;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author nerea
 */
public abstract class Libro extends Producto implements Comparable<Libro>{
    
    private String isbn;
    private static Set<String> isbns = new HashSet<>(); // Para controlar que sean únicos

    public Libro() {
    }

    public Libro(String isbn, int codigo, double precio, int iva, String descripcion) {
        super(codigo, precio, iva, descripcion);
        if (!isbns.contains(isbn)) { // Si no está el isbn
            isbns.add(isbn); // Lo añade y crea el libro
            this.isbn = isbn;
        } else { // Si no lanza una exception
            throw new IllegalArgumentException("El isbn introducido ya existe");
        }
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public final int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.isbn);
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
        final Libro other = (Libro) obj;
        return Objects.equals(this.isbn, other.isbn);
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("Libro{");
        sb.append("isbn=").append(isbn);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public final int compareTo(Libro o) {
        return this.isbn.compareToIgnoreCase(o.getIsbn());
    }
    
    public abstract void pasarPagina();
    
}
