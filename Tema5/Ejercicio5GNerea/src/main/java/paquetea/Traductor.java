/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package paquetea;

import java.util.Collection;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author nerea
 */
public class Traductor {

    private SortedMap<String, String> traductor = new TreeMap<>();
   
    
    public static void main(String[] args) {
        
        Traductor traductor = new Traductor();
        traductor.guardarEntrada("alphabet", "abecedario");
        traductor.guardarEntrada("árvore", "árbol");
        traductor.guardarEntrada("tavolo", "mesa");
        traductor.guardarEntrada("pâtes", "masa");
        traductor.guardarEntrada("collège", "colegio");
        traductor.guardarEntrada("Prekybos centras", "centro comercial");
        traductor.guardarEntrada("bank", "banco");
        traductor.guardarEntrada("l'ordinateur", "ordenador");
        traductor.guardarEntrada("rechnen", "informática");
        traductor.guardarEntrada("wolke", "nube");
        
        traductor.mostrarDiccionario();
        
        System.out.println("");
        
        System.out.println("Eliminamos la palabra extranjera 'bank' ");
        traductor.borrarEntrada("bank");
        traductor.mostrarDiccionario();
        
         System.out.println("");
        
        System.out.println("Modificamos el significado de pâtes");
        traductor.modificarEntrada("pâtes", "pasta");
        traductor.mostrarDiccionario();
        
         System.out.println("");
        
        System.out.println("¿Qué significa 'rechnen'? " + traductor.traducirPalabra("rechnen"));
                
         System.out.println("");
        
        System.out.println("-------Palabras extranjeras-------");
        traductor.crearListaPalabrasExtranjeras().forEach(System.out::println);
        
         System.out.println("");
        
        System.out.println("-------Palabras españolas-------");
        traductor.crearListaPalabrasEspañolas().forEach(System.out::println);
        
    }
    
    public void guardarEntrada(String palabraExtranjera, String palabraEspañol){
        traductor.put(palabraExtranjera, palabraEspañol);
    }
    
    public void borrarEntrada(String palabraExtranjera){
        traductor.remove(palabraExtranjera);
    }
    
    public void borrarEntrada(String palabraExtranjera, String palabraEspañol){
        traductor.remove(palabraExtranjera, palabraEspañol);
    }
    
    public void modificarEntrada(String palabraExtranjera, String palabraEspañol){
        traductor.replace(palabraExtranjera, palabraEspañol);
    }
    
    public void modificarEntrada(String palabraExtranjera, String palabraEspañolAntigua,
            String palabraEspañolNueva){
        traductor.replace(palabraExtranjera, palabraEspañolAntigua, palabraEspañolNueva);
    }
    
    public String traducirPalabra(String palabraTraducir){
        return traductor.get(palabraTraducir);
    }
    
    public Set<String> crearListaPalabrasExtranjeras(){
        return traductor.keySet();
    }
    
    public Collection<String> crearListaPalabrasEspañolas(){
        return traductor.values();
    }
    
    public void mostrarDiccionario(){
         traductor.forEach((clave, valor) -> System.out.println( clave + "  ------  " + valor));
    }
    
}