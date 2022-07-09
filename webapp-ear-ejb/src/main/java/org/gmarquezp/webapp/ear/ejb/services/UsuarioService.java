package org.gmarquezp.webapp.ear.ejb.services;

import jakarta.ejb.Local;
import org.gmarquezp.webapp.ear.ejb.entities.Usuario;

import java.util.List;

@Local
public interface UsuarioService {
    List<Usuario> listar();
}
