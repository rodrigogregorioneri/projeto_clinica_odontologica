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
public class Especialidade {
    private int id_especialidade;
    private String nome_especialidade;
    private int id_procedimento;

    public Especialidade() {
    }

    /**
     * @return the id_especialidade
     */
    public int getId_especialidade() {
        return id_especialidade;
    }

    /**
     * @param id_especialidade the id_especialidade to set
     */
    public void setId_especialidade(int id_especialidade) {
        this.id_especialidade = id_especialidade;
    }

    /**
     * @return the nome_especialidade
     */
    public String getNome_especialidade() {
        return nome_especialidade;
    }

    /**
     * @param nome_especialidade the nome_especialidade to set
     */
    public void setNome_especialidade(String nome_especialidade) {
        this.nome_especialidade = nome_especialidade;
    }

    /**
     * @return the id_procedimento
     */
    public int getId_procedimento() {
        return id_procedimento;
    }

    /**
     * @param id_procedimento the id_procedimento to set
     */
    public void setId_procedimento(int id_procedimento) {
        this.id_procedimento = id_procedimento;
    }
    
    
}
