/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagina5;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import pagina11.Saludo;

/**
 *
 * @author nerea
 */
public class Test {

    public static void main(String[] args) {

        // PAGINA 5
        
        // Construimos la ventana
        JFrame ventanaPrincipal = new JFrame("Nerea López Sánchez");

        // Establecemos tamaño y posición
        ventanaPrincipal.setSize(800, 600);
        ventanaPrincipal.setLocationRelativeTo(null);

        // Añadimos un objeto MiPanel al JFrame
        ventanaPrincipal.add(new MiPanel(Color.pink)); // Este no se muestra

        // Si lo ponemos en otro orden, cambia su comportamiento
//        ventanaPrincipal.add(new MiPanel(Color.red));
        // Establecemos el layout del JFrame
        ventanaPrincipal.setLayout(new BorderLayout());

        // PÁGINA 9
        
        // Añadimos los paneles en cada posición del BorderLayout
        // Añadir panel amarillo en la posición superior (NORTH)
        // Ahora es azul
        MiPanel panelAzul = new MiPanel(Color.BLUE);
        // Cambiamos su texto
        panelAzul.getEtiqueta().setText("N");
        ventanaPrincipal.add(panelAzul, BorderLayout.NORTH);

        // Añadir panel rojo en la posición inferior (SOUTH)
        // Ahora es amarillo
        MiPanel panelAmarillo = new MiPanel(Color.yellow);
        // Cambiamos su texto
        panelAmarillo.getEtiqueta().setText("A");
        ventanaPrincipal.add(panelAmarillo, BorderLayout.SOUTH);
        
        // Añadir panel gris en la posición central (CENTER)
        // Ahora es gris oscuro
        MiPanel panelGris = new MiPanel(Color.darkGray);
        // Cambiamos su texto
        panelGris.getEtiqueta().setText("R");
        ventanaPrincipal.add(panelGris, BorderLayout.CENTER);

        // Añadir panel verde en la posición izquierda (WEST)
        // Ahora es gris claro
        MiPanel panelGrisClaro = new MiPanel(Color.lightGray);
        // Cambiamos su texto
        panelGrisClaro.getEtiqueta().setText("E");
        ventanaPrincipal.add(panelGrisClaro, BorderLayout.WEST);

        // Añadir panel cián en la posición derecha (EAST)
        // Ahora es rosa
        MiPanel panelRosa = new MiPanel(Color.pink);
        // Cambiamos su texto
        panelRosa.getEtiqueta().setText("E");
        ventanaPrincipal.add(panelRosa, BorderLayout.EAST);

        // Para que no sea redimensionable
        ventanaPrincipal.setResizable(false);
        
        // Hacemos visible la ventana
        ventanaPrincipal.setVisible(true);

        // Acción por defecto al pulsar el botón de cierre de la ventana
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               

    }

}
