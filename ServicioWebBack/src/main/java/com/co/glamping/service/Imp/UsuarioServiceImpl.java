package com.co.glamping.service.Imp;

import com.co.glamping.model.Usuario;
import com.co.glamping.persistence.UsuarioRepository;
import com.co.glamping.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {


    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario findById(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public long count() {
        return usuarioRepository.count();
    }

    @Override
    public boolean existsById(Long id) {
        return usuarioRepository.existsById(id);
    }

    @Override
    public void deleteAll() {
        usuarioRepository.deleteAll();
    }


    public void deleteAllInBatch(Iterable<Usuario> usuarios) {
        usuarioRepository.deleteAllInBatch(usuarios);
    }

        public Usuario findByUsuarioInstitucional(String usuarioInstitucional) {
            return usuarioRepository.findByUsuarioInstitucional(usuarioInstitucional);
        }

    public Optional<Usuario> findByCorreoElectronico(String correoElectronico) {
        return usuarioRepository.findByCorreoElectronico(correoElectronico);
    }
}
