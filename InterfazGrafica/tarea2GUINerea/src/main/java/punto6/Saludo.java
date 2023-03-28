/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto6;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

/**
 *
 * @author nerea
 */
public class Saludo extends JPanel implements ActionListener {

    // Componentes gráficos: un botón y un área de texto
    private JButton botonSaludar, botonDespedir;
    private JTextArea texto;

    public Saludo() {
        initComponents();
    }

    private void initComponents() {
        // Tamaño del panel
        this.setPreferredSize(new Dimension(600, 200));

        // Borde del panel
        this.setBorder(new TitledBorder("Borde del panel"));

        // Creamos el botón, con un texto a mostrar
        botonSaludar = new JButton("Nombre");
        
        // Creamos el botón, con un texto a mostrar
        botonDespedir = new JButton("Apellidos");

        // Creamos el textArea de una fila por 25 columnas
        texto = new JTextArea(1, 25);

        // Establecemos el color de fondo del textArea
        texto.setBackground(Color.orange);

        // Posicionamiento de componentes con FlowLayout
        this.setLayout(new FlowLayout());

        // Añadimos los componentes al panel
        this.add(botonSaludar);
        this.add(texto);
        this.add(botonDespedir);

        // Se le indica al objeto boton que escuche eventos tipo click
        // y se pasa como argumento una referencia de tipo ActionListener
        // En este caso se pasa this que es el panel sobre el 
        // que está el botón y que implementa la interfaz ActionListener
        botonSaludar.addActionListener(this);
        botonDespedir.addActionListener(this);

    }

    @Override
    // Sobreescribimos el método de la interfaz
    public void actionPerformed(ActionEvent ae) {
        // Si el botón pulsado es botonSaludar
        if (ae.getSource().equals(botonSaludar)) {
            texto.setText("Nerea");
            texto.setForeground(Color.black);
            texto.setBackground(Color.white);
        } else {
            texto.setText("López Sánchez");
            texto.setForeground(Color.white);
            texto.setBackground(Color.blue);
        }
        
    }

}
