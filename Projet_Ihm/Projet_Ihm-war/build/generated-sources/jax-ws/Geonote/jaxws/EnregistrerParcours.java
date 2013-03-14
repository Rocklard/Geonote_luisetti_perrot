
package Geonote.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "EnregistrerParcours", namespace = "http://Geonote/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnregistrerParcours", namespace = "http://Geonote/", propOrder = {
    "id",
    "numero",
    "titre",
    "description",
    "listeNode"
})
public class EnregistrerParcours {

    @XmlElement(name = "id", namespace = "")
    private Integer id;
    @XmlElement(name = "numero", namespace = "")
    private Integer numero;
    @XmlElement(name = "titre", namespace = "")
    private String titre;
    @XmlElement(name = "description", namespace = "")
    private String description;
    @XmlElement(name = "liste_node", namespace = "")
    private String listeNode;

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
     *     returns Integer
     */
    public Integer getNumero() {
        return this.numero;
    }

    /**
     * 
     * @param numero
     *     the value for the numero property
     */
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getTitre() {
        return this.titre;
    }

    /**
     * 
     * @param titre
     *     the value for the titre property
     */
    public void setTitre(String titre) {
        this.titre = titre;
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
    public String getListeNode() {
        return this.listeNode;
    }

    /**
     * 
     * @param listeNode
     *     the value for the listeNode property
     */
    public void setListeNode(String listeNode) {
        this.listeNode = listeNode;
    }

}
