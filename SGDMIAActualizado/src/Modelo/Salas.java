/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *Classe que contem as salas dos docentes.
 * @author 
 * @version 1.0
 */
@Entity(name = "salasdocentes")
public class Salas {

    @Id
    private String numerosala;
    private String descricao;
    private String categoria;
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    private String estado;

    public Salas() {
    }

    /**
     * construtor que inicializa os atributos.
     * @param numerosala
     * @param descricao
     * @param data
     * @param estado 
     */
    public Salas(String numerosala, String descricao,String categoria, Date data, String estado) {
        this.numerosala = numerosala;
        this.descricao = descricao;
        this.categoria = categoria;
        this.data = data;
        this.estado = estado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNumerosala() {
        return numerosala;
    }

    public void setNumerosala(String numerosala) {
        this.numerosala = numerosala;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

   
    @Override
    public String toString() {
        return numerosala;
    }

    
}
