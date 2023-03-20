/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoNerea;

/**
 *
 * @author nerea
 */
public class Fotografico extends Conservador{

    public Fotografico() {
    }

    public Fotografico(int antigüedad, String nif, String nombre) {
        super(antigüedad, nif, nombre);
    }

    @Override
    public void restaurar(Obra o) {
        if (o instanceof Fotografia foto) {
            System.out.println("El conservador fotográfico ha restaurado la escultura " 
                    + foto.toString());
        } else {
            System.out.println("El conservador escultórico no puede restaurar "
                    + "una fotografía.");
        }
    }
    
    
    
}
