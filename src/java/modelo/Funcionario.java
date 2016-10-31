/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author NERI-DESENVOLVEDOR
 */
public class Funcionario {
    private int id_funcionario;
    private String nome_funcionario;
    private String sobrenome_funcionario;
    private Date data_nascimento_funcionario;
    private String descricao_sexo;
    private String rg_funcionario;
    private int cpf_funcionario;
    private Date data_admissao;
    private Date data_demissao;
    private int id_endereco;
    private int id_contato;
    private int id_especialidade;

    public Funcionario() {
    }

    /**
     * @return the id_funcionario
     */
    public int getId_funcionario() {
        return id_funcionario;
    }

    /**
     * @param id_funcionario the id_funcionario to set
     */
    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    /**
     * @return the nome_funcionario
     */
    public String getNome_funcionario() {
        return nome_funcionario;
    }

    /**
     * @param nome_funcionario the nome_funcionario to set
     */
    public void setNome_funcionario(String nome_funcionario) {
        this.nome_funcionario = nome_funcionario;
    }

    /**
     * @return the sobrenome_funcionario
     */
    public String getSobrenome_funcionario() {
        return sobrenome_funcionario;
    }

    /**
     * @param sobrenome_funcionario the sobrenome_funcionario to set
     */
    public void setSobrenome_funcionario(String sobrenome_funcionario) {
        this.sobrenome_funcionario = sobrenome_funcionario;
    }

    /**
     * @return the data_nascimento_funcionario
     */
    public Date getData_nascimento_funcionario() {
        return data_nascimento_funcionario;
    }

    /**
     * @param data_nascimento_funcionario the data_nascimento_funcionario to set
     */
    public void setData_nascimento_funcionario(Date data_nascimento_funcionario) {
        this.data_nascimento_funcionario = data_nascimento_funcionario;
    }

    /**
     * @return the descricao_sexo
     */
    public String getDescricao_sexo() {
        return descricao_sexo;
    }

    /**
     * @param descricao_sexo the descricao_sexo to set
     */
    public void setDescricao_sexo(String descricao_sexo) {
        this.descricao_sexo = descricao_sexo;
    }

    /**
     * @return the rg_funcionario
     */
    public String getRg_funcionario() {
        return rg_funcionario;
    }

    /**
     * @param rg_funcionario the rg_funcionario to set
     */
    public void setRg_funcionario(String rg_funcionario) {
        this.rg_funcionario = rg_funcionario;
    }

    /**
     * @return the cpf_funcionario
     */
    public int getCpf_funcionario() {
        return cpf_funcionario;
    }

    /**
     * @param cpf_funcionario the cpf_funcionario to set
     */
    public void setCpf_funcionario(int cpf_funcionario) {
        this.cpf_funcionario = cpf_funcionario;
    }

    /**
     * @return the data_admissao
     */
    public Date getData_admissao() {
        return data_admissao;
    }

    /**
     * @param data_admissao the data_admissao to set
     */
    public void setData_admissao(Date data_admissao) {
        this.data_admissao = data_admissao;
    }

    /**
     * @return the data_demissao
     */
    public Date getData_demissao() {
        return data_demissao;
    }

    /**
     * @param data_demissao the data_demissao to set
     */
    public void setData_demissao(Date data_demissao) {
        this.data_demissao = data_demissao;
    }

    /**
     * @return the id_endereco
     */
    public int getId_endereco() {
        return id_endereco;
    }

    /**
     * @param id_endereco the id_endereco to set
     */
    public void setId_endereco(int id_endereco) {
        this.id_endereco = id_endereco;
    }

    /**
     * @return the id_contato
     */
    public int getId_contato() {
        return id_contato;
    }

    /**
     * @param id_contato the id_contato to set
     */
    public void setId_contato(int id_contato) {
        this.id_contato = id_contato;
    }

    /**
     * @return the id_especialidade
     */
    public int getId_especialidade() {
        return id_especialidade;
    }

    /**
     * @param id_especialidade the id_especialidade to set
     */
    public void setId_especialidade(int id_especialidade) {
        this.id_especialidade = id_especialidade;
    }
    
    
    
}
