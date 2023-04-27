/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package area7fnerea;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author nerea
 */
public class Empleado {
    
    private String nombreCompleto, dni, puesto;
    private LocalDate tomaPosesion, cesePosicion;
    private boolean esEvaluador, esCoordinador;

    public Empleado() {
    }

    public Empleado(String nombreCompleto, String dni, String puesto, LocalDate tomaPosesion, LocalDate cesePosicion, boolean esEvaluador, boolean esCoordinador) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.puesto = puesto;
        this.tomaPosesion = tomaPosesion;
        this.cesePosicion = cesePosicion;
        this.esEvaluador = esEvaluador;
        this.esCoordinador = esCoordinador;
    }
    

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public LocalDate getTomaPosesion() {
        return tomaPosesion;
    }

    public void setTomaPosesion(LocalDate tomaPosesion) {
        this.tomaPosesion = tomaPosesion;
    }

    public LocalDate getCesePosicion() {
        return cesePosicion;
    }

    public void setCesePosicion(LocalDate cesePosicion) {
        this.cesePosicion = cesePosicion;
    }

    public boolean isEsEvaluador() {
        return esEvaluador;
    }

    public void setEsEvaluador(boolean esEvaluador) {
        this.esEvaluador = esEvaluador;
    }

    public boolean isEsCoordinador() {
        return esCoordinador;
    }

    public void setEsCoordinador(boolean esCoordinador) {
        this.esCoordinador = esCoordinador;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("nombreCompleto=").append(nombreCompleto);
        sb.append(", dni=").append(dni);
        sb.append(", puesto=").append(puesto);
        sb.append(", tomaPosesion=").append(tomaPosesion);
        sb.append(", cesePosicion=").append(cesePosicion);
        sb.append(", esEvaluador=").append(esEvaluador);
        sb.append(", esCoordinador=").append(esCoordinador);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.dni);
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
        final Empleado other = (Empleado) obj;
        return Objects.equals(this.dni, other.dni);
    }
    
    
    
}
