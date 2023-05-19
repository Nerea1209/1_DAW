/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofutbolnerea;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author nerea
 */
@Entity
@Table(name = "entrenadores")
@NamedQueries({
    @NamedQuery(name = "Entrenadores.findAll", query = "SELECT e FROM Entrenadores e"),
    @NamedQuery(name = "Entrenadores.findByCodEntrenador", query = "SELECT e FROM Entrenadores e WHERE e.codEntrenador = :codEntrenador"),
    @NamedQuery(name = "Entrenadores.findByNomCompleto", query = "SELECT e FROM Entrenadores e WHERE e.nomCompleto = :nomCompleto"),
    @NamedQuery(name = "Entrenadores.findByApodo", query = "SELECT e FROM Entrenadores e WHERE e.apodo = :apodo"),
    @NamedQuery(name = "Entrenadores.findByFecNac", query = "SELECT e FROM Entrenadores e WHERE e.fecNac = :fecNac"),
    @NamedQuery(name = "Entrenadores.findByPaisNac", query = "SELECT e FROM Entrenadores e WHERE e.paisNac = :paisNac"),
    @NamedQuery(name = "Entrenadores.findByFoto", query = "SELECT e FROM Entrenadores e WHERE e.foto = :foto")})
public class Entrenadores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codEntrenador")
    private Integer codEntrenador;
    @Column(name = "nomCompleto")
    private String nomCompleto;
    @Column(name = "apodo")
    private String apodo;
    @Column(name = "fecNac")
    @Temporal(TemporalType.DATE)
    private Date fecNac;
    @Column(name = "paisNac")
    private String paisNac;
    @Column(name = "foto")
    private String foto;
    @OneToOne
    @JoinColumn(name = "codEntrenador", referencedColumnName = "codEntrenador")
    private Equipos equipo;

    public Entrenadores() {
    }

    public Entrenadores(Integer codEntrenador) {
        this.codEntrenador = codEntrenador;
    }

    public Integer getCodEntrenador() {
        return codEntrenador;
    }

    public void setCodEntrenador(Integer codEntrenador) {
        this.codEntrenador = codEntrenador;
    }

    public String getNomCompleto() {
        return nomCompleto;
    }

    public void setNomCompleto(String nomCompleto) {
        this.nomCompleto = nomCompleto;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public Date getFecNac() {
        return fecNac;
    }

    public void setFecNac(Date fecNac) {
        this.fecNac = fecNac;
    }

    public String getPaisNac() {
        return paisNac;
    }

    public void setPaisNac(String paisNac) {
        this.paisNac = paisNac;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Equipos getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipos equipo) {
        this.equipo = equipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codEntrenador != null ? codEntrenador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Entrenadores)) {
            return false;
        }
        Entrenadores other = (Entrenadores) object;
        if ((this.codEntrenador == null && other.codEntrenador != null) || (this.codEntrenador != null && !this.codEntrenador.equals(other.codEntrenador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyectofutbolnerea.Entrenadores[ codEntrenador=" + codEntrenador + " ]";
    }

}
