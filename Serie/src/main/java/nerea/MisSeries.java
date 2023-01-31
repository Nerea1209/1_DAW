/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerea;

/**
 *
 * @author nerea
 */
public class MisSeries {
    
    public static void main(String[] args) {
        Serie simpson = new Serie("Los simpson", "Comedia", "...", 
                "Fox", 1000);
        System.out.println(simpson.toString());
        Serie house = new Serie();
        System.out.println(house);
        Serie simpson2 = ServicioSerie.copiar(simpson);
        System.out.println("Hashcode simpson " + simpson.hashCode());
        System.out.println("Hashcode simpson2 " + simpson2.hashCode());
        System.out.println("Son iguales simpson y house? " + simpson.equals(house));
        System.out.println("Son iguales simpson y simpson2? " + simpson.equals(simpson2));
        Serie prisonBreak = new Serie("Prison Break", "Acción", 
                "...", "AMC", 5, 20000);
        System.out.println("Hashcode prisonBreak " + prisonBreak.hashCode());
        // Crear un objeto serie leyendo los datos por teclado
//        Serie peakeBlinders = ServicioSerie.leerTecladoSerie();
//        System.out.println(prisonBreak);
//        System.out.println(peakeBlinders);
//        ServicioSerie.darLike(prisonBreak);
//        ServicioSerie.darLike(peakeBlinders);
//        System.out.println(prisonBreak);
//        System.out.println(peakeBlinders);
    }
    
}
