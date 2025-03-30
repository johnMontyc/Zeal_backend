package com.zeal.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "SERVICIOS")
public class ServiciosModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_servicio;

    @Column(nullable = false, unique = true, length = 155)
    private String nombre_servicio;

    @Column(nullable = false, unique = true,length = 15)
    private String descripcion_servicio;

    @Column(nullable = false)
    private Boolean precio_servicio;

    @Column(nullable = false)
    private Boolean disponibilidad_servicio;
}
