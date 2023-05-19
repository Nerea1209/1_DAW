/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofutbolnerea;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author nerea
 */
@Entity
@Table(name = "partidos")
@NamedQueries({
    @NamedQuery(name = "Partidos.findAll", query = "SELECT p FROM Partidos p"),
    @NamedQuery(name = "Partidos.findByCodPartido", query = "SELECT p FROM Partidos p WHERE p.codPartido = :codPartido"),
    @NamedQuery(name = "Partidos.findByFecha", query = "SELECT p FROM Partidos p WHERE p.fecha = :fecha"),
    @NamedQuery(name = "Partidos.findByLugar", query = "SELECT p FROM Partidos p WHERE p.lugar = :lugar"),
    @NamedQuery(name = "Partidos.findByResultado", query = "SELECT p FROM Partidos p WHERE p.resultado = :resultado")})
public class Partidos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codPartido")
    private Integer codPartido;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "lugar")
    private String lugar;
    @Column(name = "resultado")
    private String resultado;
    @JoinColumn(name = "codEquipo1", referencedColumnName = "codEquipo")
    @ManyToOne(optional = false)
    private Equipos codEquipo1;
    @JoinColumn(name = "codEquipo2", referencedColumnName = "codEquipo")
    @ManyToOne(optional = false)
    private Equipos codEquipo2;

    public Partidos() {
    }

    public Partidos(Integer codPartido) {
        this.codPartido = codPartido;
    }

    public Integer getCodPartido() {
        return codPartido;
    }

    public void setCodPartido(Integer codPartido) {
        this.codPartido = codPartido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Equipos getCodEquipo1() {
        return codEquipo1;
    }

    public void setCodEquipo1(Equipos codEquipo1) {
        this.codEquipo1 = codEquipo1;
    }

    public Equipos getCodEquipo2() {
        return codEquipo2;
    }

    public void setCodEquipo2(Equipos codEquipo2) {
        this.codEquipo2 = codEquipo2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPartido != null ? codPartido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Partidos)) {
            return false;
        }
        Partidos other = (Partidos) object;
        if ((this.codPartido == null && other.codPartido != null) || (this.codPartido != null && !this.codPartido.equals(other.codPartido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyectofutbolnerea.Partidos[ codPartido=" + codPartido + " ]";
    }
    
}
