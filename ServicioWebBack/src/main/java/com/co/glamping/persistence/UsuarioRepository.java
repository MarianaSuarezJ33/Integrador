package com.co.glamping.persistence;

import com.co.glamping.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // Otros métodos básicos del CRUD
    List<Usuario> findAll();

    Optional<Usuario> findById(Long id);

    void deleteById(Long id);

    long count();

    boolean existsById(Long id);

    void deleteAll();

    void deleteAllInBatch(Iterable<Usuario> usuarios);

    Optional<Usuario> findByCorreoElectronico(String correoElectronico);

    <S extends Usuario> S save(S usuario);

}