package com.zeal.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "TIPO_USUARIOS")
public class TipoUsuariosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_tipo_usuario;

    @Column(nullable = false, unique = true, length = 50)
    private String nombre_tipo_usuario;

    @Column(nullable = false, length = 255)
    private Boolean estado_tipo_usuario;


}
