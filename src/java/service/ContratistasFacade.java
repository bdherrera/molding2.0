/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Contratistas;

/**
 *
 * @author Admin
 */
@Stateless
public class ContratistasFacade extends AbstractFacade<Contratistas> {

    @PersistenceContext(unitName = "moldingPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ContratistasFacade() {
        super(Contratistas.class);
    }
    
}
