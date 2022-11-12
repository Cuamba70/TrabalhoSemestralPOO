/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Classe que contem as salas reservadas para poder devolver.
 * @author 
 * @version 1.0
 */
@Entity(name = "devolversala")
public class DevolverSala implements Serializable{

    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idsalas")
    private Salas salas;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idfuncionario")
    private Funcionario nomefuncionario;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "iddocente")
    private Docente docentes;
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    private String estado;

    public DevolverSala() {
    }

    public DevolverSala(Salas salas, Funcionario nomefuncionario, Docente docentes, Date data, String estado) {
        this.salas = salas;
        this.nomefuncionario = nomefuncionario;
        this.docentes = docentes;
        this.data = data;
        this.estado = estado;
    }

    public Salas getSalas() {
        return salas;
    }

    public void setSalas(Salas salas) {
        this.salas = salas;
    }

    public Funcionario getNomefuncionario() {
        return nomefuncionario;
    }

    public void setNomefuncionario(Funcionario nomefuncionario) {
        this.nomefuncionario = nomefuncionario;
    }

    public Docente getDocentes() {
        return docentes;
    }

    public void setDocentes(Docente docentes) {
        this.docentes = docentes;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "ReservarSala{" + "salas=" + salas + ", nomefuncionario=" + nomefuncionario + ", docentes=" + docentes + ", data=" + data + ", estado=" + estado + '}';
    }



}
