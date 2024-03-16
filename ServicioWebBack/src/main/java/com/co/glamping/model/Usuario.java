package com.co.glamping.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String usuarioInstitucional;
    private String contraseña;
    private String tipoDocumento;
    private String numeroDocumento;
    private String correoElectronico;
    private String telefono;
    private String rol;
    private String cohorte;
    private String maestria;
    private String foto;
}