/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaNerea;

/**
 *
 * @author nerea
 */
public final class Pantalon extends Ropa{
    
    private Talla talla;

    public Pantalon() {
    }

    public Pantalon(Talla talla, Marca marca, int codigo, double precio, int iva, String descripcion) {
        super(marca, codigo, precio, iva, descripcion);
        this.talla = talla;
    }
    
    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("Pantalon{");
        sb.append("talla=").append(talla);
        sb.append('}');
        return sb.toString();
    }

    
    
    
    
}
