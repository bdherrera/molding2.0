/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import model.Contratistas;
import service.ContratistasFacade;

/**
 *
 * @author Admin
 */
@Named(value = "controllerContratistas")
@SessionScoped
public class controllerContratistas implements Serializable {

    //definicion de variables
    private String mensaje;
    private Contratistas contratista = new Contratistas();
    @EJB
    private ContratistasFacade contratistafacade;

    //crud
    public List<Contratistas> getALLContratistas() {
        return contratistafacade.findAll();
    }

    public void eliminar(int id) {
        Contratistas contra = new Contratistas();
        contra.setIdproducto(id);
        contratistafacade.remove(contra);

    }

    public void create() {
        contratistafacade.create(contratista);

        mensaje = "se creo correctamente";

    }

    public void update(int id) {
        contratista.setIdproducto(id);
        contratistafacade.edit(contratista);
        mensaje = " se acatualizo correctamente";
    }
//finalizacion del crud

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * @return the contratista
     */
    public Contratistas getContratista() {
        return contratista;
    }

    /**
     * @param contratista the contratista to set
     */
    public void setContratista(Contratistas contratista) {
        this.contratista = contratista;
    }

    /**
     * @return the contratistafacade
     */
    public ContratistasFacade getContratistafacade() {
        return contratistafacade;
    }

    /**
     * @param contratistafacade the contratistafacade to set
     */
    public void setContratistafacade(ContratistasFacade contratistafacade) {
        this.contratistafacade = contratistafacade;
    }

}
