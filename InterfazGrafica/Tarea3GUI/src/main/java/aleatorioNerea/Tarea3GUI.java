/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package aleatorioNerea;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Nerea
 */
public class Tarea3GUI extends JPanel{

    public static void main(String[] args) {
         // Construimos la ventana
    	JFrame frame = new JFrame("Generar número aleatorio");
	// La ventana no se puede redimensionar
	frame.setResizable(false);
	// Posición de la ventana
    	frame.setLocationRelativeTo(null);
	// Incluimos el panel en la ventana
    	frame.add(new PanelAleatorio());
       // Ajusta el frame al contenido
        frame.pack();
        frame.setLocationRelativeTo(null);
	// Hacemos visible la ventana
    	frame.setVisible(true);
	//Acción por defecto al pulsar el botón de cierre de la ventana
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
