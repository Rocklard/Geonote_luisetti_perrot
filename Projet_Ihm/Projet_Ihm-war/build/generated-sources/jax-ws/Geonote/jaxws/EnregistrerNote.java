
package Geonote.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "EnregistrerNote", namespace = "http://Geonote/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnregistrerNote", namespace = "http://Geonote/", propOrder = {
    "id",
    "nom",
    "description",
    "position"
})
public class EnregistrerNote {

    @XmlElement(name = "id", namespace = "")
    private Integer id;
    @XmlElement(name = "nom", namespace = "")
    private String nom;
    @XmlElement(name = "description", namespace = "")
    private String description;
    @XmlElement(name = "position", namespace = "")
    private String position;

    /**
     * 
     * @return
     *     returns Integer
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * 
     * @param id
     *     the value for the id property
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * 
     * @param nom
     *     the value for the nom property
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * 
     * @param description
     *     the value for the description property
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getPosition() {
        return this.position;
    }

    /**
     * 
     * @param position
     *     the value for the position property
     */
    public void setPosition(String position) {
        this.position = position;
    }

}
