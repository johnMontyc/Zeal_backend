package com.zeal.model;


import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity 
@Table(name = "MENSAJES")
public class MensajesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMENSAJES;

    @Column(nullable = false, length = 255)
    private String mensaje;

    @Column(nullable = false, length = 50)
    private byte leido;

    @Column(nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime enviado;

    @Column(nullable = false, unique = true)
    private Integer idEMISOR;

    @Column(nullable = false, unique = true)
    private Integer idRECEPTOR;

    public void setId(Integer id) {
        this.idMENSAJES = id;
    }

   
}