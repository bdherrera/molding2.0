/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.Size;


/**
 *
 * @author Admin
 */
@Entity
@Table(name = "contratistas")

public class Contratistas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcontratistas")
    private Integer idcontratistas;
    @Column(name = "rut")
    private Integer rut;
    @Size(max = 45)
    @Column(name = "nombre_contratista")
    private String nombreContratista;
    @Size(max = 45)
    @Column(name = "fecha_contrato")
    private String fechaContrato;
    @Size(max = 45)
    @Column(name = "telefono")
    private String telefono;
    @Size(max = 45)
    @Column(name = "direccion_obra")
    private String direccionObra;
    @Size(max = 45)
    @Column(name = "correo")
    private String correo;
    @Size(max = 45)
    @Column(name = "valor_contrato")
    private String valorContrato;

    public Contratistas() {
    }

    public Contratistas(Integer idcontratistas) {
        this.idcontratistas = idcontratistas;
    }

    public Integer getIdcontratistas() {
        return idcontratistas;
    }

    public void setIdcontratistas(Integer idcontratistas) {
        this.idcontratistas = idcontratistas;
    }

    public Integer getRut() {
        return rut;
    }

    public void setRut(Integer rut) {
        this.rut = rut;
    }

    public String getNombreContratista() {
        return nombreContratista;
    }

    public void setNombreContratista(String nombreContratista) {
        this.nombreContratista = nombreContratista;
    }

    public String getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(String fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccionObra() {
        return direccionObra;
    }

    public void setDireccionObra(String direccionObra) {
        this.direccionObra = direccionObra;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(String valorContrato) {
        this.valorContrato = valorContrato;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcontratistas != null ? idcontratistas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contratistas)) {
            return false;
        }
        Contratistas other = (Contratistas) object;
        if ((this.idcontratistas == null && other.idcontratistas != null) || (this.idcontratistas != null && !this.idcontratistas.equals(other.idcontratistas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Contratistas[ idcontratistas=" + idcontratistas + " ]";
    }

    public void setIdproducto(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
