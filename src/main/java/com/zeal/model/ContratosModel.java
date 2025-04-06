package com.zeal.model;

import java.sql.Timestamp;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "CONTRATOS")
public class ContratosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCONTRATOS;

    @Column(nullable = false, unique = true, length = 100)
    private byte estado = 1;

    @Column(nullable = false, length = 255)
    private Timestamp creado;

    @Column(length = 50)
    private Timestamp completado;

    @Column(nullable = false, unique = true)
    private Integer idCLIENTE;

    @Column(nullable = false, unique = true)
    private Integer idPROVEDOR;

    @Column(nullable = false, unique = true)
    private Integer idSERVICIOS;

    public void setId(Integer id) {
        this.idCONTRATOS = id;
    }

    @PrePersist
    protected void onCreate() {
        if (creado == null) {
            creado = new Timestamp(System.currentTimeMillis());
        }
    }

}


