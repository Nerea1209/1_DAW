/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoNerea;

/**
 *
 * @author Nerea
 */
// Clase final de Pintura que hereda de Obra
public final class Pintura extends Obra {
    
    // Atributos encapsulados
    private TipoPintura tipo;

    // Constructors
    public Pintura() {
    }

    public Pintura(TipoPintura tipo, Integer obraID, String autor) {
        super(obraID, autor);
        this.tipo = tipo;
    }

    // Getters and setters
    public TipoPintura getTipo() {
        return tipo;
    }

    public void setTipo(TipoPintura tipo) {
        this.tipo = tipo;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("Pintura{");
        sb.append("tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }
}
