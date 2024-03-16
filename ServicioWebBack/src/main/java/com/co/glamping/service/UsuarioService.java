package com.co.glamping.service;

import com.co.glamping.model.Usuario;

import java.util.List;

public interface UsuarioService {
    Usuario save(Usuario usuario);

    Usuario findById(Long id);

    void deleteById(Long id);

    List<Usuario> findAll();

    long count();

    boolean existsById(Long id);

    void deleteAll();
}
