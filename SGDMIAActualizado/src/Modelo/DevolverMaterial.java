/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

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
 * Classe que contem os materias devolvidos.
 * @author 
 * @version 1.0
 */
@Entity(name = "devolvermaterial")
public class DevolverMaterial {

    @Id
    @GeneratedValue
    private int codigo;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idestudante")
    private Estudante nomeestudante;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idfuncionario")
    private Funcionario nomefuncionario;
    private String materialrequisitado;
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    private String estado;

    public DevolverMaterial() {
    }

    /**
     * Construtor que incializa os atributos.
     * @param codigo
     * @param nomeestudante
     * @param nomefuncionario
     * @param materialrequisitado
     * @param data
     * @param estado 
     */
    public DevolverMaterial(int codigo, Estudante nomeestudante, Funcionario nomefuncionario, String materialrequisitado, Date data, String estado) {
        this.codigo = codigo;
        this.nomeestudante = nomeestudante;
        this.nomefuncionario = nomefuncionario;
        this.materialrequisitado = materialrequisitado;
        this.data = data;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

   

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Estudante getNomeestudante() {
        return nomeestudante;
    }

    public void setNomeestudante(Estudante nomeestudante) {
        this.nomeestudante = nomeestudante;
    }

    public Funcionario getNomefuncionario() {
        return nomefuncionario;
    }

    public void setNomefuncionario(Funcionario nomefuncionario) {
        this.nomefuncionario = nomefuncionario;
    }

    public String getMaterialrequisitado() {
        return materialrequisitado;
    }

    public void setMaterialrequisitado(String materialrequisitado) {
        this.materialrequisitado = materialrequisitado;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "RequisitarMaterial{" + "codigo=" + codigo + ", nomeestudante=" + nomeestudante + ", nomefuncionario=" + nomefuncionario + ", materialrequisitado=" + materialrequisitado + ", data=" + data + ", estado=" + estado + '}';
    }


}
