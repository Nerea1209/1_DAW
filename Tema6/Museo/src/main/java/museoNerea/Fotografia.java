/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoNerea;

/**
 *
 * @author Nerea
 */
public final class Fotografia extends Obra {
    
    private TipoFotografia tipo;

    public Fotografia() {
    }

    public Fotografia(TipoFotografia tipo, Integer obraID, String autor) {
        super(obraID, autor);
        this.tipo = tipo;
    }

    public TipoFotografia getTipo() {
        return tipo;
    }

    public void setTipo(TipoFotografia tipo) {
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
