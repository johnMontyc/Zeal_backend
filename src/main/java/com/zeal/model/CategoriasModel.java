package com.zeal.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "CATEGORIAS")
public class CategoriasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_categorias;

    @Column(nullable = false, unique = true, length = 100)
    private String nombre_categoria;
}