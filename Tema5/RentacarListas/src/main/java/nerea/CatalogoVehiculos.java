/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerea;

/**
 *
 * @author nerea
 */

// Crea la clase heredando de la clase catalogo (extends)
public class CatalogoVehiculos extends Catalogo<Vehiculo> {
    
    public CatalogoVehiculos(int tamanio) {
        super(tamanio); // Llama al constructor de la clase padre
        for (int i = 0; i < tamanio; i++) {
            this.lista.add(new Vehiculo());
        }
    }
    
    public Vehiculo buscarVehiculo(String bastidor) {
        // Crea un vehiculo con datos aleatorios
        Vehiculo aux = new Vehiculo();
        aux.setBastidor(bastidor); // Fuerzo a que el vehiculo tenga el bastidor que busco
        int posicion = buscarElemento(aux);

        return (posicion >= 0) ? this.lista.get(posicion) : null;
    }
    
      
}
