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
@Table(name = "Utilisateur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Utilisateur.all", query = "SELECT a FROM Utilisateur a"),
    @NamedQuery(name = "Utilisateur.id", query = "SELECT a FROM Utilisateur a WHERE a.id = :id"),
    @NamedQuery(name = "Utilisateur.nom", query = "SELECT a FROM Utilisateur a WHERE a.nom = :nom"),
    @NamedQuery(name = "Utilisateur.prenom", query = "SELECT a FROM Utilisateur a WHERE a.prenom = :prenom"),
    @NamedQuery(name = "Utilisateur.mail", query = "SELECT a FROM Utilisateur a WHERE a.mail = :mail"),
    @NamedQuery(name = "Utilisateur.password", query = "SELECT a FROM Utilisateur a WHERE a.password = :password")})


public class Utilisateur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Integer id;
    private String nom;
    private String prenom;
    private String mail;
    private String password;
    
    public Utilisateur() {
    }


    public Utilisateur(Integer id) {
        this.id = id;
    }    
    
    public Utilisateur(Integer id, String nom, String prenom, String mail, String password) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.password = password;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        if (!(object instanceof Utilisateur)) {
            return false;
        }
        Utilisateur other = (Utilisateur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Utilisateur[ id=" + id + " ]";
    }
    
}
