package com.co.glamping.persistence;

import com.co.glamping.model.Evidencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface EvidenciaRepository extends JpaRepository<Evidencia, Long> {

    List<Evidencia> findAll();

    Optional<Evidencia> findById(Long id);

    Evidencia save(Evidencia evidencia);

    void deleteById(Long id);

    long count();

    boolean existsById(Long id);

    void deleteAll();

    void deleteAllInBatch(Iterable<Evidencia> evidencias);

}
