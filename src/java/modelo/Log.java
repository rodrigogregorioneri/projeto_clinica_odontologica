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
public class Log {
    private int id_log;
    private Date data_sistema;
    private Date hora_sistema;
    private Date saida_do_sistema;
    private String descricao_operacao;
    private int id_usuario;

    public Log() {
    }

    /**
     * @return the id_log
     */
    public int getId_log() {
        return id_log;
    }

    /**
     * @param id_log the id_log to set
     */
    public void setId_log(int id_log) {
        this.id_log = id_log;
    }

    /**
     * @return the data_sistema
     */
    public Date getData_sistema() {
        return data_sistema;
    }

    /**
     * @param data_sistema the data_sistema to set
     */
    public void setData_sistema(Date data_sistema) {
        this.data_sistema = data_sistema;
    }

    /**
     * @return the hora_sistema
     */
    public Date getHora_sistema() {
        return hora_sistema;
    }

    /**
     * @param hora_sistema the hora_sistema to set
     */
    public void setHora_sistema(Date hora_sistema) {
        this.hora_sistema = hora_sistema;
    }

    /**
     * @return the saida_do_sistema
     */
    public Date getSaida_do_sistema() {
        return saida_do_sistema;
    }

    /**
     * @param saida_do_sistema the saida_do_sistema to set
     */
    public void setSaida_do_sistema(Date saida_do_sistema) {
        this.saida_do_sistema = saida_do_sistema;
    }

    /**
     * @return the descricao_operacao
     */
    public String getDescricao_operacao() {
        return descricao_operacao;
    }

    /**
     * @param descricao_operacao the descricao_operacao to set
     */
    public void setDescricao_operacao(String descricao_operacao) {
        this.descricao_operacao = descricao_operacao;
    }

    /**
     * @return the id_usuario
     */
    public int getId_usuario() {
        return id_usuario;
    }

    /**
     * @param id_usuario the id_usuario to set
     */
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    
    
    
}
