/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Classe que contem os estudantes.
 * @author Tembe e Tpc
 * @version 1.0
 */
@Entity(name="estudante")
public class Estudante {

    private String nome;
    @Id
    private int codigo;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idsalaestudantes")
    private Salas sala;
    private String curso;
    private String regime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    private String estado;

    public Estudante() {
    }

    /**
     * Construtor que incializa os atributos.
     * @param nome
     * @param codigo
     * @param sala
     * @param curso
     * @param regime
     * @param data
     * @param estado 
     */
    public Estudante(String nome, int codigo, Salas sala, String curso, String regime, Date data, String estado) {
        this.nome = nome;
        this.codigo = codigo;
        this.sala = sala;
        this.curso = curso;
        this.regime = regime;
        this.data = data;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getRegime() {
        return regime;
    }

    public void setRegime(String regime) {
        this.regime = regime;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    

}
