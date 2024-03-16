package com.co.glamping.service;

import com.co.glamping.model.Grupo;
import com.co.glamping.persistence.GrupoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GrupoService {

    private final GrupoRepository grupoRepository;

    @Autowired
    public GrupoService(GrupoRepository grupoRepository) {
        this.grupoRepository = grupoRepository;
    }

    public void save(Grupo grupo) {
        grupoRepository.save(grupo);
    }

    public List<Grupo> findAll() {
        return grupoRepository.findAll();
    }

    public Optional<Grupo> findById(Long id) {
        return grupoRepository.findById(id);
    }

    public void deleteById(Long id) {
        grupoRepository.deleteById(id);
    }

    public long count() {
        return grupoRepository.count();
    }

    public boolean existsById(Long id) {
        return grupoRepository.existsById(id);
    }

    public void deleteAll() {
        grupoRepository.deleteAll();
    }
}
