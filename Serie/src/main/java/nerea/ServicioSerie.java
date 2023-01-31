/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerea;

import java.util.Scanner;

/**
 *
 * @author nerea
 */

// Me sirve de conexión entre el main y mi clase Serie
public class ServicioSerie {
    
    private static Scanner teclado = new Scanner(System.in);
    
    // Lee por teclado los datos de una serie y devuelve el objeto creado
    public static Serie leerTecladoSerie(){
        // Creamos el objeto de tipo Serie
        Serie serie;
        
        // Leer por teclado e instanciar
        System.out.println("Nombre de la serie: ");
        String nombreSerie = teclado.nextLine();
        System.out.println("Género de la serie: ");
        String generoSerie = teclado.nextLine();
        System.out.println("Sinopsis de la serie: ");
        String sinopsisSerie = teclado.nextLine();
        System.out.println("Productora de la serie: ");
        String productoraSerie = teclado.nextLine();
        System.out.println("Número de temporadas de la serie: ");
        int numTemporadasSerie = teclado.nextInt();
        System.out.println("Número de likes de la serie: ");
        int numLikesSerie = teclado.nextInt();
        
        teclado.nextLine();
        
        serie = new Serie(nombreSerie, generoSerie, sinopsisSerie, 
                productoraSerie, numTemporadasSerie, numLikesSerie);
        
        // Devolvemos el tipo Serie
        return serie;
    }
    
    public static void darLike(Serie serie){
        System.out.println("Te ha gustado la serie " + serie.getTitulo() + " ?");
        String respuesta = teclado.nextLine();
        if(respuesta.contains("sí")){
            serie.darLike();
        }
    }
    
    public static Serie copiar(Serie origen){
        Serie aux = new Serie(origen.getTitulo(), 
                origen.getGenero(), origen.getSinopsis(), 
                origen.getProductora(), 
                origen.getNumTemporada(), 
                origen.getNumLikes());
        return aux;
    }
    
}
