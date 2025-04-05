package com.zeal.model;

import java.sql.Timestamp;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "REVIEWS")
public class ReviewsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idREVIEWS;

    @Column(nullable = false)
    private float calificacion;

    @Column(nullable = false, unique = true, length = 255)
    private String comentario;

    @Column(updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp creado;

    @Column(nullable = false)
    private Integer idUSUARIOS;

    @Column(nullable = false)
    private Integer idSERVICIOS;

    public void setId(Integer id) {
        this.idREVIEWS = id;
    }

    @PrePersist
    protected void onCreate() {
        if (creado == null) {
            creado = new Timestamp(System.currentTimeMillis());
        }
    }
}