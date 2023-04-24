/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7enerea;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author nerea
 */
public class LeerXML {

    public static void main(String[] args) throws JAXBException {
        GenerarFicheros.serializador.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        GenerarFicheros.serializador.marshal(GenerarFicheros.listaFacturas, System.out);

    }

    public static void leerFichero(String ruta) {
        List<String> lineas = new ArrayList<>();
        try {
            lineas = Files.readAllLines(Paths.get(ruta),
                    StandardCharsets.UTF_8);
        } catch (IOException ex) {
            System.out.println("Error leyendo el fichero");
        }
        for (String linea : lineas) {
            System.out.println(linea);
        }
    }
}
