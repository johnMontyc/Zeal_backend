package com.zeal.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "TIPODOCUMENTOS")
public class TipoDocumentosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_tipo_documentos;

    @Column(nullable = false, unique = true, length = 155)
    private String nombre_tipo_documento;
}
