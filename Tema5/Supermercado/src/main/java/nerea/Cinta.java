/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerea;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nerea
 */
public class Cinta {
    
    // Atributos encapsulados del objeto Cinta
    private List<Producto> productos;

    // Constructor por defecto
    public Cinta() {
        this.productos = new ArrayList<>();
    }
    
    // Lista de productos que tiene la cinta
    public List<Producto> getProductos() {
        return productos;
    }
    
    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cinta{");
        sb.append("productos=").append(productos);
        sb.append('}');
        return sb.toString();
    }
    
    // Métodos
    // poner producto en la cinta
    public void ponerProducto(Producto producto){
        this.productos.add(producto);
    }
    
    // quitar producto de la cinta
    public void quitarProducto(Producto producto){
        this.productos.remove(producto);
    }
    
    // está vacía la cinta/
    public boolean cintaVacia (){
        return this.productos.size() <= 0;
    }

    
    
}
