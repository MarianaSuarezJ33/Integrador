package com.co.glamping.service.Imp;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.co.glamping.model.Usuario;
import com.co.glamping.persistence.UsuarioRepository;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Service
@RequiredArgsConstructor
public class ArchivoCSVService {


    private final  UsuarioRepository usuarioRepository;

    public void cargarArchivoCSV(MultipartFile archivoCSV) throws IOException {
        if (archivoCSV == null || archivoCSV.isEmpty()) {
            throw new IllegalArgumentException("El archivo CSV es nulo o está vacío");
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(archivoCSV.getInputStream()))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(",");
                if (campos.length == 12) {
                    Usuario usuario = new Usuario();
                    usuario.setNombre(campos[0]);
                    usuario.setUsuarioInstitucional(campos[1]);
                    usuario.setContraseña(campos[2]);
                    usuario.setTipoDocumento(campos[3]);
                    usuario.setNumeroDocumento(campos[4]);
                    usuario.setCorreoElectronico(campos[5]);
                    usuario.setTelefono(campos[6]);
                    usuario.setRol(campos[7]);
                    usuario.setCohorte(campos[8]);
                    usuario.setMaestria(campos[9]);
                    usuario.setFoto(campos[10]);
                    usuarioRepository.save(usuario);
                }
            }
        }
    }
}

