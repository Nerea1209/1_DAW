 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package clases;

/**
 *
 * @author nerea
 */

// Título, Género ("Acción", "Comedia", "Scifi", "Drama"), Sinopsis, numTemporadas,
// Productor
// 
public class Serie {

    // Declaración de la clase
    
        
        // Atributos de clase (static)
        
        
        // Atributos de instancia (no static)
        private String titulo;
        private String genero;
        private String sinopsis;
        private String productora;
        private int numTemporada;
        private int numLikes;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public int getNumTemporada() {
        return numTemporada;
    }

    public void setNumTemporada(int numTemporada) {
        this.numTemporada = numTemporada;
    }

    @Override
    public String toString() {
        return "Serie{" + "titulo=" + titulo + ", genero=" + genero + ", sinopsis=" + sinopsis + ", productora=" + productora + ", numTemporada=" + numTemporada + ", numLikes=" + numLikes + '}';
    }

    public Serie(String titulo, String genero, String sinopsis, String productora, int numTemporada, int numLikes) {
        this.titulo = titulo;
        this.genero = genero;
        this.sinopsis = sinopsis;
        this.productora = productora;
        this.numTemporada = numTemporada;
        this.numLikes = numLikes;
    }

    public Serie(String titulo, String genero, String sinopsis, String productora, int numTemporada) {
        this.titulo = titulo;
        this.genero = genero;
        this.sinopsis = sinopsis;
        this.productora = productora;
        this.numTemporada = numTemporada;
    }
    
    

    public Serie() {
        // Los atributos quedan inicializados con valores por defecto
        // Objetos apuntan a null
        // números a 0
        // boolean a false
    }
    
    public void darLike(){
        this.numLikes++;
    }
    
    
   
}
