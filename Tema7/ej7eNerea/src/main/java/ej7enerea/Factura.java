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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
    
    private static int cont = 1;
    private String codigo;
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate fechaEmision;
    private String descripcion;
    private double totalImporteFactura;

    public Factura() {
        this.fechaEmision = LocalDate.now();
        this.descripcion = RandomStringUtils.randomAlphabetic(20);
        this.totalImporteFactura = new Random().doubles(1, 100, 1000).sum();
        codigo = String.valueOf(cont);
        cont++;
    }

    public Factura(String codigo, LocalDate fechaEmision, String descripcion, double totalImporteFactura) {
        this.codigo = codigo;
        this.fechaEmision = fechaEmision;
        this.descripcion = descripcion;
        this.totalImporteFactura = totalImporteFactura;
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

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(codigo).append(";");
        sb.append(fechaEmision).append(";");
        sb.append(descripcion).append(";");
        sb.append(totalImporteFactura);
        return sb.toString();
    }
    
    
    
    
    
}
