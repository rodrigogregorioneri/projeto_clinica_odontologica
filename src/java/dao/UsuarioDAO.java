package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Usuario;

/**
 *
 * @author Rodrigo Gregorio Neri
 */
public class UsuarioDAO {

    private Connection con = Conexao.getConnection(); // Instancia a conexão
    
    /** 
     * Metodo Construtor
     */
    public UsuarioDAO()
    {
    }
    
    
    /**
     * Inseri Usuario no banco
     * @param usuario
     * @return retorno
     */
    public boolean inserir(Usuario usuario)
    {
        String sql = "INSERT INTO tb_usuario(nm_usuario,nm_login,senha_usuario,id_nivel_acesso) VALUES(?,?,?,?)";
        Boolean retorno = false;
        
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, usuario.getNm_usuario());
            pst.setString(2, usuario.getNm_login());
            pst.setString(3, usuario.getSenha_usuario());
            pst.setInt(4, usuario.getId_nivel_acesso()); // Esse valor já vem do banco
            
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
    public boolean atualizar(Usuario usuario, String login)
    {
        String sql = "UPDATE tb_usuario set nm_usuario=?,nm_login=?,senha_usuario=?, id_nivel_acesso=? where nm_login=?";
        Boolean retorno = false;
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, usuario.getNm_usuario());
            pst.setString(2, usuario.getNm_login());
            pst.setString(3, usuario.getSenha_usuario());
            pst.setInt(4, usuario.getId_nivel_acesso());
            pst.setString(5, login);
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
    public boolean excluir(Usuario usuario)
    {
        String sql = "DELETE FROM tb_usuario where nm_login=?";
        Boolean retorno = false;
        
        try {
          
           PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, usuario.getNm_login());
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
    public List<Usuario> listar()
    {
         String sql = "SELECT * FROM tb_usuario";
        List<Usuario> retorno = new ArrayList<Usuario>(); 
       
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet res = pst.executeQuery();
            while(res.next())
            {
                Usuario item = new Usuario();
                item.setNm_usuario(res.getString("nm_usuario"));
                item.setNm_login(res.getString("nm_login"));
                item.setSenha_usuario(res.getString("senha_usuario"));
                item.setId_nivel_acesso(res.getInt("id_nivel_acesso"));  
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
    public Usuario buscar(Usuario usuario)
    {
         String sql = "SELECT * FROM tb_usuario where nm_login=?";
        Usuario retorno = null;
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, usuario.getNm_login());
            ResultSet res = pst.executeQuery();
            
            if(res.next())
            {
                retorno = new Usuario();
                retorno.setNm_usuario(res.getString("nm_usuario"));
                retorno.setNm_login(res.getString("nm_login"));
                retorno.setSenha_usuario(res.getString("senha_usuario"));
                retorno.setId_nivel_acesso(res.getInt("id_nivel_acesso"));  
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }


}
