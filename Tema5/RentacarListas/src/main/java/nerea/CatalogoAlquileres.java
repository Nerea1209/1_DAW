/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerea;

/**
 *
 * @author nerea
 */
public class CatalogoAlquileres extends Catalogo<Alquiler> {
    
    public CatalogoAlquileres(int tamanio) {
        super(tamanio);
    }
    
    public Alquiler buscarAlquiler(int alquilerID) {
        // Crea un alquiler con datos aleatorios
        Alquiler aux = new Alquiler();
        aux.setAlquilerID(alquilerID); // Fuerzo a que el alquiler tenga el id que busco
        int posicion = buscarElemento(aux);

        return (posicion >= 0) ? this.lista.get(posicion) : null;
    }
    
}
