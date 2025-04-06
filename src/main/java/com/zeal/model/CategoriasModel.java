package com.zeal.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "CATEGORIAS")
public class CategoriasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCATEGORIAS;

    @Column(nullable = false, unique = true, length = 100)
    private String nombre_categoria;

    public void setId(Integer id) {
        this.idCATEGORIAS = id;
    }
}