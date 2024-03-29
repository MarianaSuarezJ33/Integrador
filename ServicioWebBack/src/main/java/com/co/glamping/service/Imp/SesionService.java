package com.co.glamping.service.Imp;

import com.co.glamping.model.Sesion;
import com.co.glamping.persistence.SesionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class SesionService {

    private final SesionRepository sesionRepository;

    public Sesion guardarSesion(Sesion sesion) {
        return sesionRepository.save(sesion);
    }

    public List<Sesion> obtenerTodasLasSesiones() {
        return sesionRepository.findAll();
    }

    public Optional<Sesion> buscarSesionPorId(Long id) {
        return sesionRepository.findById(id);
    }

    public void eliminarSesionPorId(Long id) {
        sesionRepository.deleteById(id);
    }

    public long contarSesiones() {
        return sesionRepository.count();
    }

    public boolean existeSesionPorId(Long id) {
        return sesionRepository.existsById(id);
    }

    public void eliminarTodasLasSesiones() {
        sesionRepository.deleteAll();
    }
}
