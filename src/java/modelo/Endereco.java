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
public class Endereco {
    private int id_endereco;
    private String nome_logradouro;
    private int numero_residencia;
    private String nome_bairro;
    private int numero_cep;
    private String descricao_complemento;
    private String nome_cidade;
    private String nome_estado;
    private String nome_pais;

    public Endereco() {
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
     * @return the nome_logradouro
     */
    public String getNome_logradouro() {
        return nome_logradouro;
    }

    /**
     * @param nome_logradouro the nome_logradouro to set
     */
    public void setNome_logradouro(String nome_logradouro) {
        this.nome_logradouro = nome_logradouro;
    }

    /**
     * @return the numero_residencia
     */
    public int getNumero_residencia() {
        return numero_residencia;
    }

    /**
     * @param numero_residencia the numero_residencia to set
     */
    public void setNumero_residencia(int numero_residencia) {
        this.numero_residencia = numero_residencia;
    }

    /**
     * @return the nome_bairro
     */
    public String getNome_bairro() {
        return nome_bairro;
    }

    /**
     * @param nome_bairro the nome_bairro to set
     */
    public void setNome_bairro(String nome_bairro) {
        this.nome_bairro = nome_bairro;
    }

    /**
     * @return the numero_cep
     */
    public int getNumero_cep() {
        return numero_cep;
    }

    /**
     * @param numero_cep the numero_cep to set
     */
    public void setNumero_cep(int numero_cep) {
        this.numero_cep = numero_cep;
    }

    /**
     * @return the descricao_complemento
     */
    public String getDescricao_complemento() {
        return descricao_complemento;
    }

    /**
     * @param descricao_complemento the descricao_complemento to set
     */
    public void setDescricao_complemento(String descricao_complemento) {
        this.descricao_complemento = descricao_complemento;
    }

    /**
     * @return the nome_cidade
     */
    public String getNome_cidade() {
        return nome_cidade;
    }

    /**
     * @param nome_cidade the nome_cidade to set
     */
    public void setNome_cidade(String nome_cidade) {
        this.nome_cidade = nome_cidade;
    }

    /**
     * @return the nome_estado
     */
    public String getNome_estado() {
        return nome_estado;
    }

    /**
     * @param nome_estado the nome_estado to set
     */
    public void setNome_estado(String nome_estado) {
        this.nome_estado = nome_estado;
    }

    /**
     * @return the nome_pais
     */
    public String getNome_pais() {
        return nome_pais;
    }

    /**
     * @param nome_pais the nome_pais to set
     */
    public void setNome_pais(String nome_pais) {
        this.nome_pais = nome_pais;
    }
    
    
}
