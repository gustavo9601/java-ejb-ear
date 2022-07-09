package org.gmarquezp.webapp.ear.ejb.repositories;

import org.gmarquezp.webapp.ear.ejb.entities.Usuario;

import javax.swing.*;
import java.util.List;

public interface UsuarioRepository {
    List<Usuario> listar();
}
