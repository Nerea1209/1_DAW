/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofutbolnerea;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author nerea
 */
@Entity
@Table(name = "clasificacion")
@NamedQueries({
    @NamedQuery(name = "Clasificacion.findAll", query = "SELECT c FROM Clasificacion c"),
    @NamedQuery(name = "Clasificacion.findByCodClasificacion", query = "SELECT c FROM Clasificacion c WHERE c.codClasificacion = :codClasificacion"),
    @NamedQuery(name = "Clasificacion.findByPuntos", query = "SELECT c FROM Clasificacion c WHERE c.puntos = :puntos"),
    @NamedQuery(name = "Clasificacion.findByPartJugados", query = "SELECT c FROM Clasificacion c WHERE c.partJugados = :partJugados"),
    @NamedQuery(name = "Clasificacion.findByPartGanados", query = "SELECT c FROM Clasificacion c WHERE c.partGanados = :partGanados"),
    @NamedQuery(name = "Clasificacion.findByPartEmpatados", query = "SELECT c FROM Clasificacion c WHERE c.partEmpatados = :partEmpatados"),
    @NamedQuery(name = "Clasificacion.findByPartPerdidos", query = "SELECT c FROM Clasificacion c WHERE c.partPerdidos = :partPerdidos"),
    @NamedQuery(name = "Clasificacion.findByGolesAFavor", query = "SELECT c FROM Clasificacion c WHERE c.golesAFavor = :golesAFavor"),
    @NamedQuery(name = "Clasificacion.findByGolesEnContra", query = "SELECT c FROM Clasificacion c WHERE c.golesEnContra = :golesEnContra"),
    @NamedQuery(name = "Clasificacion.findByDifGoles", query = "SELECT c FROM Clasificacion c WHERE c.difGoles = :difGoles")})
public class Clasificacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codClasificacion")
    private Integer codClasificacion;
    @Column(name = "puntos")
    private Integer puntos;
    @Column(name = "partJugados")
    private Integer partJugados;
    @Column(name = "partGanados")
    private Integer partGanados;
    @Column(name = "partEmpatados")
    private Integer partEmpatados;
    @Column(name = "partPerdidos")
    private Integer partPerdidos;
    @Column(name = "golesAFavor")
    private Integer golesAFavor;
    @Column(name = "golesEnContra")
    private Integer golesEnContra;
    @Column(name = "difGoles")
    private Integer difGoles;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codEquipo")
    private List<Equipos> equiposList;
    

    public Clasificacion() {
    }

    public Clasificacion(Integer codClasificacion) {
        this.codClasificacion = codClasificacion;
    }

    public Integer getCodClasificacion() {
        return codClasificacion;
    }

    public void setCodClasificacion(Integer codClasificacion) {
        this.codClasificacion = codClasificacion;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    public Integer getPartJugados() {
        return partJugados;
    }

    public void setPartJugados(Integer partJugados) {
        this.partJugados = partJugados;
    }

    public Integer getPartGanados() {
        return partGanados;
    }

    public void setPartGanados(Integer partGanados) {
        this.partGanados = partGanados;
    }

    public Integer getPartEmpatados() {
        return partEmpatados;
    }

    public void setPartEmpatados(Integer partEmpatados) {
        this.partEmpatados = partEmpatados;
    }

    public Integer getPartPerdidos() {
        return partPerdidos;
    }

    public void setPartPerdidos(Integer partPerdidos) {
        this.partPerdidos = partPerdidos;
    }

    public Integer getGolesAFavor() {
        return golesAFavor;
    }

    public void setGolesAFavor(Integer golesAFavor) {
        this.golesAFavor = golesAFavor;
    }

    public Integer getGolesEnContra() {
        return golesEnContra;
    }

    public void setGolesEnContra(Integer golesEnContra) {
        this.golesEnContra = golesEnContra;
    }

    public Integer getDifGoles() {
        return difGoles;
    }

    public void setDifGoles(Integer difGoles) {
        this.difGoles = difGoles;
    }

    public List<Equipos> getEquiposList() {
        return equiposList;
    }

    public void setEquiposList(List<Equipos> equiposList) {
        this.equiposList = equiposList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codClasificacion != null ? codClasificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clasificacion)) {
            return false;
        }
        Clasificacion other = (Clasificacion) object;
        if ((this.codClasificacion == null && other.codClasificacion != null) || (this.codClasificacion != null && !this.codClasificacion.equals(other.codClasificacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyectofutbolnerea.Clasificacion[ codClasificacion=" + codClasificacion + " ]";
    }

    
    
}
