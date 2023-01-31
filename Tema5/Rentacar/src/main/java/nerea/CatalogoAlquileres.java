/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerea;

import java.util.Arrays;

/**
 *
 * @author nerea
 */
public class CatalogoAlquileres {
    
    private int numeroAlquileres;
    private Alquiler[] listaAlquileres;
    
    // El constructor recibe el tamaño del catálogo e
    // inicializa la estructura de datos con vehiculos aleatorios
    public CatalogoAlquileres(int tamanio) {
        tamanio = Math.abs(tamanio);
        this.numeroAlquileres = 0;
        this.listaAlquileres = new Alquiler[tamanio];
    }

//    public void mostrarCatalogo(){
//        for (Vehiculo v : listaVehiculos) {
//            System.out.println(v);
//        }
//    }
    @Override
    public String toString() {
        String tmp = "";

        for (Alquiler a : listaAlquileres) {
            if (a!=null){
                tmp += a.toString() + "\n";
            }  
        }

        return tmp;
    }

    // Nº vehículos que hay en el catálogo, no el tamaño
    public int getNumeroAlquileres() {
        return numeroAlquileres;
    }
    
    private int buscarAlquiler(Alquiler a) {
        // Búsqueda secuencial
        if (a != null) {
            for (int i = 0; i < this.listaAlquileres.length; i++) {
                if (this.listaAlquileres[i] != null && a.equals(this.listaAlquileres[i])) {
                    return i;
                }
            }
        }

        return -1;
    }

    public Alquiler buscarAlquiler(int alquilerID) {
        // Crea un cliente con datos aleatorios
        Alquiler aux = new Alquiler();
        aux.setAlquilerID(alquilerID); // Fuerzo a que el vehiculo tenga el nif que busco
        int posicion = buscarAlquiler(aux);

        return (posicion >= 0) ? this.listaAlquileres[posicion] : null;
    }



    public boolean borrarAlquiler(Alquiler a) {
        int pos = buscarAlquiler(a);
        if (pos >= 0) {
            this.listaAlquileres[pos] = null;
            this.numeroAlquileres--;
            return true;
        }
        return false;
    }

    public void anadirAlquiler(Alquiler a){
        // Si hay hueco, se inserta en el hueco
        if (this.numeroAlquileres < this.listaAlquileres.length){
            for (int i = 0; i < this.listaAlquileres.length; i++) {
                if (this.listaAlquileres[i] == null){
                    this.listaAlquileres[i] = a;
                    this.numeroAlquileres++;
                    break;
                }
            }
        } else{ // El array está lleno
            //Vehiculo[] nuevo = Arrays.copyOf(listaVehiculos, ++this.numeroVehiculos);
            this.numeroAlquileres++;
            this.listaAlquileres = Arrays.copyOf(listaAlquileres, this.numeroAlquileres);
            this.listaAlquileres[this.numeroAlquileres-1] = a;
        }
    }
    public Alquiler[] getListaAlquileres() {
        return listaAlquileres;
    }
    
     public static Alquiler[] copiarCatalogo(Alquiler[] listaAlquileres){
        Alquiler[] aux = new Alquiler[listaAlquileres.length];
        for(int i = 0; i < aux.length; i++){
            aux[i] = listaAlquileres[i];
        }
        return aux;
    }

    
}
