/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author nerea
 */
public class Calefactor {
    
    private int temperatura;
    private String posicion;

    public Calefactor() {
    }

    public Calefactor(int temperatura, String posicion) {
        this.temperatura = temperatura;
        this.posicion = posicion;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
    
    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Calefactor{");
        sb.append("temperatura=").append(temperatura);
        sb.append(", posicion=").append(posicion);
        sb.append('}');
        return sb.toString();
    }

    

    public void encender(){
        System.out.println("El calefactor " + this.posicion + " se está "
                + "encendiendo con temperatura " + this.temperatura);
    }
    
    public void apagar(){
        System.out.println("El calefactor " + this.posicion + " se está apagando");
    }
    
    public void fijarTemperatura(int valor){
        System.out.println("El calefactor " + this.posicion + " ha fijado "
                + "su temperatura a " + valor);
    }

    
    
    
    
    
}
