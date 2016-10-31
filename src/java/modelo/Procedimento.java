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
public class Procedimento {
    private int id_procedimento;
    private String descricao_procedimento;

    public Procedimento() {
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

    /**
     * @return the descricao_procedimento
     */
    public String getDescricao_procedimento() {
        return descricao_procedimento;
    }

    /**
     * @param descricao_procedimento the descricao_procedimento to set
     */
    public void setDescricao_procedimento(String descricao_procedimento) {
        this.descricao_procedimento = descricao_procedimento;
    }
    
    
}
