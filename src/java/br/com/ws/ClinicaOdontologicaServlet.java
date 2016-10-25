package br.com.ws;

import com.google.gson.Gson;
import dao.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Usuario;

@WebServlet(name = "ClinicaOdontologicaServlet", urlPatterns = {"/ClinicaOdontologicaServlet"})
public class ClinicaOdontologicaServlet extends HttpServlet {

        private static final long serialVersionUID = 1L;

    /**
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        List<Usuario> lista = new ArrayList<Usuario>();
        
        
        UsuarioDAO dao = new UsuarioDAO();
        lista = dao.listar();

       // System.out.println(lista);
        // Converter para Json
        Gson g = new Gson();

        resp.getWriter().write(g.toJson(lista));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
    }
}
