package com.zeal.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "USUARIOS")
public class UsuariosModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_usuario;

    @Column(nullable = false, unique = true, length = 155)
    private String email;

    @Column(nullable = false, unique = true,length = 15)
    private String pass_user;

    @Column(nullable = false)
    private Boolean estado_user;
}
