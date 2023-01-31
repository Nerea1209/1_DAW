/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package daw;

/**
 *
 * @author nerea
 */
public record Coordenada(int fila, int columna, int valor) {

    public Coordenada(int fila, int columna, int valor) {
        this.fila = fila;
        this.columna = columna;
        this.valor = valor;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(").append(fila);
        sb.append(", ").append(columna);
        sb.append(") con valor ").append(valor);
        return sb.toString();
    }

}
