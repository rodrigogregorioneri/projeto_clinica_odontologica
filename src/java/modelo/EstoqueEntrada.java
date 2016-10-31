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
public class EstoqueEntrada {
    private int id_estoque_entrada;
    private Date data_entrada;
    private int qtd_ebtrada;
    private int id_estoque;

    public EstoqueEntrada() {
    }

    /**
     * @return the id_estoque_entrada
     */
    public int getId_estoque_entrada() {
        return id_estoque_entrada;
    }

    /**
     * @param id_estoque_entrada the id_estoque_entrada to set
     */
    public void setId_estoque_entrada(int id_estoque_entrada) {
        this.id_estoque_entrada = id_estoque_entrada;
    }

    /**
     * @return the data_entrada
     */
    public Date getData_entrada() {
        return data_entrada;
    }

    /**
     * @param data_entrada the data_entrada to set
     */
    public void setData_entrada(Date data_entrada) {
        this.data_entrada = data_entrada;
    }

    /**
     * @return the qtd_ebtrada
     */
    public int getQtd_ebtrada() {
        return qtd_ebtrada;
    }

    /**
     * @param qtd_ebtrada the qtd_ebtrada to set
     */
    public void setQtd_ebtrada(int qtd_ebtrada) {
        this.qtd_ebtrada = qtd_ebtrada;
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
