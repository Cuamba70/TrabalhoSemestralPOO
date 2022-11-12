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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Classe que contem os docentes.
 * @author 
 * @version 1.0
 */
@Entity(name = "docente")
public class Docente implements Serializable {

    private String nome;
    @Id
    private int codigo;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idsaladocentes")
    private Salas sala;
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    private String estado;

    public Docente() {
    }

    /**
     * Construtor que incializa os atribtos.
     * @param nome
     * @param codigo
     * @param sala
     * @param data
     * @param estado 
     */
    public Docente(String nome, int codigo, Salas sala, Date data, String estado) {
        this.nome = nome;
        this.codigo = codigo;
        this.sala = sala;
        this.data = data;
        this.estado = estado;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Salas getSala() {
        return sala;
    }

    public void setSala(Salas sala) {
        this.sala = sala;
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
        return  nome;
    }
    

   

 
}
