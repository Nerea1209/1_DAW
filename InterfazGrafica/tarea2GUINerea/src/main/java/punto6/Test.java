/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto6;

import javax.swing.JFrame;

/**
 *
 * @author nerea
 */
public class Test {
    
    public static void main(String[] args) {
        // PÁGINA 11
        // Construimos la ventana
    	JFrame frame = new JFrame("App");
	// La ventana no se puede redimensionar
	frame.setResizable(false);
	// Posición de la ventana
    	frame.setLocationRelativeTo(null);
	// Incluimos el panel en la ventana
    	frame.add(new Saludo());
       // Ajusta el frame al contenido
        frame.pack();
	// Hacemos visible la ventana
    	frame.setVisible(true);
	//Acción por defecto al pulsar el botón de cierre de la ventana
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
