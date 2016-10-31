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
public class EstoqueSaida {
    private int id_estoque_saida;
    private Date data_saida;
    private int qtd_saida;
    private int id_estoque;

    public EstoqueSaida() {
    }

    /**
     * @return the id_estoque_saida
     */
    public int getId_estoque_saida() {
        return id_estoque_saida;
    }

    /**
     * @param id_estoque_saida the id_estoque_saida to set
     */
    public void setId_estoque_saida(int id_estoque_saida) {
        this.id_estoque_saida = id_estoque_saida;
    }

    /**
     * @return the data_saida
     */
    public Date getData_saida() {
        return data_saida;
    }

    /**
     * @param data_saida the data_saida to set
     */
    public void setData_saida(Date data_saida) {
        this.data_saida = data_saida;
    }

    /**
     * @return the qtd_saida
     */
    public int getQtd_saida() {
        return qtd_saida;
    }

    /**
     * @param qtd_saida the qtd_saida to set
     */
    public void setQtd_saida(int qtd_saida) {
        this.qtd_saida = qtd_saida;
    }

    /**
     * @return the id_estoque
     */
    public int getId_estoque() {
        return id_estoque;
    }

    /**
     * @param id_estoque the id_estoque to set
     */
    public void setId_estoque(int id_estoque) {
        this.id_estoque = id_estoque;
    }
    
    
}
