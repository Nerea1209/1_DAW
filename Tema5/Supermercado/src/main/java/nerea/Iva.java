/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package nerea;

/**
 *
 * @author nerea
 */
public enum Iva {
    CUATRO(4),
    DIEZ(10),
    VEINTIUNO(21);
    
    private int valor;
    
    
    
    private Iva(int valor){
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
