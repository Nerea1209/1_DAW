/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ej3;

import java.util.Random;

/**
 *
 * @author nerea
 */
public enum Voz{
    CONTRATENOR("Contratenor",Genero.MASCULINO), 
    TENOR("Tenor",Genero.MASCULINO), 
    BARITONO("Baritono",Genero.MASCULINO), 
    SOPRANO("Soprano",Genero.FEMENINO), 
    MEZZOSOPRANO("Mezzosoprano",Genero.FEMENINO), 
    CONTALTO("Contralto",Genero.FEMENINO);
    
    private String nombre;
    private Genero genero;
    
    private Voz(String nombre, Genero genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Voz{");
        sb.append("nombre=").append(nombre);
        sb.append(", genero=").append(genero);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    public static Voz randomVoz(){
        Voz[] voces = values();
        return voces[new Random().nextInt(0, voces.length)];
    }
}
