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

    public Calefactor() {
    }

    public Calefactor(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Calefactor{");
        sb.append("temperatura=").append(temperatura);
        sb.append('}');
        return sb.toString();
    }

    public void encender(){
        System.out.println("El calefactor se está encendiendo");
    }
    
    public void apagar(){
        System.out.println("El calefactor se está apagando");
    }
    
    public void fijarTemperatura(int valor){
        System.out.println("El calefactor ha fijado su temperatura a " + valor);
    }
    
    
    
}
