/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerea;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nerea
 */
// Clase genérica, sirve para cualquier de objeto
public class Catalogo<T> {

    protected List<T> lista;

    public Catalogo(int tamanio) {
        tamanio = Math.abs(tamanio);
        this.lista = new ArrayList<>(tamanio); // Esto es por eficiencia
        // lista.size() es 0
    }

    @Override
    public String toString() {
        String tmp = "";

        for (T objeto : this.lista) {
            tmp += objeto.toString() + "\n";
        }

        return tmp;
    }

    // Métodos
    public int getNumeroElementos() {
        return this.lista.size();
    }

    public int buscarElemento(T elemento) {
        // Búsqueda secuencial
        for (int i = 0; i < this.lista.size(); i++) {
            if (elemento.equals(this.lista.get(i))) {
                return i;
            }
        }
        return -1;
    }
   
    public boolean borrarElemento(T elemento) {
        int pos = buscarElemento(elemento);
        if (pos >= 0) {
            this.lista.remove(pos);
            return true;
        }
        return false;
    }

    public void anadirElemento(T elemento) {
        this.lista.add(elemento);
    }

}
