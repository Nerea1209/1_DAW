/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7enerea;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author nerea
 */
public class LeerXML {

    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        // Crea el contexto JAXB 
        JAXBContext contexto = JAXBContext.newInstance(Facturas.class);
        // Crea el objeto Unmarshaller
        Unmarshaller um = contexto.createUnmarshaller();

        // Llama al método de unmarshalling
        Facturas facturas = (Facturas) um.unmarshal(new File("./xml/facturas.xml"));

        List<Factura> listaFacturas = facturas.getListaFacturas();

        listaFacturas.forEach(System.out::println);

    }
}

