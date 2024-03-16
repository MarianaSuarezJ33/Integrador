package com.co.glamping.persistence;

import com.co.glamping.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findByUsuarioInstitucional(String usuarioInstitucional);

    List<Usuario> findAll();

    Optional<Usuario> findById(Long id);

    Usuario save(Usuario usuario);

    void deleteById(Long id);

    long count();

    boolean existsById(Long id);

    void deleteAll();

    void deleteAllInBatch(Iterable<Usuario> usuarios);

    Optional<Usuario> findByCorreoElectronico(String correoElectronico);
}
