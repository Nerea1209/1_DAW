/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoNerea;

/**
 *
 * @author Nerea
 */
public final class Pintura extends Obra {
    
    private TipoPintura tipo;

    public Pintura() {
    }

    public Pintura(TipoPintura tipo, Integer obraID, String autor) {
        super(obraID, autor);
        this.tipo = tipo;
    }

    public TipoPintura getTipo() {
        return tipo;
    }

    public void setTipo(TipoPintura tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("Fotografia{");
        sb.append("tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
