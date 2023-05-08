/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.nerea.modelo;

import java.time.LocalDate;

/**
 *
 * @author nerea
 */
public class FacturaVO {
    
    private String codigo;
    private LocalDate fechaEmision;
    private String descripcion;
    private double totalImporte;

    public FacturaVO() {
    }

    public FacturaVO(String codigo, LocalDate fechaEmision, String descripcion, double totalImporteFactura) {
        this.codigo = codigo;
        this.fechaEmision = fechaEmision;
        this.descripcion = descripcion;
        this.totalImporte = totalImporteFactura;
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

    public double getTotalImporte() {
        return totalImporte;
    }

    public void setTotalImporte(double totalImporte) {
        this.totalImporte = totalImporte;
    }

    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(codigo).append(";");
        sb.append(fechaEmision).append(";");
        sb.append(descripcion).append(";");
        sb.append(totalImporte);
        return sb.toString();
    }
    
    
    
    
    
}
