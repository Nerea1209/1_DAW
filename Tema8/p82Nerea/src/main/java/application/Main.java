/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import IGU.PanelPrincipal;
import controllers.FacturaJpaController;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFrame;

/**
 *
 * @author nerea
 */
public class Main {
    
    public static FacturaJpaController facturaJPA = new FacturaJpaController(getEntityManager());
    
    public static void main(String[] args) {
         // Construimos la ventana
        JFrame ventanaPrincipal = new JFrame("Gestionar facturas");
        // La ventana no se puede redimensionar
	ventanaPrincipal.setResizable(false);
	// Posición de la ventana
    	ventanaPrincipal.setLocationRelativeTo(null);
	// Incluimos el panel en la ventana
    	ventanaPrincipal.add(new PanelPrincipal());
       // Ajusta el frame al contenido
        ventanaPrincipal.pack();
        ventanaPrincipal.setLocationRelativeTo(null);
	// Hacemos visible la ventana
    	ventanaPrincipal.setVisible(true);
	//Acción por defecto al pulsar el botón de cierre de la ventana
    	ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    // Crea un objeto EntityManager usando una unidad de persistencia
    private static EntityManagerFactory getEntityManager() {
        // EntityManager permite realizar operaciones con la BD
        // Se obtiene a través del EntityManagerFactory y este a su vez se genera
        // a partir del nombre de la unidad de persistencia (fichero persistence.xml)
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("UnidadDePersistencia");
//        EntityManager em = entityManagerFactory.createEntityManager();
        return entityManagerFactory;
    }
    
}
