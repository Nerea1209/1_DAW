/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package daw;

/**
 *
 * @author nerea
 */

// Creamos una clase record ya que los objetos Casilla son inmutables
public record Casilla(int fila, int columna, TipoCasilla tipoCasilla) {

    // Sobreescribimos el método toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.tipoCasilla == TipoCasilla.BOSQUE) {
            // Si la casilla es de tipo bosque, imprime "Bosque"
            sb.append("Bosque");
        } else { // Ya que el tipo solo puede ser bosque o camino
            // Si la casilla es de tipo camino, imprime "Camino"
            sb.append("Camino");
        }
        return sb.toString();
    }
    
    // Método para comprobar que las coordenadas de la casilla
    // corresponden con la posición en la matriz
    public String comprobarCoordenadasCasilla() {
        StringBuilder sb = new StringBuilder();
        sb.append(" Casilla {");
        sb.append(" fila ").append(this.fila);
        sb.append(", columna ").append(this.columna);
        sb.append(", tipoCasilla ").append(this.tipoCasilla);
        return sb.toString();
    }
    
}
