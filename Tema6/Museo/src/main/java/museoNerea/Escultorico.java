/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoNerea;

/**
 *
 * @author nerea
 */
// Clase final de Escultórico que hereda de Conservador
// por lo tanto tambien implementa comparable por Empleado
// y Restaurador por Conservador
public final class Escultorico extends Conservador {
    
    // No tiene atributos
    // Constructors
    public Escultorico() {
    }

    public Escultorico(int antigüedad, String nif, String nombre) {
        super(antigüedad, nif, nombre);
    }    

    // abstract method of Restaurador
    @Override
    public void restaurar(Obra o) {
        if (o instanceof Escultura escultura) { // Si es una escultura, la restaura
            System.out.println(o.toString() + "El conservador escultórico " + 
                    this.getNombre() + " ha restaurado la escultura " 
                    + escultura.toString());
        } else { // Si no, no puede
            System.out.println("El conservador escultórico " + this.getNombre() + " no puede restaurar "
                    + "una pintura.");
        }
    }
    
    
    
}
