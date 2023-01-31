/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerea;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author nerea
 */
public class Empresa {
    
    private int cif;
    private String Nombre;
    private CatalogoAlquileres ca;
    private CatalogoClientes cc;
    private CatalogoVehiculos cv;
    private static int contador = 0;

    public Empresa(String Nombre, CatalogoAlquileres ca, CatalogoClientes cc, CatalogoVehiculos cv) {
        this.Nombre = Nombre;
        this.ca = ca;
        this.cc = cc;
        this.cv = cv;
        contador++;
        this.cif = contador;
    }

    public Empresa(String nombre) {
        this.Nombre = nombre;
        cv = new CatalogoVehiculos(5);
        cc = new CatalogoClientes(5);
        ca = new CatalogoAlquileres(10);
        contador++;
        this.cif = contador;
    }

    public int getCif() {
        return cif;
    }

    public void setCif(int cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public CatalogoAlquileres getCa() {
        return ca;
    }

  

    public CatalogoClientes getCc() {
        return cc;
    }

    

    public CatalogoVehiculos getCv() {
        return cv;
    }

    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.cif);
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
        final Empresa other = (Empresa) obj;
        return Objects.equals(this.cif, other.cif);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empresa{");
        sb.append("cif=").append(cif);
        sb.append(", Nombre=").append(Nombre);
        sb.append(", ca=").append(ca);
        sb.append(", cc=").append(cc);
        sb.append(", cv=").append(cv);
        sb.append('}');
        return sb.toString();
    }
    
    // Métodos
    
    public void registrarCliente(Cliente c){
        cc.anadirCliente(c);
    }
    
    public void registrarVehiculo(Vehiculo v){
        cv.anadirVehiculo(v);
    }
    
    public Cliente buscarCliente(String nif) {
        Cliente c = new Cliente();
        if (nif != null){
            return cc.buscarCliente(nif);
        }
        return c;
    }
    
    public Vehiculo buscarVehiculo(String bastidor) {
        return cv.buscarVehiculo(bastidor);
    }
    
    public boolean registrarAlquiler(String nif, String bastidor, LocalDate fechaAlquiler, int durancionDias){
        
        Cliente c = cc.buscarCliente(nif);
        Vehiculo v = buscarVehiculo(bastidor);
        if (c != null && v != null && v.isDisponible()){
            Alquiler a = new Alquiler(c, v, fechaAlquiler, durancionDias);
            ca.anadirAlquiler(a);
            v.setDisponible(false);
            return true;
        }
        return false;
    }
    
    // Busca el vehiculo y lo pone disponible
    
    public void recibirVehiculo(Alquiler a){
        if (this.ca.buscarAlquiler(a.getAlquilerID())!=null){
            a.getVehiculo().setDisponible(true);
        }
        
    }
    
    

    
    
}
