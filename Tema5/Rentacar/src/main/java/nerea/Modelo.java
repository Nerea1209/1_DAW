/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package nerea;

import java.util.Random;

/**
 *
 * @author nerea
 */
public enum Modelo {
    
    SEAT_PANDA("Seat", "Panda", "48"),
    FORD_KUGA("Ford", "Kuga" , "120"),
    CUPRA ("Seat", "Cupra", "95");
    
    private String marca;
    private String modelo;
    private String cilindrada;
    
    private Modelo (String marca, String modelo, String cilindrada){
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    @Override
    public String toString() {
        return "Modelo{" + "marca=" + marca + ", modelo=" + modelo + ", cilindrada=" + cilindrada + '}';
    }

    public static Modelo getAleatorio(){
        Random r = new Random();
        Modelo[] modelos = Modelo.values();
//        for (int i = 0;i<modelos.length; i++){
//            System.out.println(modelos[i]);
//        }
        int posicionValida = r.nextInt(0, modelos.length);
        return modelos[posicionValida];
    }
}
