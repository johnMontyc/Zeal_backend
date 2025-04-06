package com.zeal.model;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Modelo que representa la entidad TIPODOCUMENTOS en la base de datos.
 * Contiene información sobre los diferentes tipos de documentos que pueden registrar los usuarios.
 * 
 * @author John Montoya
 * @author Juan Gil
 * @author Issa Cooper
 * @author Luis Martinez
 */
@Data
@Entity
@Table(name = "TIPODOCUMENTOS")
public class TipoDocumentosModel {

    /**
     * Identificador único del tipo de documento.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTIPODOCUMENTOS;

    /**
     * Nombre del tipo de documento.
     * Debe ser único, no nulo y con una longitud máxima de 155 caracteres.
     */
    @Column(nullable = false, unique = true, length = 155)
    private String nombre_tipo_documento;

    /**
     * Establece el identificador del tipo de documento.
     * 
     * @param id el nuevo identificador del tipo de documento
     */
    public void setId(Integer id) {
        this.idTIPODOCUMENTOS = id;
    }
}

