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
public class Consulta {
    private int id_consulta;
    private Date data_consulta;
    private String nome_acompanhante;
    private String rg_acompanhante;
    private String descricao_consulta;
    private int id_paciente;
    private int id_funcionario;
    private int id_procedimento;

    public Consulta() {
    }

    /**
     * @return the id_consulta
     */
    public int getId_consulta() {
        return id_consulta;
    }

    /**
     * @param id_consulta the id_consulta to set
     */
    public void setId_consulta(int id_consulta) {
        this.id_consulta = id_consulta;
    }

    /**
     * @return the data_consulta
     */
    public Date getData_consulta() {
        return data_consulta;
    }

    /**
     * @param data_consulta the data_consulta to set
     */
    public void setData_consulta(Date data_consulta) {
        this.data_consulta = data_consulta;
    }

    /**
     * @return the nome_acompanhante
     */
    public String getNome_acompanhante() {
        return nome_acompanhante;
    }

    /**
     * @param nome_acompanhante the nome_acompanhante to set
     */
    public void setNome_acompanhante(String nome_acompanhante) {
        this.nome_acompanhante = nome_acompanhante;
    }

    /**
     * @return the rg_acompanhante
     */
    public String getRg_acompanhante() {
        return rg_acompanhante;
    }

    /**
     * @param rg_acompanhante the rg_acompanhante to set
     */
    public void setRg_acompanhante(String rg_acompanhante) {
        this.rg_acompanhante = rg_acompanhante;
    }

    /**
     * @return the descricao_consulta
     */
    public String getDescricao_consulta() {
        return descricao_consulta;
    }

    /**
     * @param descricao_consulta the descricao_consulta to set
     */
    public void setDescricao_consulta(String descricao_consulta) {
        this.descricao_consulta = descricao_consulta;
    }

    /**
     * @return the id_paciente
     */
    public int getId_paciente() {
        return id_paciente;
    }

    /**
     * @param id_paciente the id_paciente to set
     */
    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
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
     * @return the id_procedimento
     */
    public int getId_procedimento() {
        return id_procedimento;
    }

    /**
     * @param id_procedimento the id_procedimento to set
     */
    public void setId_procedimento(int id_procedimento) {
        this.id_procedimento = id_procedimento;
    }
    
    
    
}
