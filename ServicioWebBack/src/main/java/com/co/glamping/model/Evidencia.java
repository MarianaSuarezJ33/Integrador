package com.co.glamping.model;

public class Evidencia {
    private Long id;
    private Long idUsuario;
    private byte[] archivoEvidencia;
    private String comentariosDocente;
    private int calificacionDocente;

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

}
