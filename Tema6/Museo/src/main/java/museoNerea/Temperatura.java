/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoNerea;

/**
 *
 * @author Nerea
 */
public final class Temperatura extends Sensor {
    
    private final int MAX_TEMP = 24;
    private final int MIN_TEMP = 18;

    public int getMAX_TEMP() {
        return MAX_TEMP;
    }

    public int getMIN_TEMP() {
        return MIN_TEMP;
    }

    public Temperatura() {
    }

    public Temperatura(int sensorID) {
        super(sensorID);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Temperatura{");
        sb.append("MAX_TEMP=").append(MAX_TEMP);
        sb.append(", MIN_TEMP=").append(MIN_TEMP);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public final void alarma() {
        System.out.println("¡¡LA TEMPERATURA ESTÁ FUERA DEL RANGO!!");
    }
    
    
    
}
