package com.zeal.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "CONTRATOS")
public class ContratosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_contrato;

    @Column(nullable = false, unique = true, length = 100)
    private String estado_contrato;

    @Column(nullable = false, length = 255)
    private String creado_contrato;

    @Column(nullable = false, length = 50)
    private String completado_contrato;


}
