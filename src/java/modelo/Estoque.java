/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author NERI-DESENVOLVEDOR
 */
public class Estoque {
    private int id_estoque;
    private int qtd_item;
    private int id_item;

    public Estoque() {
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
