/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Nerea
 */
public class Programador extends Empleado {
    
    private Categoria categoria;

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Programador() {
    }

    public Programador(Categoria categoria, double salario, String nombre, 
            String nif, int edad) {
        super(salario, nombre, nif, edad);
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Programador{");
        sb.append("nombre=").append(this.getNombre());
        sb.append(", nif=").append(this.getNif());
        sb.append(", edad=").append(this.getEdad());
        sb.append(", salario=").append(this.categoria);
        sb.append("categoria=").append(categoria);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
