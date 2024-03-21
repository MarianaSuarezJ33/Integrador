package com.co.glamping.service.Imp;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import com.co.glamping.model.Evidencia;
import com.co.glamping.persistence.EvidenciaRepository;

@Service
@RequiredArgsConstructor
public class EvidenciaService {

    private EvidenciaRepository evidenciaRepository;

    public List<Evidencia> obtenerTodasLasEvidencias() {
        return evidenciaRepository.findAll();
    }

    public Optional<Evidencia> obtenerEvidenciaPorId(Long id) {
        return evidenciaRepository.findById(id);
    }

    public Evidencia guardarEvidencia(Evidencia evidencia) {
        return evidenciaRepository.save(evidencia);
    }

    public void eliminarEvidenciaPorId(Long id) {
        evidenciaRepository.deleteById(id);
    }

    public void subirEvidencia(MultipartFile archivo, Long idUsuario) throws IOException {
        if (archivo == null || archivo.isEmpty()) {
            throw new IllegalArgumentException("El archivo de evidencia es nulo o está vacío");
        }

        Evidencia evidencia = new Evidencia();
        evidencia.setNombre(archivo.getOriginalFilename());
        evidencia.setContenido(archivo.getBytes());
        evidencia.setIdUsuario(idUsuario);
        evidenciaRepository.save(evidencia);
    }
}

