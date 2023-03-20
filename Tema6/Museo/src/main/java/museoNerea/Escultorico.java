/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoNerea;

/**
 *
 * @author nerea
 */
public class Escultorico extends Conservador {

    public Escultorico() {
    }

    public Escultorico(int antigüedad, String nif, String nombre) {
        super(antigüedad, nif, nombre);
    }

    @Override
    public void restaurar(Obra o) {
        if (o instanceof Escultura escultura) {
            System.out.println("El conservador escultórico ha restaurado la escultura " 
                    + escultura.toString());
        } else {
            System.out.println("El conservador escultórico no puede restaurar "
                    + "una fotografía.");
        }
    }
    
    
    
}
