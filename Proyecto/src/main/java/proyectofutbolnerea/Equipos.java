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
@Table(name = "equipos")
@NamedQueries({
    @NamedQuery(name = "Equipos.findAll", query = "SELECT e FROM Equipos e"),
    @NamedQuery(name = "Equipos.findByCodEquipo", query = "SELECT e FROM Equipos e WHERE e.codEquipo = :codEquipo"),
    @NamedQuery(name = "Equipos.findByNomEquipo", query = "SELECT e FROM Equipos e WHERE e.nomEquipo = :nomEquipo"),
    @NamedQuery(name = "Equipos.findByFoto", query = "SELECT e FROM Equipos e WHERE e.foto = :foto")})
public class Equipos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codEquipo")
    private Integer codEquipo;
    @Column(name = "nomEquipo")
    private String nomEquipo;
    @Column(name = "foto")
    private String foto;
    @JoinColumn(name = "codClasificacion", referencedColumnName = "codClasificacion")
    @ManyToOne(optional = false)
    private Clasificacion codClasificacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codEquipo1")
    private List<Partidos> partidosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codEquipo2")
    private List<Partidos> partidosList1;
    @JoinColumn(name = "codEntrenador", referencedColumnName = "codEntrenador")
    @ManyToOne(optional = false)
    private Entrenadores codEntrenador;

    public Equipos() {
    }

    public Equipos(Integer codEquipo) {
        this.codEquipo = codEquipo;
    }

    public Integer getCodEquipo() {
        return codEquipo;
    }

    public void setCodEquipo(Integer codEquipo) {
        this.codEquipo = codEquipo;
    }

    public String getNomEquipo() {
        return nomEquipo;
    }

    public void setNomEquipo(String nomEquipo) {
        this.nomEquipo = nomEquipo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Clasificacion getCodClasificacion() {
        return codClasificacion;
    }

    public void setCodClasificacion(Clasificacion codClasificacion) {
        this.codClasificacion = codClasificacion;
    }

    public List<Partidos> getPartidosList() {
        return partidosList;
    }

    public void setPartidosList(List<Partidos> partidosList) {
        this.partidosList = partidosList;
    }

    public List<Partidos> getPartidosList1() {
        return partidosList1;
    }

    public void setPartidosList1(List<Partidos> partidosList1) {
        this.partidosList1 = partidosList1;
    }

    public Entrenadores getCodEntrenador() {
        return codEntrenador;
    }

    public void setCodEntrenador(Entrenadores codEntrenador) {
        this.codEntrenador = codEntrenador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codEquipo != null ? codEquipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipos)) {
            return false;
        }
        Equipos other = (Equipos) object;
        if ((this.codEquipo == null && other.codEquipo != null) || (this.codEquipo != null && !this.codEquipo.equals(other.codEquipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyectofutbolnerea.Equipos[ codEquipo=" + codEquipo + " ]";
    }

    
    
}
