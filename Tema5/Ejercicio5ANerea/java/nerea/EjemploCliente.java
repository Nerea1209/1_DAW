/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerea;

/**
 *
 * @author nerea
 */
public class EjemploCliente {
    
    public static void main(String[] args) {
        
        CatalogoClientes catalogo = new CatalogoClientes(10);
        System.out.println("Nº clientes del catálogo: " + catalogo.getNumeroClientes());
        System.out.println(catalogo);
        
        catalogo.borrarCliente(catalogo.getListaClientes()[2]);
        System.out.println("---------- Después de borrar el de la posición 2 ---------");
        System.out.println("Nº clientes del catálogo: " + catalogo.getNumeroClientes());
        System.out.println(catalogo);
        
        Cliente aux = new Cliente();
        aux.setApellido(Apellido.BLANCO);
        catalogo.anadirCliente(aux);
        
        System.out.println("---------- Después de añadir  ---------");
        System.out.println("Nº clientes del catálogo: " + catalogo.getNumeroClientes());
        System.out.println(catalogo);
        
        aux.setNombre(Nombre.ESTRELLA);
        catalogo.anadirCliente(aux);
        
        System.out.println("---------- Después de añadir  ---------");
        System.out.println("Nº clientes del catálogo: " + catalogo.getNumeroClientes());
        System.out.println(catalogo);
        
    }
    
}
