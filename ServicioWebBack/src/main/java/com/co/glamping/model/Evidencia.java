package com.co.glamping.model;

import jakarta.persistence.*;

@Entity
@Table(name = "evidencias")

public class Evidencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id_usuario")
    private Long idUsuario;

    @Lob
    @Column(name = "archivo_evidencia")
    private byte[] archivoEvidencia;

    @Column(name = "comentarios_docente")
    private String comentariosDocente;

    @Column(name = "calificacion_docente")
    private int calificacionDocente;

    // Constructor sin argumentos requerido por JPA
    public Evidencia() {
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public byte[] getArchivoEvidencia() {
        return archivoEvidencia;
    }

    public void setArchivoEvidencia(byte[] archivoEvidencia) {
        this.archivoEvidencia = archivoEvidencia;
    }

    public String getComentariosDocente() {
        return comentariosDocente;
    }

    public void setComentariosDocente(String comentariosDocente) {
        this.comentariosDocente = comentariosDocente;
    }

    public int getCalificacionDocente() {
        return calificacionDocente;
    }

    public void setCalificacionDocente(int calificacionDocente) {
        this.calificacionDocente = calificacionDocente;
    }

    public void setNombre(String originalFilename) {
    }

    public void setContenido(byte[] bytes) {
    }
}
