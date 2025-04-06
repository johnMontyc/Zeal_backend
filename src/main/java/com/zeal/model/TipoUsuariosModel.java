package com.zeal.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "TIPOUSUARIO")
public class TipoUsuariosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTIPOUSUARIO;

    @Column(nullable = false, unique = true, length = 45)
    private String nombre_tipo_usuario;

    @Column(nullable = false, length = 255)
    private byte estado_tipo_user = 1;

    public void setId(Integer id) {
        this.idTIPOUSUARIO = id;
    }


}
