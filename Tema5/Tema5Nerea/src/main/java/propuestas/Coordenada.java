/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package propuestas;

/**
 *
 * @author nerea
 */
public record Coordenada(int fila, int columna) {

    public Coordenada(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(").append(fila);
        sb.append(", ").append(columna);
        return sb.toString();
    }

}
