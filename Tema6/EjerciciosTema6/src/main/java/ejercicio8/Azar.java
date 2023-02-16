/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author nerea
 */
public abstract class Azar {
    
    protected int posibilidades;
    public abstract int lanzar();

    public Azar(int posibilidades) {
        this.posibilidades = Math.abs(posibilidades);
    }

    public Azar() {
    }

    public int getPosibilidades() {
        return posibilidades;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Azar{");
        sb.append("posibilidades=").append(posibilidades);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
