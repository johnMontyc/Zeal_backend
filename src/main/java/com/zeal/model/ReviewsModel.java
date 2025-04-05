package com.zeal.model;

import java.sql.Date;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "REVIEWS")
public class ReviewsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_reviews;

    @Column(nullable = false)
    private Integer calificacion;

    @Column(nullable = false, unique = true, length = 255)
    private String comentario;

    @Column(nullable = false)
    private Date fecha;

    @Column(nullable = false)
    private Integer id_usuarios;

    @Column(nullable = false)
    private Integer id_servicios;
}
