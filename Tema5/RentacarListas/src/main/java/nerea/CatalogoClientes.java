/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerea;

/**
 *
 * @author nerea
 */
public class CatalogoClientes extends Catalogo<Cliente> {
    
    public CatalogoClientes(int tamanio) {
        super(tamanio);
        for (int i = 0; i < tamanio; i++) {
            this.lista.add(new Cliente());
        }
    }
    
    public Cliente buscarCliente(String nif) {
        // Crea un cliente con datos aleatorios
        Cliente aux = new Cliente();
        aux.setNif(nif); // Fuerzo a que el cliente tenga el nif que busco
        int posicion = buscarElemento(aux);

        return (posicion >= 0) ? this.lista.get(posicion) : null;
    }
    
}
