/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Convenio;
import modelo.Usuario;

/**
 *
 * @author NERI-DESENVOLVEDOR
 */
public class ConvenioDAO {
    
    
    
    
    
     private Connection con = Conexao.getConnection(); // Instancia a conexão
    
    /** 
     * Metodo Construtor
     */
    public ConvenioDAO()
    {
    }
    
    
    /**
     * Inseri Usuario no banco
     * @param usuario
     * @return retorno
     */
    public boolean inserir(Convenio convenio)
    {
        String sql = "INSERT INTO tb_convenio(nm_convenio,nm_plano) VALUES(?,?)";
        Boolean retorno = false;
        
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, convenio.getNm_convenio());
            pst.setString(2, convenio.getNm_plano());
        
            if(pst.executeUpdate()>0)
            {
                retorno = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }
        return retorno;
    }
    
    
    
    /**
     * Atualiza Usuario no banco
     * @param usuario
     * @return 
     */
    public boolean atualizar(Convenio convenio, String nomeConvenio)
    {
        String sql = "UPDATE tb_convenio set nm_convenio=?,nm_plano=? where nm_convenio=?";
        Boolean retorno = false;
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, convenio.getNm_convenio());
            pst.setString(2, convenio.getNm_plano());
            pst.setString(3, nomeConvenio);
            if(pst.executeUpdate()>0)
            {
                retorno = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }
        return retorno;
    }
    
    
    
    /**
     * Exclui Usuario no Banco
     * @param usuario
     * @return 
     */
    public boolean excluir(Convenio convenio)
    {
        String sql = "DELETE FROM tb_convenio where nm_convenio=?";
        Boolean retorno = false;
        
        try {
          
           PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, convenio.getNm_convenio());
            if(pst.executeUpdate()>0)
            {
                retorno = true;
            }
                
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }
        return retorno;
    }
    
    
    /**
     * Lista todos os Usuarios do Banco
     * @return 
     */
    public List<Convenio> listar()
    {
         String sql = "SELECT * FROM tb_convenio";
        List<Convenio> retorno = new ArrayList<Convenio>(); 
       
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet res = pst.executeQuery();
            while(res.next())
            {
                Convenio item = new Convenio();
                item.setNm_convenio(res.getString("nm_convenio"));
                item.setNm_plano(res.getString("nm_plano")); 
                retorno.add(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    
    
    }
    
    
    /**
     * Busca Usuario no Banco
     * @param usuario
     * @return 
     */
    public Convenio buscar(Convenio convenio)
    {
         String sql = "SELECT * FROM tb_convenio where nm_convenio=?";
        Convenio retorno = null;
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, convenio.getNm_convenio());
            ResultSet res = pst.executeQuery();
            
            if(res.next())
            {
                retorno = new Convenio();
                retorno.setNm_convenio(res.getString("nm_convenio"));
                retorno.setNm_plano(res.getString("nm_plano")); 
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    
    
    }
    
    
    
}
