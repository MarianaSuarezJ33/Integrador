package com.co.glamping.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Grupo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idUsuario;
    private Long idEvidencia;
    private String descripcion;
}