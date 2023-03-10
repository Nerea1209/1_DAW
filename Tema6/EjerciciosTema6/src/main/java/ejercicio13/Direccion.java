/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author nerea
 */
public class Direccion {
    
    private String nombreCalle, nombreCiudad, codPostal, nombrePais;

    public Direccion() {
    }

    public Direccion(String nombreCalle, String nombreCiudad, String codPostal, String nombrePais) {
        this.nombreCalle = nombreCalle;
        this.nombreCiudad = nombreCiudad;
        this.codPostal = codPostal;
        this.nombrePais = nombrePais;
    }

    public String getNombreCalle() {
        return nombreCalle;
    }

    public void setNombreCalle(String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Direccion{");
        sb.append("nombreCalle=").append(nombreCalle);
        sb.append(", nombreCiudad=").append(nombreCiudad);
        sb.append(", codPostal=").append(codPostal);
        sb.append(", nombrePais=").append(nombrePais);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
