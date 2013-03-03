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
@Table(name = "Note")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Note.all", query = "SELECT a FROM Note a"),
    @NamedQuery(name = "Note.id", query = "SELECT a FROM Note a WHERE a.id = :id"),
    @NamedQuery(name = "Note.nom", query = "SELECT a FROM Note a WHERE a.nom = :nom"),
    @NamedQuery(name = "Note.description", query = "SELECT a FROM Note a WHERE a.description = :description"),
    @NamedQuery(name = "Note.position", query = "SELECT a FROM Note a WHERE a.position = :position")})

public class Note implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Integer id;
    private String nom;
    private String description;
    private String position;


    public Note() {
    }


    public Note(Integer id) {
        this.id = id;
    }    
    
    public Note(Integer id, String nom, String description, String position) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.position = position;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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
        if (!(object instanceof Note)) {
            return false;
        }
        Note other = (Note) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Note[ id=" + id + " ]";
    }
    
}
