
import nerea.EjercitoOrdenado;
import nerea.Soldado;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nerea
 */
public class MainEjercitoOrdenado {
    
    public static void main(String[] args) {
        
        // Creamos un ejercito
        EjercitoOrdenado ejercito = new EjercitoOrdenado();
        
        // Creamos soldados
        Soldado pepe = new Soldado("1", "Pepito", "Grillo", 
                "Dominguez", 23);
        Soldado juan = new Soldado("2", "Juan", "Pérez", 
                "Sánchez", 34);
        Soldado francisco = new Soldado("3", "Francisco", "Mariscal", 
                "Rodriguez", 19);
        Soldado fede = new Soldado();
        
        // Añadimos los soldados al ejercito menos fede
        ejercito.alistarSoldado(pepe);
        ejercito.alistarSoldado(juan);
        ejercito.alistarSoldado(francisco);
        
        // Mostramos la lista de soldados
        ejercito.getSoldados().forEach(System.out::println);
        
        // Utilizamos los métodos
        System.out.println("¿Cuántos soldados tiene el ejército? " + ejercito.numeroSoldados());
        System.out.println("¿El ejército tiene soldados? " + ejercito.tieneSoldados());
        System.out.println("¿Esta Fede en el ejército? " + ejercito.estaEnEjercito(fede));
        System.out.println("¿Esta Juan en el ejército? " + ejercito.estaEnEjercito(juan));
        
        // Mostramos la lista de soldados para ver los cambios realizados tras los métodos
        ejercito.imprimirSoldados(ejercito.listaSoldados());
        
        // Eliminamos a juan
        System.out.println("Ahora, eliminamos a Juan");
        ejercito.desmatricularSoldado(juan);
        
        // Mostramos la lista de soldados para ver como se ha eliminado a juan
        ejercito.imprimirSoldados(ejercito.listaSoldados());
        
        // Utilizamos los métodos para ver los cambios
        System.out.println("¿Cuántos soldados tiene el ejército? " + ejercito.numeroSoldados());
        System.out.println("¿El ejército tiene soldados? " + ejercito.tieneSoldados());
        System.out.println("¿Esta Fede en el ejército? " + ejercito.estaEnEjercito(fede));
        System.out.println("¿Esta Juan en el ejército? " + ejercito.estaEnEjercito(juan));
        
    }
    
}
