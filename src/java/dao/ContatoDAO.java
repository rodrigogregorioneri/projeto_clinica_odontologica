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
import modelo.Contato;
import modelo.Convenio;

/**
 *
 * @author NERI-DESENVOLVEDOR
 */
public class ContatoDAO {
    
    
    
    
    
         private Connection con = Conexao.getConnection(); // Instancia a conexão
    
    /** 
     * Metodo Construtor
     */
    public ContatoDAO()
    {
    }
    
    
    /**
     * Inseri Usuario no banco
     * @param usuario
     * @return retorno
     */
    public boolean inserir(Contato contato)
    {
        String sql = "INSERT INTO tb_contato(nr_ddd,nr_cel,nr_tel,nm_email) VALUES(?,?,?,?)";
        Boolean retorno = false;
        
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, contato.getDdd());
            pst.setInt(2, contato.getCelular());
            pst.setInt(3, contato.getTelefone());
            pst.setString(4, contato.getEmail());
        
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
    public boolean atualizar(Contato contato, int idContato)
    {
        String sql = "UPDATE tb_contato set nr_ddd=?,nr_cel=?,nr_tel=?,nm_email=? where id_contato=?";
        Boolean retorno = false;
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, contato.getDdd());
            pst.setInt(2, contato.getCelular());
            pst.setInt(3, contato.getTelefone());
            pst.setString(4, contato.getEmail());
            pst.setInt(5, idContato);
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
    public boolean excluir(Contato contato)
    {
        String sql = "DELETE FROM tb_contato where id_contato=?";
        Boolean retorno = false;
        
        try {
          
           PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, contato.getId());
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
    public List<Contato> listar()
    {
         String sql = "SELECT * FROM tb_contato";
        List<Contato> retorno = new ArrayList<Contato>(); 
       
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet res = pst.executeQuery();
            while(res.next())
            {
                Contato item = new Contato();
                item.setId(res.getInt("id_contato"));
                item.setDdd(res.getInt("nr_ddd")); 
                item.setCelular(res.getInt("nr_cel"));
                item.setTelefone(res.getInt("nr_tel")); 
                item.setEmail(res.getString("nm_email")); 
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
    public Contato buscar(Convenio convenio)
    {
         String sql = "SELECT * FROM tb_contato where nr_cel=?";
        Contato retorno = null;
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, convenio.getNm_convenio());
            ResultSet res = pst.executeQuery();
            
            if(res.next())
            {
                retorno = new Contato();
                retorno.setId(res.getInt("id_contato"));
                retorno.setDdd(res.getInt("nr_ddd")); 
                retorno.setCelular(res.getInt("nr_cel"));
                retorno.setTelefone(res.getInt("nr_tel")); 
                retorno.setEmail(res.getString("nm_convenio"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    
    
    }
    
    
    
    
    
    
    
}
