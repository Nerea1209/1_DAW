/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package daw.nerea.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author nerea
 */
public class ConexionClase {

    private static final String SERVIDOR = "jdbc:mysql://192.168.56.101/";
    private static final String NOMBRE_BASE_DATOS = "p81Nerea?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String USER = "nerea";
    private static final String PASS = "1209";

    private static Connection instancia = null;
    
    // Patrón Singleton
    // Constructor privado no accesible desde otras clases
    private ConexionClase() {

    }

    // Método de clase para acceder a la instancia del objeto Connection
    public static Connection getInstance() {
        // Si el objeto Connection no está creado, se crea
        if (instancia == null) {
            try {

                // Se crea el objeto Connection	
                instancia = DriverManager.getConnection(SERVIDOR + NOMBRE_BASE_DATOS, USER, PASS);

                System.out.println("Conexión realizada con éxito.");

            } catch (SQLException e) {

                // Error en la conexión
                System.out.println("Conexión fallida: " + e.getMessage());
            }
        }
        return instancia;
    }
}
