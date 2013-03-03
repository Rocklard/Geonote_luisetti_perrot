/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Geonote;

import entity.Note;
import entity.Parcours;
import entity.Utilisateur;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import session.NoteFacade;
import session.ParcoursFacade;
import session.UtilisateurFacade;

/**
 *
 * @author Jérémie
 */
@WebService(serviceName = "Geonote")
public class Geonote {

    @EJB
    private NoteFacade NoteFacade;
    @EJB
    private UtilisateurFacade UtilisateurFacade;
    @EJB
    private ParcoursFacade ParcoursFacade;
    /**
     * This is a sample web service operation
     */
    
    List<Note> Notes = NoteFacade.findAll();
    
    List<Utilisateur> Utilisateur = UtilisateurFacade.findAll();
    
    List<Parcours> Parcours = ParcoursFacade.findAll();
    

    @WebMethod(operationName = "EnregistrerNote")
    public void EnregistrerNote(@WebParam(name = "id") Integer id, @WebParam(name = "nom") String nom, @WebParam(name = "description") String description, @WebParam(name = "position") String position) {
        
        Note nouvelleNote = new Note();
              
        nouvelleNote.setId(id);
        nouvelleNote.setNom(nom);
        nouvelleNote.setDescription(description);
        nouvelleNote.setPosition(position);

        NoteFacade.create(nouvelleNote);

    }
    
    @WebMethod(operationName = "MontrerNotes")
    public String MontrerNotes(@WebParam(name = "id") Integer id) {
        
    String retour = "";
         for (int i = 0; i < Notes.size(); i++) {
            
            if(id  == Notes.get(i).getId()) {
                retour= Notes.get(i).getId()+ " " + Notes.get(i).getNom() + " " + Notes.get(i).getDescription() + " " + Notes.get(i).getPosition();
            }    
         }
        
        return retour;
    }
    
    @WebMethod(operationName = "ModifierNotes")
    public void ModifierNotes(@WebParam(name = "id") Integer id, @WebParam(name = "nom") String nom, @WebParam(name = "description") String description, @WebParam(name = "position") String position) {
        
        Note nouvelleNote = new Note();
              
        nouvelleNote.setId(id);
        nouvelleNote.setNom(nom);
        nouvelleNote.setDescription(description);
        nouvelleNote.setPosition(position);
        
        NoteFacade.edit(nouvelleNote);
    }
    
    @WebMethod(operationName = "EnregistrerParcours")
    public void EnregistrerParcours(@WebParam(name = "id") Integer id, @WebParam(name = "numero") Integer numero, @WebParam(name = "titre") String titre, @WebParam(name = "description") String description , @WebParam(name = "liste_node") String liste_node) {
        
        Parcours nouveauParcours = new Parcours();
        
        nouveauParcours.setId(id);
        nouveauParcours.setNumero(numero);
        nouveauParcours.setTitre(titre);
        nouveauParcours.setDescription(description);
        nouveauParcours.setListeNotes(liste_node);
        
        ParcoursFacade.create(nouveauParcours);

    }
    
    @WebMethod(operationName = "MontrerParcours")
    public String MontrerParcours(@WebParam(name = "id") Integer id) {
        
    String retour = "";
         for (int i = 0; i < Parcours.size(); i++) {
            
            if(id  == Parcours.get(i).getId()) {
                retour= Parcours.get(i).getId()+ " " + Parcours.get(i).getNumero() + " " + Parcours.get(i).getTitre() + " " + Parcours.get(i).getDescription() + " " + Parcours.get(i).getListeNotes();
            }    
         }
        
        return retour;
    }
    
    @WebMethod(operationName = "ModifierParcours")
    public void ModifierParcours(@WebParam(name = "id") Integer id, @WebParam(name = "numero") Integer numero, @WebParam(name = "titre") String titre, @WebParam(name = "description") String description , @WebParam(name = "liste_node") String liste_node) {
        
        Parcours nouveauParcours = new Parcours();
        
        nouveauParcours.setId(id);
        nouveauParcours.setNumero(numero);
        nouveauParcours.setTitre(titre);
        nouveauParcours.setDescription(description);
        nouveauParcours.setListeNotes(liste_node);
        
        ParcoursFacade.edit(nouveauParcours);
        
    }

}
