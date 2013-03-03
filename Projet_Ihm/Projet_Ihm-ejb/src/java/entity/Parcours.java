/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jérémie
 */
@Entity
@Table(name = "Parcours")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parcours.all", query = "SELECT a FROM Parcours a"),
    @NamedQuery(name = "Parcours.id", query = "SELECT a FROM Parcours a WHERE a.id = :id"),
    @NamedQuery(name = "Parcours.numero", query = "SELECT a FROM Parcours a WHERE a.numero = :numero"),
    @NamedQuery(name = "Parcours.titre", query = "SELECT a FROM Parcours a WHERE a.titre = :titre"),
    @NamedQuery(name = "Parcours.Description", query = "SELECT a FROM Parcours a WHERE a.description = :description"),
    @NamedQuery(name = "Parcours.listeNotes", query = "SELECT a FROM Parcours a WHERE a.listeNotes = :listeNotes")})

public class Parcours implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;
    private Integer numero;
    private String titre;
    private String description;
    private String listeNotes;
    
    public Parcours() {
    }


    public Parcours(Integer id) {
        this.id = id;
    }    
    
    public Parcours(Integer id, Integer numero, String titre, String description, String listeNotes) {
        this.id = id;
        this.numero = numero;
        this.titre = titre;
        this.description = description;
        this.listeNotes = listeNotes;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getListeNotes() {
        return listeNotes;
    }

    public void setListeNotes(String listeNotes) {
        this.listeNotes = listeNotes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parcours)) {
            return false;
        }
        Parcours other = (Parcours) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Parcours[ id=" + id + " ]";
    }
    
}
