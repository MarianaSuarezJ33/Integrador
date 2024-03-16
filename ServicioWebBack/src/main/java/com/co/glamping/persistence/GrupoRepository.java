package com.co.glamping.persistence;

import com.co.glamping.model.Grupo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GrupoRepository extends JpaRepository<Grupo, Long> {

    List<Grupo> findAll();

    Optional<Grupo> findById(Long id);

    void deleteById(Long id);

    long count();

    boolean existsById(Long id);

    void deleteAll();
}
