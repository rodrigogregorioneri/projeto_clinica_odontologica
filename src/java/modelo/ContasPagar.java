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
public class ContasPagar {
    private int id_cont_pagar;
    private int numero_documento;
    private Date data_emissao;
    private Date data_vencimento;
    private Date data_pagamento;
    private double valor_conta;
    private double valor_juros;
    private String descricao_status;
    private int id_dornecedor;

    public ContasPagar() {
    }

    /**
     * @return the id_cont_pagar
     */
    public int getId_cont_pagar() {
        return id_cont_pagar;
    }

    /**
     * @param id_cont_pagar the id_cont_pagar to set
     */
    public void setId_cont_pagar(int id_cont_pagar) {
        this.id_cont_pagar = id_cont_pagar;
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
     * @return the data_pagamento
     */
    public Date getData_pagamento() {
        return data_pagamento;
    }

    /**
     * @param data_pagamento the data_pagamento to set
     */
    public void setData_pagamento(Date data_pagamento) {
        this.data_pagamento = data_pagamento;
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
     * @return the id_dornecedor
     */
    public int getId_dornecedor() {
        return id_dornecedor;
    }

    /**
     * @param id_dornecedor the id_dornecedor to set
     */
    public void setId_dornecedor(int id_dornecedor) {
        this.id_dornecedor = id_dornecedor;
    }
    
    
    
    
}
