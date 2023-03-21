/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoNerea;

/**
 *
 * @author nerea
 */
public class Pictorico extends Conservador{

    public Pictorico() {
    }

    public Pictorico(int antigüedad, String nif, String nombre) {
        super(antigüedad, nif, nombre);
    }

    @Override
    public void restaurar(Obra o) {
        if (o instanceof Pintura foto) {
            System.out.println("El conservador fotográfico ha restaurado la escultura " 
                    + foto.toString());
        } else {
            System.out.println("El conservador escultórico no puede restaurar "
                    + "una fotografía.");
        }
    }
    
    
    
}
