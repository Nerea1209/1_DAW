/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author nerea
 */
public class Persiana {
    
    private Color color;

    public Persiana() {
    }

    public Persiana(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persiana{");
        sb.append("color=").append(color);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
