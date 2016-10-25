/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ws;

import com.google.gson.Gson;
import dao.UsuarioDAO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import modelo.Usuario;

/**
 * REST Web Service
 *
 * @author NERI-DESENVOLVEDOR
 */
@Path("generic")
public class ClinicaOdontologicaWS {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ClinicaOdontologicaWS
     */
    public ClinicaOdontologicaWS() {
    }

    /**
     * Retrieves representation of an instance of br.com.ws.ClinicaOdontologicaWS
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
          return "Web Service";
    }
    
    
    @GET
    @Produces("application/json")
    @Path("Usuario/get/{login}")
    public String getUsuario(@PathParam("login") String login){
        
        
        Usuario u = new Usuario(); // Cria Usuario
        u.setNm_login(login); // Envia o Login para o objeto
        
        UsuarioDAO dao = new UsuarioDAO(); // Instancia Usuario DAO
        u = dao.buscar(u); // Faz a busca do usuario no Banco
        
// Converter para Json
        Gson g = new Gson(); 
        return g.toJson(u); // retorn o Json do Usuario
        
    }
    
    
    @GET
    @Produces("application/json")
    @Path("Usuario/list")
    public String listaUsuario(){
        
        List<Usuario> lista = new ArrayList<Usuario>();
        
        
        UsuarioDAO dao = new UsuarioDAO();
        lista = dao.listar();

        System.out.println(lista);
        // Converter para Json
        Gson g = new Gson();
        return g.toJson(lista);
    }
    
    /*
    
    @POST
    @Consumes({"application/json"})
    @Path("Usuario/inserir/")
    public void inserir(String content){
        Gson g = new Gson();
        Usuario u = (Usuario) g.fromJson(content, Usuario.class);
        UsuarioDAO dao = new UsuarioDAO();
        dao.inserir(u);
    }
    */
    
    /*
        @POST
    @Consumes({"application/json"})
    @Path("Usuario/inserir/{usuario}/{login}/{senha}/{acesso}")
    public void inserir(@FormParam("usuario") String usuario, @FormParam("login") String login, @FormParam("senha") String senha, @FormParam("acesso") int acesso )  throws IOException{
       
      //  Usuario u = (Usuario) g.fromJson(content, Usuario.class);
        
        Usuario u = new Usuario();
        u.setNm_usuario(usuario);
        u.setNm_login(login);
        u.setSenha_usuario(usuario);
        u.setId_nivel_acesso(acesso);
         Gson g = new Gson();

        UsuarioDAO dao = new UsuarioDAO();
        dao.inserir(u);
    }
*/    

    /**
     * PUT method for updating or creating an instance of ClinicaOdontologicaWS
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    
    
    
    /*
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
*/
    
    
}
