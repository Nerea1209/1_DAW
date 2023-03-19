/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoNerea;

/**
 *
 * @author Nerea
 */
public final class Humedad extends Sensor {
    
    private final int MAX_HUM = 65;
    private final int MIN_HUM = 55;

    public int getMAX_HUM() {
        return MAX_HUM;
    }

    public int getMIN_HUM() {
        return MIN_HUM;
    }

    public Humedad() {
    }

    public Humedad(int sensorID) {
        super(sensorID);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Humedad{");
        sb.append("máx. humedad =").append(this.MAX_HUM);
        sb.append("mín. humedad =").append(this.MIN_HUM);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public final void alarma() {
        System.out.println("¡¡LA HUMEDAD ESTÁ FUERA DEL RANGO!!");
    }
    
    
    
    
}
