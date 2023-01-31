/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosdeclase;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



/**
 *
 * @author nerea
 */
public class Ej19 {
    
    Icon icono = new ImageIcon("images/avion.jpg");
    public static void main(String[] args) {

        
    }
    
    public int pedirOpcion(){
        return JOptionPane.showOptionDialog(null, "¿Qué desea realizar?", 
                "Airways", JOptionPane.YES_NO_CANCEL_OPTION, 
                JOptionPane.QUESTION_MESSAGE, icono, 
                new Object[] {"Reservar asiento", "Cancelar asiento", "Mostrar asientos"}, null);
    }
    
}
