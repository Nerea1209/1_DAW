/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7enerea;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nerea
 */
public class Usuario {
    
    public static void main(String[] args) {

        PanelUsuario panelUsuario = new PanelUsuario();
        crearVentana("Elegir factura", panelUsuario);
    }
    
    public static void crearVentana(String title, JPanel panel) {
         // Construimos la ventana
        JFrame ventanaPrincipal = new JFrame(title);
        // La ventana no se puede redimensionar
	ventanaPrincipal.setResizable(false);
	// Posición de la ventana
    	ventanaPrincipal.setLocationRelativeTo(null);
	// Incluimos el panel en la ventana
    	ventanaPrincipal.add(panel);
       // Ajusta el frame al contenido
        ventanaPrincipal.pack();
        ventanaPrincipal.setLocationRelativeTo(null);
	// Hacemos visible la ventana
    	ventanaPrincipal.setVisible(true);
	//Acción por defecto al pulsar el botón de cierre de la ventana
    	ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static List<String> leerFichero(String ruta) {
        List<String> lineas=new ArrayList<>();
        try {
            lineas = Files.readAllLines(Paths.get(ruta),
                    StandardCharsets.UTF_8);
        } catch (IOException ex) {
            System.out.println("Error leyendo el fichero");
        }
        return lineas;
    }
    
}
