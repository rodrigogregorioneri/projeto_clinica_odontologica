/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ws;

import com.google.gson.Gson;
import dao.ContatoDAO;
import dao.ConvenioDAO;
import dao.UsuarioDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Contato;
import modelo.Convenio;
import modelo.Usuario;


// TESTE

/**
 *
 * @author NERI-DESENVOLVEDOR
 */
public class Testes {
    public static void main(String[] args) {
        
        
        
    // USUARIO    
        
     /* 
       Usuario u = new Usuario();
       u.setNm_login(JOptionPane.showInputDialog(null, "Digite o login"));
       u.setNm_usuario(JOptionPane.showInputDialog(null, "Digite o usuario"));
       u.setSenha_usuario(JOptionPane.showInputDialog(null, "Digite a senha"));
       u.setId_nivel_acesso(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a permissão 1 ou 2")));
       UsuarioDAO dao = new UsuarioDAO();
       dao.inserir(u);   
       */

        /*
        Usuario u = new Usuario();
        u.setNm_login(JOptionPane.showInputDialog(null, "Digite o login"));
        UsuarioDAO dao = new UsuarioDAO();
        dao.excluir(u);
        */
  
     /*   
       List<Usuario> lista = new ArrayList<Usuario>();
       UsuarioDAO dao = new UsuarioDAO();
       lista = dao.listar(); 
       Gson g = new Gson();
       System.out.println(g.toJson(lista));
             */
                   
        /*
       Usuario u = new Usuario();
       u.setNm_login(JOptionPane.showInputDialog(null, "Digite o login"));
       u.setNm_usuario(JOptionPane.showInputDialog(null, "Digite o usuario"));
       u.setSenha_usuario(JOptionPane.showInputDialog(null, "Digite a senha"));
       u.setId_nivel_acesso(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a permissão 1 ou 2")));
       UsuarioDAO dao = new UsuarioDAO();
       dao.atualizar(u, JOptionPane.showInputDialog(null, "Digite o login"));
        */
      //USUARIO
        
        
        
        
        

     //CONVENIO
       
        /*
       Convenio u = new Convenio();
       u.setNm_convenio(JOptionPane.showInputDialog(null, "Digite o nome do Convenio"));
       u.setNm_plano(JOptionPane.showInputDialog(null, "Digite o nome do Plano"));
       ConvenioDAO dao = new ConvenioDAO();
       dao.inserir(u);
        */
        
        /*
        Convenio u = new Convenio();
        u.setNm_convenio(JOptionPane.showInputDialog(null, "Digite o Convenio"));
        ConvenioDAO dao = new ConvenioDAO();
        dao.excluir(u);
        */
        
        /*
        List<Convenio> lista = new ArrayList<Convenio>();
        ConvenioDAO dao = new ConvenioDAO();
        lista = dao.listar();
        Gson g = new Gson();
        System.out.println(g.toJson(lista));
        */
        
        /*
       Convenio u = new Convenio();
       u.setNm_convenio(JOptionPane.showInputDialog(null, "Digite o nome do convenio"));
       u.setNm_plano(JOptionPane.showInputDialog(null, "Digite o plano do convenio"));
       ConvenioDAO dao = new ConvenioDAO();
       dao.atualizar(u, JOptionPane.showInputDialog(null, "Digite o nome do convenio"));
       */
    //CONVENIO
        
        
        
        
        
  
        
    //CONTATO
        
       /*      
       Contato c = new Contato();
        
       c.setDdd(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ddd")));
       c.setCelular(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o celular")));
       c.setTelefone(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o telefone")));
       c.setEmail(JOptionPane.showInputDialog(null, "Digite o email"));
       ContatoDAO dao = new ContatoDAO();
       dao.inserir(c);
      */
 
        /*
        Contato c = new Contato();
        c.setId(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o id")));
        ContatoDAO dao = new ContatoDAO();
        dao.excluir(c);
        */
        
        /*
        List<Contato> lista = new ArrayList<Contato>();
        ContatoDAO dao = new ContatoDAO();
        lista = dao.listar();
        Gson g = new Gson();
        System.out.println(g.toJson(lista));
        */
        
        /*
       Contato c = new Contato();
       c.setDdd(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ddd a alterar")));
       c.setCelular(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o celular a alterar")));
       c.setTelefone(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o telefone a alterar")));
       c.setEmail(JOptionPane.showInputDialog(null, "Digite o email a alterar"));
       ContatoDAO dao = new ContatoDAO();
       dao.atualizar(c, Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o id do Contato")));
       */
        // CONTATO
        
        
    }
}
