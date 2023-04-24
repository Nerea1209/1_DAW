/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7enerea;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
 *
 * @author nerea
 */
public class GenerarFicheros {
    
    public static ListaFacturas listaFacturas = new ListaFacturas();
    public static JAXBContext contexto;
    public static Marshaller serializador;
    
    public static void main(String[] args) throws JAXBException {
        
        // Lista de 50 facturas aleatorias
        List<Factura> facturas = generarListaFactura(50);
        
        // Crear las carpetas "csv" y "xml"
        crearDirectorio("./csv");
        crearDirectorio("xml");
        
        // Guarda los datos de la lista en facturas.csv en la carpeta ./csv
        escribirListaString(pasarListaString(facturas), "./csv/facturas.csv");
        
        // Guarda los datos de la lista en facturas.xml en la carpeta ./xml
        listaFacturas.setListaFacturas(facturas);
        
            // Crea el contexto JAXB. Se encarga de definir los objetos 
            // que vamos a guardar. En nuestro caso sólo el tipo ListaFacturas
            contexto = JAXBContext.newInstance(ListaFacturas.class);
            
            // El contexto JAXB permite crear un objeto Marshaller, que sirve para
            // generar la estructura del fichero XML 
            // El proceso de pasar objetos Java (CatalogoMuebles) a ficheros XML 
            // se conoce como "marshalling" o "serialización"
            serializador = contexto.createMarshaller();

            // Especificamos que la propiedad del formato de salida
            // del serializador sea true, lo que implica que el formato se 
            // realiza con indentación y saltos de línea
            serializador.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // Llamando al método de serialización marshal (sobrecargado) se pueden
            // serializar objetos java en formato XML y volcarlos donde necesitemos:
            // consola, ficheros. El proceso consiste en que el contexto es el 
            // encargo de leer los objetos java, pasarlos al serializador y éste 
            // crear la salida de serialización

            // Serialización y salida por consola
//            serializador.marshal(listaFacturas, System.out);

            // Volcado al fichero xml
            serializador.marshal(listaFacturas, new File("./xml/facturas.xml"));
        
        crearDirectorio("./facturascsv");
        
        for (int i = 0; i < listaFacturas.getListaFacturas().size(); i++) {
            crearFichero("./facturascsv/" + i);
            escribirString(listaFacturas.getListaFacturas().get(i).toString(), "./facturascsv/" + i);
        }
        
    }
    
    public static List<Factura> generarListaFactura(int cantidad) {
        var lista = new ArrayList<Factura>();
        for (int i = 0; i < cantidad; i++) {
            lista.add(new Factura());
        }
        return lista;
    }
    
    public static void crearFichero (String ruta) {
        Path file = Paths.get(ruta);
        try {
            Files.createFile(file);
        } catch (IOException e) {
            System.out.println("Problema creando el archivo.");
            System.out.println(e.toString());
        }
    }
    
    
    // Método para escribir una lista de String, sobreescribiendo si el fichero existe
    public static void escribirListaString(List<String> lista, String ruta) {
        
        try {
            Files.write(Paths.get(ruta), lista, StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException ex) {
            System.out.println("Error creando el fichero");
        }
    }
    
    public static List<String> pasarListaString(List<Factura> facturas){
        List<String> lista = new ArrayList<>();
        for (Factura f : facturas) {
            lista.add(f.toString());
        }
        return lista;
    }
    
    public static void crearDirectorio(String ruta) {
        Path directory = Paths.get(ruta);
        try {
            Files.createDirectory(directory);
        } catch (IOException e) {
            System.out.println("Problema creando el directorio.");
            System.out.println(e.toString());
        }
    }
    
    // Escribe un String a un fichero, sobreescribiendo si existe
    public static void escribirString(String datos, String ruta) {

        try {
            Files.write(Paths.get(ruta), datos.getBytes(StandardCharsets.UTF_8),
                    StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException ex) {
            System.out.println("Error creando el fichero");
        }
    }
}
