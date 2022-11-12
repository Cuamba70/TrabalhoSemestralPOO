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
 * Classe qque contem os computadores.
 * @author 
 * @version 1.0
 */
@Entity(name="computador")
public class Computador {
    private String descricao;
    @Id
    private String codigo;
    private String componentes;
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    private String estado;

    public Computador() {
    }

    /**
     *  Construtor que inicializa os atributos
     * @param descricao
     * @param codigo
     * @param componentes
     * @param data
     * @param estado 
     */
    public Computador(String descricao, String codigo, String componentes, Date data, String estado) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.componentes = componentes;
        this.data = data;
        this.estado = estado;
    }

    

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getComponentes() {
        return componentes;
    }

    public void setComponentes(String componentes) {
        this.componentes = componentes;
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
        return "Computador{" + "descricao=" + descricao + ", codigo=" + codigo + ", componentes=" + componentes + ", data=" + data + ", estado=" + estado + '}';
    }
    

   
    
    
    
    
    
}
