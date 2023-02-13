/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio1;

import java.util.List;

/**
 *
 * @author nerea
 */
public class Casa {

    private double metrosCuadrados;
    private String direccion;
    private int numPlantas;
    private Puerta puertas;
    private List<Ventana> ventanas;
    private List<Calefactor> calefactor;

    public Casa() {
    }

    public Casa(double metrosCuadrados, String direccion, int numPlantas, Puerta puertas, List<Ventana> ventanas, List<Calefactor> calefactor) {
        if (!ventanas.isEmpty()){
            this.metrosCuadrados = metrosCuadrados;
            this.direccion = direccion;
            this.numPlantas = numPlantas;
            this.puertas = puertas;
            this.ventanas = ventanas;
            this.calefactor = calefactor;
        } else {
            System.out.println("Tiene que tener al menos una ventana");
        }
    }
    
    

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumPlantas() {
        return numPlantas;
    }

    public void setNumPlantas(int numPlantas) {
        this.numPlantas = numPlantas;
    }

 

    public List<Ventana> getVentanas() {
        return ventanas;
    }

    public void setVentanas(List<Ventana> ventanas) {
        this.ventanas = ventanas;
    }

    public Puerta getPuertas() {
        return puertas;
    }

    public void setPuertas(Puerta puertas) {
        this.puertas = puertas;
    }

    public List<Calefactor> getCalefactor() {
        return calefactor;
    }

    public void setCalefactor(List<Calefactor> calefactor) {
        this.calefactor = calefactor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Casa{");
        sb.append("metrosCuadrados=").append(metrosCuadrados);
        sb.append(", direccion=").append(direccion);
        sb.append(", numPlantas=").append(numPlantas);
        sb.append(", puertas=").append(puertas);
        sb.append(", ventanas=").append(ventanas);
        sb.append(", calefactor=").append(calefactor);
        sb.append('}');
        return sb.toString();
    }
    
    

    
}
