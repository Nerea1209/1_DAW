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
public class CatalogoClientes {

    private int numeroClientes;
    private Cliente[] listaClientes;

    // El constructor recibe el tamaño del catálogo e
    // inicializa la estructura de datos con vehiculos aleatorios
    public CatalogoClientes(int tamanio) {
        tamanio = Math.abs(tamanio);
        this.numeroClientes = tamanio;
        this.listaClientes = new Cliente[tamanio];
        // Una vez creada la estructura de datos le doy
        // valor a cada elemento
        for (int i = 0; i < listaClientes.length; i++) {
            this.listaClientes[i] = new Cliente();
        }
    }

//    public void mostrarCatalogo(){
//        for (Cliente c : listaClientes) {
//            System.out.println(v);
//        }
//    }
    @Override
    public String toString() {
        String tmp = "";

        for (Cliente c : listaClientes) {
            if (c != null) {
                tmp += c.toString() + "\n";
            }
        }

        return tmp;
    }

    // Nº vehículos que hay en el catálogo, no el tamaño
    public int getNumeroClientes() {
        return numeroClientes;
    }

    public int buscarCliente(Cliente c) {
        // Búsqueda secuencial
        if (c != null) {
            for (int i = 0; i < this.listaClientes.length; i++) {
                if (this.listaClientes[i] != null && c.equals(this.listaClientes[i])) {
                    return i;
                }
            }
        }

        return -1;
    }

    public Cliente buscarCliente(String nif) {
        // Crea un cliente con datos aleatorios
        Cliente aux = new Cliente();
        aux.setNif(nif); // Fuerzo a que el cliente tenga el nif que busco
        int posicion = buscarCliente(aux);

        return (posicion >= 0) ? this.listaClientes[posicion] : null;
    }

    public boolean borrarCliente(Cliente c) {

        int pos = buscarCliente(c);
        if (pos >= 0) {
            this.listaClientes[pos] = null;
            this.numeroClientes--;
            return true;
        }
        return false;
    }

    public void anadirCliente(Cliente c) {
        // Si hay hueco, se inserta en el hueco
        if (this.numeroClientes < this.listaClientes.length) {
            for (int i = 0; i < this.listaClientes.length; i++) {
                if (this.listaClientes[i] == null) {
                    this.listaClientes[i] = c;
                    this.numeroClientes++;
                    break;
                }
            }
        } else { // El array está lleno
            //Cliente[] nuevo = Arrays.copyOf(listaClientes, ++this.numeroClientes);
            this.numeroClientes++;
            this.listaClientes = Arrays.copyOf(listaClientes, this.numeroClientes);
            this.listaClientes[this.numeroClientes - 1] = c;
        }
    }

    public Cliente[] getListaClientes() {
        return listaClientes;
    }

    public static Cliente[] copiarCatalogo(Cliente[] listaClientes) {
        Cliente[] aux = new Cliente[listaClientes.length];
        for (int i = 0; i < aux.length; i++) {
            aux[i] = listaClientes[i];
        }
        return aux;
    }

}
