/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaNerea;

/**
 *
 * @author nerea
 */
public abstract class Ropa extends Producto implements SeEnvia {
    
    private Marca marca;

    public Ropa() {
    }

    public Ropa(Marca marca, int codigo, double precio, int iva, String descripcion) {
        super(codigo, precio, iva, descripcion);
        this.marca = marca;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("Ropa{");
        sb.append("marca=").append(marca);
        sb.append('}');
        return sb.toString();
    }
    
    @Override
    public void enviar(String direccion) {
        System.out.println(this.toString() + " de tipo Ropa se ha enviado a " + direccion);
    }
    
}
