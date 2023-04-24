/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7enerea;

import java.time.LocalDate;
import java.util.Random;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author nerea
 */
// Anotación @XmlRootElement, nombre de la etiqueta XML raíz.
@XmlRootElement(name = "factura")
// Anotación @XmlAccesorType define el elemento que usará JAXB durante el 
// procesamiento de datos (en este caso por atributo)
@XmlAccessorType(XmlAccessType.FIELD)
public class Factura {
    
    private static String codigo = "0";

    public static String getCodigo() {
        return codigo;
    }
    private LocalDate fechaEmision;
    private String descripcion;
    private double totalImporteFactura;

    public Factura() {
        this.fechaEmision = LocalDate.now();
        this.descripcion = RandomStringUtils.randomAlphabetic(20);
        this.totalImporteFactura = new Random().doubles(1, 100, 1000).sum();
        codigo = String.valueOf(Integer.parseInt(codigo)+1);
    }

    public Factura(LocalDate fechaEmision, String descripcion, double totalImporteFactura) {
        this.fechaEmision = fechaEmision;
        this.descripcion = descripcion;
        this.totalImporteFactura = totalImporteFactura;
        codigo = String.valueOf(Integer.parseInt(codigo)+1);
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getTotalImporteFactura() {
        return totalImporteFactura;
    }

    public void setTotalImporteFactura(double totalImporteFactura) {
        this.totalImporteFactura = totalImporteFactura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(fechaEmision).append(";");
        sb.append(descripcion).append(";");
        sb.append(totalImporteFactura);
        return sb.toString();
    }
    
    
    
    
    
}
