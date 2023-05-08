/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.nerea.aplicacion;

import daw.nerea.modelo.FacturaDAO;
import daw.nerea.modelo.FacturaVO;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nerea
 */
public class Programa {
    
    public static void main(String[] args) {
        
        FacturaDAO daoFactura = new FacturaDAO();
        
        List<String> lineas = leerArchivo("facturas.csv");
        lineas.forEach(System.out::println);
        List<FacturaVO> listaFacturas = obtenerListaFactura(lineas);
        try {
            // Insertamos la lista a la tabla
            System.out.println("Nº facturas insertadas " + daoFactura.insertFactura(listaFacturas));
            
            // Comprobamos la tabla
            System.out.println("");
            System.out.println("Comprobamos en una nueva lista que se recogen los datos desde la tabla.");
            List<FacturaVO> nuevaLista = daoFactura.getAll();
            nuevaLista.forEach(System.out::println);
            
            // Buscamos factura con un código
            System.out.println("");
            System.out.println("Factura con primary key 3: ");
            System.out.println(daoFactura.findByPk("3"));
            
            // Borramos una factura
            System.out.println("");
            System.out.println("Se va a borrar la factura con codigo 6");
            System.out.println("Nº facturas borradas " + 
                    daoFactura.deleteFactura(new FacturaVO("6", null, null, 0)));
            
            // Comprobamos que se ha borrado correctamente
            System.out.println("");
            nuevaLista = daoFactura.getAll();
            System.out.println("Lista con datos recogidos desde la B.D despues de borrar una factura");
            nuevaLista.forEach(System.out::println);
            
            // Modificamos la factura 23
            System.out.println("");
            System.out.println("Modificación de la factura con codigo 23");
            System.out.println("Nº Facturas modificadas " + 
                    daoFactura.updateFactura("23", new FacturaVO("60",
                            LocalDate.of(2022, 6, 5), 
                            "NuevaDescripcion", 7533.67)));
            
            // Comprobamos que se ha modificado correctamente
            System.out.println("");
            nuevaLista = daoFactura.getAll();
            System.out.println("Lista con datos recogidos desde la B.D despues de modificar una factura");
            nuevaLista.forEach(System.out::println);
            
        } catch (SQLException sqle) {
            System.out.println("No se ha podido realizar la operación:");
            System.out.println(sqle.getMessage());
        }
    }
    
    public static List<String> leerArchivo(String ruta) {
        List<String> lineas = new ArrayList<>();
        try {
            lineas = Files.readAllLines(Paths.get(ruta),
                    StandardCharsets.UTF_8);
        } catch (IOException ex) {
            System.out.println("Error leyendo el fichero");
        }
        return lineas;
    }
    
    private static List<FacturaVO> obtenerListaFactura (List<String> lineas) {
        List<FacturaVO> facturas = new ArrayList<>();
        for (String linea : lineas) {
            String[] partes = linea.split(";");
            facturas.add(new FacturaVO(partes[0], LocalDate.parse(partes[1]), 
                    partes[2], Double.parseDouble(partes[3])));
        }
        return facturas;
    }
    
}