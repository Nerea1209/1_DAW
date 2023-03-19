/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoNerea;

/**
 *
 * @author Nerea
 */
public final class Escultura extends Obra {
    
    private double profundidad, altura, anchura;
    private Material material;

    public Escultura() {
    }

    public Escultura(double profundidad, double altura, double anchura, Material material, Integer obraID, String autor) {
        super(obraID, autor);
        this.profundidad = Math.abs(profundidad);
        this.altura =  Math.abs(altura);
        this.anchura =  Math.abs(anchura);
        this.material =  material;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("Escultura{");
        sb.append("profundidad=").append(profundidad);
        sb.append(", altura=").append(altura);
        sb.append(", anchura=").append(anchura);
        sb.append(", material=").append(material);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
