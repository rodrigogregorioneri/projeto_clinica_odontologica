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
public class NivelAcesso {
    private int id_nivel_acesso;
    private String descricao_acesso;

    public NivelAcesso() {
    }

    /**
     * @return the id_nivel_acesso
     */
    public int getId_nivel_acesso() {
        return id_nivel_acesso;
    }

    /**
     * @param id_nivel_acesso the id_nivel_acesso to set
     */
    public void setId_nivel_acesso(int id_nivel_acesso) {
        this.id_nivel_acesso = id_nivel_acesso;
    }

    /**
     * @return the descricao_acesso
     */
    public String getDescricao_acesso() {
        return descricao_acesso;
    }

    /**
     * @param descricao_acesso the descricao_acesso to set
     */
    public void setDescricao_acesso(String descricao_acesso) {
        this.descricao_acesso = descricao_acesso;
    }
    
    
}
