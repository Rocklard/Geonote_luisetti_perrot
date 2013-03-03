/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.Note;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jérémie
 */
@Stateless
public class NoteFacade extends AbstractFacade<Note> {
    @PersistenceContext(unitName = "Projet_Ihm-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public NoteFacade() {
        super(Note.class);
    }
    
}
