package org.gmarquezp.webapp.ear.ejb.services;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import org.gmarquezp.webapp.ear.ejb.entities.Usuario;
import org.gmarquezp.webapp.ear.ejb.repositories.UsuarioRepository;

import java.util.List;

@Stateless
public class UsuarioServiceImpl implements UsuarioService {

    @Inject
    private UsuarioRepository usuarioRepository;


    @Override
    public List<Usuario> listar() {
        return this.usuarioRepository.listar();
    }
}
