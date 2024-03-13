// UsuarioService.java
package com.co.glamping.service;

import com.co.glamping.model.Usuario;

public interface UsuarioService {
    Usuario save(Usuario usuario);

    Usuario findById(Long id);

    void deleteById(Long id);
    // Otros métodos para el CRUD de Usuario
}
