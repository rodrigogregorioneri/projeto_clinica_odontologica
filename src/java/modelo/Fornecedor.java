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
public class Fornecedor {
    private int id_fornecedor;
    private String nome_razao_social;
    private int numero_cnpj;
    private int id_endereco;
    private int id_contato;

    public Fornecedor() {
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
     * @return the nome_razao_social
     */
    public String getNome_razao_social() {
        return nome_razao_social;
    }

    /**
     * @param nome_razao_social the nome_razao_social to set
     */
    public void setNome_razao_social(String nome_razao_social) {
        this.nome_razao_social = nome_razao_social;
    }

    /**
     * @return the numero_cnpj
     */
    public int getNumero_cnpj() {
        return numero_cnpj;
    }

    /**
     * @param numero_cnpj the numero_cnpj to set
     */
    public void setNumero_cnpj(int numero_cnpj) {
        this.numero_cnpj = numero_cnpj;
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
    
    
}
