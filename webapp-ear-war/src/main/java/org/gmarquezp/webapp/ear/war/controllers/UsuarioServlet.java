package org.gmarquezp.webapp.ear.war.controllers;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.gmarquezp.webapp.ear.ejb.entities.Usuario;
import org.gmarquezp.webapp.ear.ejb.services.UsuarioService;

import java.io.IOException;
import java.util.List;

@WebServlet({"/usuarios", "/"})
public class UsuarioServlet extends HttpServlet {

    @Inject
    private UsuarioService usuarioService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Usuario> usuarios = this.usuarioService.listar();

        req.setAttribute("usuarios", usuarios);

        getServletContext().getRequestDispatcher("/listar.jsp").forward(req, resp);

    }
}
