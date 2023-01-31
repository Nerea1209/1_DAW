/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosdeclase.Ej24;

import java.time.LocalDate;

/**
 *
 * @author nerea
 */
public class Cancion {
    
    private int cancionID;
    private String titulo;
    private String artista;
    private String letra;
    private int duracion;
    private LocalDate fechaLanzamiento;
    private Genero genero;
    private static int contador = 0;

    public Cancion(String titulo, String artista, String letra, int duracion, LocalDate fechaLanzamiento, Genero genero) {
       contador++;
       this.cancionID = contador;
        this.titulo = titulo;
        this.artista = artista;
        this.letra = letra;
        this.duracion = duracion;
        this.fechaLanzamiento = fechaLanzamiento;
        this.genero = genero;
    }

    public Cancion() {
       contador++;
       this.cancionID = contador;
    }
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getCancionID() {
        return cancionID;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.cancionID;
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
        final Cancion other = (Cancion) obj;
        return this.cancionID == other.cancionID;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cancion{");
        sb.append("cancionID=").append(cancionID);
        sb.append(", titulo=").append(titulo);
        sb.append(", artista=").append(artista);
        sb.append(", letra=").append(letra);
        sb.append(", duracion=").append(duracion);
        sb.append(", fechaLanzamiento=").append(fechaLanzamiento);
        sb.append(", genero=").append(genero);
        sb.append('}');
        return sb.toString();
    }
    
    

    
    

}