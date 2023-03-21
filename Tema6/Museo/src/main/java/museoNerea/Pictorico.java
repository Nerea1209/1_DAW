/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoNerea;

/**
 *
 * @author nerea
 */
// Clase final Pictorico que hereda de Conservador y, por lo tanto,
// implementa la interfaz Restaurador y, a su vez, hereda de Empleado,
// con lo cual, implementa Comparable
public final class Pictorico extends Conservador{

    // No tiene atributos
    // Constructors
    public Pictorico() {
    }

    public Pictorico(int antigüedad, String nif, String nombre) {
        super(antigüedad, nif, nombre);
    }

    // abstract methos of Restaurador
    @Override
    public void restaurar(Obra o) {
        if (o instanceof Pintura pintura) {
            System.out.println("El conservador pictorico " + this.getNombre() + " ha restaurado la pintura " 
                    + pintura.toString());
        } else {
            System.out.println("El conservador pictorico " + this.getNombre() + " no puede restaurar "
                    + "una escultura.");
        }
    }
    
    
    
}
