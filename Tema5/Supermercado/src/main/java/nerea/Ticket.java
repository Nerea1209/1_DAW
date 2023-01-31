/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerea;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Nerea
 */
public class Ticket {
    
    // Atributos encapsulados del objeto Ticket
    private LocalDate fecha = LocalDate.now();
    private LocalTime hora = LocalTime.now();
    private List<Producto> listaProductos;
    private List<Producto> productosIva4;
    private List<Producto> productosIva10;
    private List<Producto> productosIva21;
    
    
    // Constructor por defecto, fecha y hora al crearse, listas vacías
    public Ticket() {
        this.listaProductos = new ArrayList<>();
        this.productosIva4 = crearListaProductosIva4();
        this.productosIva10 = crearListaProductosIva10();
        this.productosIva21 = crearListaProductosIva21();
    }
    
    // Constructor por parámetro, fecha y hora al crearse y productos de la cinta
    public Ticket(List<Producto> lista) {
        this.listaProductos = lista;
        this.productosIva4 = crearListaProductosIva4();
        this.productosIva10 = crearListaProductosIva10();
        this.productosIva21 = crearListaProductosIva21();
    }

    // Getters and setters
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    
     public List<Producto> getProductosIva4() {
        return productosIva4;
    }

    public List<Producto> getProductosIva10() {
        return productosIva10;
    }

    public List<Producto> getProductosIva21() {
        return productosIva21;
    }

    // Hashcode and equals
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.fecha);
        hash = 97 * hash + Objects.hashCode(this.listaProductos);
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
        final Ticket other = (Ticket) obj;
        if (!Objects.equals(this.fecha, other.fecha)) {
            return false;
        }
        return Objects.equals(this.listaProductos, other.listaProductos);
    }

    // toString
    @Override
    public String toString() {
        return "Ticket{" + "fecha=" + fecha + ", listaProductos=" + listaProductos + '}';
    }
    
    // Formato de impresión del ticket (2o toString)
    public void imprimirTicket(){
        System.out.println("""
                           ------------------------------------------------------------------------
                                                    Supermercado El
                           Fecha: %s                                            Hora: %s
                           ------------------------------------------------------------------------
                           Producto       Precio      Cantidad       IVA      Precio sin IVA
                           ------------------------------------------------------------------------
                           %s
                           ------------------------------------------------------------------------
                           Nº prod. iva  4%% : %d  Precio sin IVA: %.2f € Precio con IVA: %.2f €
                           Nº prod. iva 10%% : %d  Precio sin IVA: %.2f € Precio con IVA: %.2f €
                           Nº prod. iva 21%% : %d  Precio sin IVA: %.2f € Precio con IVA: %.2f €
                           ------------------------------------------------------------------------
                           Total a pagar: %.2f €           --               Gracias por su visita
                           ------------------------------------------------------------------------
                           """.formatted(this.fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")), 
                                   this.hora.format(DateTimeFormatter.ofPattern("HH.mm")), imprimirProductos(),
                                   productosIva4.size(),precioProductosSinIva(Iva.CUATRO),
                                   precioProductosConIva(Iva.CUATRO),productosIva10.size(), 
                                   precioProductosSinIva(Iva.DIEZ), precioProductosConIva(Iva.DIEZ),
                                   productosIva21.size(), precioProductosSinIva(Iva.VEINTIUNO),
                                   precioProductosConIva(Iva.VEINTIUNO), precioTotalAPagar())); 
    }
    
    // Métodos
    // Lista de productos con iva 4%
    private List<Producto> crearListaProductosIva4(){
        List<Producto> lista = new ArrayList<>();
        for (int i = 0; i < this.listaProductos.size(); i++) {
            if (this.listaProductos.get(i).iva().equals(Iva.CUATRO)){
                lista.add(this.listaProductos.get(i));
            }
        }
        return lista;
    }
    
    // Lista de productos con iva 10%
    private List<Producto> crearListaProductosIva10(){
        List<Producto> lista = new ArrayList<>();
        for (int i = 0; i < this.listaProductos.size(); i++) {
            if (this.listaProductos.get(i).iva().equals(Iva.DIEZ)){
                lista.add(this.listaProductos.get(i));
            }
        }
        return lista;
    }
    
    // Lista de productos con iva 21%
    private List<Producto> crearListaProductosIva21(){
        List<Producto> lista = new ArrayList<>();
        for (int i = 0; i < this.listaProductos.size(); i++) {
            if (this.listaProductos.get(i).iva().equals(Iva.VEINTIUNO)){
                lista.add(this.listaProductos.get(i));
            }
        }
        return lista;
    }
    
    // Precio total de la compra
    public double precioTotalAPagar(){
        double precio = 0;
        for (int i = 0; i < this.listaProductos.size(); i++) {
            precio += this.listaProductos.get(i).precioTotalProductoConIva();
        }
        return precio;
    }
    
    // Impresión de la lista de productos con salto de línea por producto
    public String imprimirProductos(){
        String texto = "";
        for (int i = 0; i < this.listaProductos.size(); i++) {
            texto += this.listaProductos.get(i).imprimirProducto() + "\n";
        }
        return texto;
    }
    
    // Precio total sin iva de los productos según tipo de iva
    private double precioProductosSinIva(Iva iva){
        double precio = 0;
        if (iva.equals(Iva.CUATRO)){
            for (int i = 0; i < this.productosIva4.size(); i++) {
                precio += productosIva4.get(i).precioTotalProductoSinIva();
            }
        } else if (iva.equals(Iva.DIEZ)){
            for (int i = 0; i < this.productosIva10.size(); i++) {
                precio += productosIva10.get(i).precioTotalProductoSinIva();
            }
        } else{
            for (int i = 0; i < this.productosIva21.size(); i++) {
                precio += productosIva21.get(i).precioTotalProductoSinIva();
            }
        }
        return precio;
    }
    
    // Precio total con iva de los productos según tipo de iva
     private double precioProductosConIva(Iva iva){
        double precio = 0;
        if (iva.equals(Iva.CUATRO)){
            for (int i = 0; i < this.productosIva4.size(); i++) {
                precio += productosIva4.get(i).precioTotalProductoConIva();
            }
        } else if (iva.equals(Iva.DIEZ)){
            for (int i = 0; i < this.productosIva10.size(); i++) {
                precio += productosIva10.get(i).precioTotalProductoConIva();
            }
        } else{
            for (int i = 0; i < this.productosIva21.size(); i++) {
                precio += productosIva21.get(i).precioTotalProductoConIva();
            }
        }
        return precio;
    }

   
    
}
