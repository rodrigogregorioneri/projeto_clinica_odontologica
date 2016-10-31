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
public class Pedido {
    private int id_pedido;
    private int numero_pedido;
    private Date data_pedido;
    private int qtd_item;
    private double valor_unitario_item;
    private double valor_pedido;
    private int id_fornecedor;
    private int id_item;

    public Pedido() {
    }

    /**
     * @return the id_pedido
     */
    public int getId_pedido() {
        return id_pedido;
    }

    /**
     * @param id_pedido the id_pedido to set
     */
    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    /**
     * @return the numero_pedido
     */
    public int getNumero_pedido() {
        return numero_pedido;
    }

    /**
     * @param numero_pedido the numero_pedido to set
     */
    public void setNumero_pedido(int numero_pedido) {
        this.numero_pedido = numero_pedido;
    }

    /**
     * @return the data_pedido
     */
    public Date getData_pedido() {
        return data_pedido;
    }

    /**
     * @param data_pedido the data_pedido to set
     */
    public void setData_pedido(Date data_pedido) {
        this.data_pedido = data_pedido;
    }

    /**
     * @return the qtd_item
     */
    public int getQtd_item() {
        return qtd_item;
    }

    /**
     * @param qtd_item the qtd_item to set
     */
    public void setQtd_item(int qtd_item) {
        this.qtd_item = qtd_item;
    }

    /**
     * @return the valor_unitario_item
     */
    public double getValor_unitario_item() {
        return valor_unitario_item;
    }

    /**
     * @param valor_unitario_item the valor_unitario_item to set
     */
    public void setValor_unitario_item(double valor_unitario_item) {
        this.valor_unitario_item = valor_unitario_item;
    }

    /**
     * @return the valor_pedido
     */
    public double getValor_pedido() {
        return valor_pedido;
    }

    /**
     * @param valor_pedido the valor_pedido to set
     */
    public void setValor_pedido(double valor_pedido) {
        this.valor_pedido = valor_pedido;
    }

    /**
     * @return the id_fornecedor
     */
    public int getId_fornecedor() {
        return id_fornecedor;
    }

    /**
     * @param id_fornecedor the id_fornecedor to set
     */
    public void setId_fornecedor(int id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
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
    
    
}
