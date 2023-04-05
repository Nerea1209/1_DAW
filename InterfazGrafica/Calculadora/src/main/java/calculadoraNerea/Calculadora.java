/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package calculadoraNerea;

import javax.swing.JFrame;

/**
 *
 * @author Nerea
 */
public class Calculadora {

    public static void main(String[] args) {
         // Construimos la ventana
        JFrame ventanaPrincipal = new JFrame("Calculadora");

        // La ventana no se puede redimensionar
	ventanaPrincipal.setResizable(false);
	// Posición de la ventana
    	ventanaPrincipal.setLocationRelativeTo(null);
	// Incluimos el panel en la ventana
    	ventanaPrincipal.add(new PanelCalculadora());
       // Ajusta el frame al contenido
        ventanaPrincipal.pack();
        ventanaPrincipal.setLocationRelativeTo(null);
	// Hacemos visible la ventana
    	ventanaPrincipal.setVisible(true);
	//Acción por defecto al pulsar el botón de cierre de la ventana
    	ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
