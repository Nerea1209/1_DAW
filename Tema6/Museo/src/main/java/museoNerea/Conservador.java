/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoNerea;

/**
 *
 * @author nerea
 */
// Clase abstracta de Conservador que hereda de empleado e implementa la interfaz restaurador
public abstract class Conservador extends Empleado implements Restaurador{
    
    // Atributos encapsulados
    private int antigüedad;

    // Constructores
    public Conservador() {
    }

    public Conservador(int antigüedad, String nif, String nombre) {
        super(nif, nombre);
        this.antigüedad = antigüedad;
    }

    // Getters and setters
    public int getAntigüedad() {
        return antigüedad;
    }

    public void setAntigüedad(int antigüedad) {
        this.antigüedad = antigüedad;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Conservador{");
        sb.append("antigüedad=").append(antigüedad);
        sb.append('}');
        return sb.toString();
    }
    
    
}
