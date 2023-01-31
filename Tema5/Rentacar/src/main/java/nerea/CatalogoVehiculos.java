/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nerea;

import java.util.Arrays;

/**
 *
 * @author nerea
 */
public class CatalogoVehiculos {

    private int numeroVehiculos;
    private Vehiculo[] listaVehiculos;

    // El constructor recibe el tamaño del catálogo e
    // inicializa la estructura de datos con vehiculos aleatorios
    public CatalogoVehiculos(int tamanio) {
        tamanio = Math.abs(tamanio);
        this.numeroVehiculos = tamanio;
        this.listaVehiculos = new Vehiculo[tamanio];
        // Una vez creada la estructura de datos le doy
        // valor a cada elemento
        for (int i = 0; i < listaVehiculos.length; i++) {
            this.listaVehiculos[i] = new Vehiculo();
        }
    }

//    public void mostrarCatalogo(){
//        for (Vehiculo v : listaVehiculos) {
//            System.out.println(v);
//        }
//    }
    @Override
    public String toString() {
        String tmp = "";

        for (Vehiculo v : listaVehiculos) {
            if (v!=null){
                tmp += v.toString() + "\n";
            }  
        }

        return tmp;
    }

    // Nº vehículos que hay en el catálogo, no el tamaño
    public int getNumeroVehiculos() {
        return numeroVehiculos;
    }
    
    private int buscarVehiculo(Vehiculo v) {
        // Búsqueda secuencial
        if (v != null) {
            for (int i = 0; i < this.listaVehiculos.length; i++) {
                if (this.listaVehiculos[i] != null && v.equals(this.listaVehiculos[i])) {
                    return i;
                }
            }
        }

        return -1;
    }

    public Vehiculo buscarVehiculo(String bastidor) {
        // Crea un cliente con datos aleatorios
        Vehiculo aux = new Vehiculo();
        aux.setBastidor(bastidor); // Fuerzo a que el vehiculo tenga el nif que busco
        int posicion = buscarVehiculo(aux);

        return (posicion >= 0) ? this.listaVehiculos[posicion] : null;
    }



    public boolean borrarVehiculo(Vehiculo v) {
        int pos = buscarVehiculo(v);
        if (pos >= 0) {
            this.listaVehiculos[pos] = null;
            this.numeroVehiculos--;
            return true;
        }
        return false;
    }

    public void anadirVehiculo(Vehiculo v){
        // Si hay hueco, se inserta en el hueco
        if (this.numeroVehiculos<this.listaVehiculos.length){
            for (int i = 0; i < this.listaVehiculos.length; i++) {
                if (this.listaVehiculos[i] == null){
                    this.listaVehiculos[i] = v;
                    this.numeroVehiculos++;
                    break;
                }
            }
        } else{ // El array está lleno
            //Vehiculo[] nuevo = Arrays.copyOf(listaVehiculos, ++this.numeroVehiculos);
            this.numeroVehiculos++;
            this.listaVehiculos = Arrays.copyOf(listaVehiculos, this.numeroVehiculos);
            this.listaVehiculos[this.numeroVehiculos-1] = v;
        }
    }
    public Vehiculo[] getListaVehiculos() {
        return listaVehiculos;
    }
    
     public static Vehiculo[] copiarCatalogo(Vehiculo[] listaVehiculos){
        Vehiculo[] aux = new Vehiculo[listaVehiculos.length];
        for(int i = 0; i < aux.length; i++){
            aux[i] = listaVehiculos[i];
        }
        return aux;
    }

}
