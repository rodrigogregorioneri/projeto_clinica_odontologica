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
public class ContasReceber {
    private int id_conta_receber;
    private int numero_documento;
    private Date data_emissao;
    private Date data_vencimento;
    private Date data_recebimento;
    private double valor_conta;
    private double valor_juros;
    private String descricao_status;
    private int id_paciente;

    public ContasReceber() {
    }

    /**
     * @return the id_conta_receber
     */
    public int getId_conta_receber() {
        return id_conta_receber;
    }

    /**
     * @param id_conta_receber the id_conta_receber to set
     */
    public void setId_conta_receber(int id_conta_receber) {
        this.id_conta_receber = id_conta_receber;
    }

    /**
     * @return the numero_documento
     */
    public int getNumero_documento() {
        return numero_documento;
    }

    /**
     * @param numero_documento the numero_documento to set
     */
    public void setNumero_documento(int numero_documento) {
        this.numero_documento = numero_documento;
    }

    /**
     * @return the data_emissao
     */
    public Date getData_emissao() {
        return data_emissao;
    }

    /**
     * @param data_emissao the data_emissao to set
     */
    public void setData_emissao(Date data_emissao) {
        this.data_emissao = data_emissao;
    }

    /**
     * @return the data_vencimento
     */
    public Date getData_vencimento() {
        return data_vencimento;
    }

    /**
     * @param data_vencimento the data_vencimento to set
     */
    public void setData_vencimento(Date data_vencimento) {
        this.data_vencimento = data_vencimento;
    }

    /**
     * @return the data_recebimento
     */
    public Date getData_recebimento() {
        return data_recebimento;
    }

    /**
     * @param data_recebimento the data_recebimento to set
     */
    public void setData_recebimento(Date data_recebimento) {
        this.data_recebimento = data_recebimento;
    }

    /**
     * @return the valor_conta
     */
    public double getValor_conta() {
        return valor_conta;
    }

    /**
     * @param valor_conta the valor_conta to set
     */
    public void setValor_conta(double valor_conta) {
        this.valor_conta = valor_conta;
    }

    /**
     * @return the valor_juros
     */
    public double getValor_juros() {
        return valor_juros;
    }

    /**
     * @param valor_juros the valor_juros to set
     */
    public void setValor_juros(double valor_juros) {
        this.valor_juros = valor_juros;
    }

    /**
     * @return the descricao_status
     */
    public String getDescricao_status() {
        return descricao_status;
    }

    /**
     * @param descricao_status the descricao_status to set
     */
    public void setDescricao_status(String descricao_status) {
        this.descricao_status = descricao_status;
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
    
    
    
    
}
