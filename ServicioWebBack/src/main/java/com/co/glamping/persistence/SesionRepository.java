package com.co.glamping.persistence;

import com.co.glamping.model.Sesion;

import java.util.List;
import java.util.Optional;

public class SesionRepository {
    public Sesion save(Sesion sesion) {
        // Lógica para guardar la sesión
        return null;
    }

    public List<Sesion> findAll() {
        // Lógica para encontrar todas las sesiones
        return null;
    }

    public Optional<Sesion> findById(Long id) {
        // Lógica para encontrar una sesión por su ID
        return Optional.empty();
    }

    public void deleteById(Long id) {
        // Lógica para eliminar una sesión por su ID
    }

    public long count() {
        // Lógica para contar todas las sesiones
        return 0;
    }

    public boolean existsById(Long id) {
        // Lógica para verificar si existe una sesión por su ID
        return false;
    }

    public void deleteAll() {
        // Lógica para eliminar todas las sesiones
    }
}
