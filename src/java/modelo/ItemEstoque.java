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
public class ItemEstoque {
    private int id_item;
    private String nome_item;
    private String descricao_item;
    private Date data_validade;

    public ItemEstoque() {
    }

    /**
     * @return the id_item
     */
    public int getId_item() {
        return id_item;
    }

    /**
     * @param id_item the id_item to set
     */
    public void setId_item(int id_item) {
        this.id_item = id_item;
    }

    /**
     * @return the nome_item
     */
    public String getNome_item() {
        return nome_item;
    }

    /**
     * @param nome_item the nome_item to set
     */
    public void setNome_item(String nome_item) {
        this.nome_item = nome_item;
    }

    /**
     * @return the descricao_item
     */
    public String getDescricao_item() {
        return descricao_item;
    }

    /**
     * @param descricao_item the descricao_item to set
     */
    public void setDescricao_item(String descricao_item) {
        this.descricao_item = descricao_item;
    }

    /**
     * @return the data_validade
     */
    public Date getData_validade() {
        return data_validade;
    }

    /**
     * @param data_validade the data_validade to set
     */
    public void setData_validade(Date data_validade) {
        this.data_validade = data_validade;
    }
    
    
}
