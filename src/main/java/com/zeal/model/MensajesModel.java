package com.zeal.model;

import java.sql.Date;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity 
@Table(name = "MENSAJES")
public class MensajesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_mensaje;

    @Column(nullable = false, length = 255)
    private String mensaje_mensaje;

    @Column(nullable = false, length = 50)
    private Boolean leido_mensaje;

    @Column(nullable = false, length = 50)
    private Date enviado_mensaje;

   
}