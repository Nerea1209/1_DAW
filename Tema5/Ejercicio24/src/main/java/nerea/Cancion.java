/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerea;

/**
 *
 * @author Nerea
 */
public class Cancion {
    
    private int cancionID;
    private String nombre;
    private String artista;
    private int duracion;
    private String letra;
    private Genero genero;
    private static int contador = 0;

    public Cancion(String nombre, String artista, int duracion, String letra, Genero genero) {
        contador++;
        this.cancionID = contador;
        this.nombre = nombre;
        this.artista = artista;
        this.duracion = duracion;
        this.letra = letra;
        this.genero = genero;
    }

    public Cancion() {
        contador++;
        this.cancionID = contador;
    }

    public int getCancionID() {
        return cancionID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Cancion.contador = contador;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.cancionID;
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
        sb.append(", nombre=").append(nombre);
        sb.append(", artista=").append(artista);
        sb.append(", duracion=").append(duracion);
        sb.append(", letra=").append(letra);
        sb.append(", genero=").append(genero);
        sb.append('}');
        return sb.toString();
    }
      
}
