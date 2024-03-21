package com.co.glamping.model;

import java.util.Date;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data

public class Sesion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fecha;
    private String hora;
    private String tema;
    private String ubicacion;
}

