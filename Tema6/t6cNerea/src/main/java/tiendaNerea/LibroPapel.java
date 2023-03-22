/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaNerea;

/**
 *
 * @author nerea
 */
public final class LibroPapel extends Libro implements SeEnvia {
    
    private int numPaginas;

    public LibroPapel() {
    }

    public LibroPapel(int numPaginas, String isbn, int codigo, double precio, int iva, String descripcion) {
        super(isbn, codigo, precio, iva, descripcion);
        this.numPaginas = numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("LibroPapel{");
        sb.append("numPaginas=").append(numPaginas);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void enviar(String direccion) {
        System.out.println(this.toString() + " de tipo Libro, cuya dirección es " + direccion);
    }
    
    
    
}
