/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerea;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author nerea
 */
public class Empresa {
    
    // Atributos encapsulados
    private int cif;
    private String Nombre;
    private final CatalogoAlquileres ca;
    private final CatalogoClientes cc;
    private final CatalogoVehiculos cv;
    private static int contador = 0;

    // Constructor por parámetros
    public Empresa(String Nombre, CatalogoAlquileres ca, CatalogoClientes cc, CatalogoVehiculos cv) {
        this.Nombre = Nombre;
        this.ca = new CatalogoAlquileres(100);
        this.cc = new CatalogoClientes(100);
        this.cv = new CatalogoVehiculos(100);
        contador++;
        this.cif = contador;
    }

    // Constructor con catálogos aleatorios
    public Empresa(String nombre) {
        this.Nombre = nombre;
        cv = new CatalogoVehiculos(5);
        cc = new CatalogoClientes(5);
        ca = new CatalogoAlquileres(10);
        contador++;
        this.cif = contador;
    }
    
    // Getters and setters

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
    
    // Hashcode y equals

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

    // tostring
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
    
    public void registrarCliente (Cliente c){
        cc.anadirElemento(c);
    }
    
    public void registrarVehiculo (Vehiculo v){
        cv.anadirElemento(v);
    }
    
    public Cliente buscarCliente (String nif) {
        Cliente c = new Cliente();
        if (nif != null){
            return cc.buscarCliente(nif);
        }
        return c;
    }
    
    public Vehiculo buscarVehiculo (String bastidor) {
        return cv.buscarVehiculo(bastidor);
    }
    
    public boolean registrarAlquiler (String nif, String bastidor, int durancionDias){
        
        Cliente c = cc.buscarCliente(nif);
        Vehiculo v = buscarVehiculo(bastidor);
        if (c != null && v != null && v.isDisponible()){
            Alquiler a = new Alquiler(c, v, durancionDias);
            ca.anadirElemento(a);
            v.setDisponible(false);
            a.setActivo(true);
            return true;
        }
        return false;
    }
    
    public void registrarAlquiler (Alquiler a){
        ca.anadirElemento(a);
    }
    
    // Busca el vehiculo y lo pone disponible
    
    public void recibirVehiculo (Alquiler a){
        if (this.ca.buscarAlquiler(a.getAlquilerID())!=null){
            a.getVehiculo().setDisponible(true);
            a.setActivo(false);
        }
        
    }
    
    public List<Alquiler> AlquileresCliente(String nif){
        List<Alquiler> alquileres = new ArrayList<>();
        for (int i = 0; i < ca.lista.size(); i++) {
            if (nif.equals(ca.lista.get(i).getCliente().getNif())){
                int j = ++i;
                i--;
                alquileres.add(ca.buscarAlquiler(j));
            }
        }
        return alquileres;
    }
    
     public List<Alquiler> AlquileresVehiculo(String bastidor){
        List<Alquiler> alquileres = new ArrayList<>();
        for (int i = 0; i < ca.lista.size(); i++) {
            if (bastidor.equals(ca.lista.get(i).getVehiculo().getBastidor())){
                int j = ++i;
                i--;
                alquileres.add(ca.buscarAlquiler(j));
            }
        }
        return alquileres;
    }
     
     public void borrarAlquiler(int alquilerID){
         ca.lista.remove(--alquilerID);
     }
     
     public void borrarCliente(Cliente c){
         if (AlquileresCliente(c.getNif()).isEmpty()){
             cc.borrarElemento(c);
         }
     }
     
     public void borrarVehiculo(Vehiculo v){
         if (AlquileresVehiculo(v.getBastidor()).isEmpty()){
             cv.borrarElemento(v);
         }
     }
     
     public List<Vehiculo> vehiculosADevolver(LocalDate fechaFin){
         List<Vehiculo> vehiculos = new ArrayList<>();
         for (int i = 0; i < ca.lista.size(); i++) {
            if (fechaFin.equals(ca.lista.get(i).getFechaInicio().plusDays(ca.lista.get(i).getDuracionDias()))){
                vehiculos.add(ca.lista.get(i).getVehiculo());
            }
        }
         return vehiculos;
     }
    
    

    
    
}
