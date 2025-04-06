package com.zeal.model;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Modelo que representa la entidad CATEGORIAS en la base de datos.
 * Contiene información sobre las categorías de los servicios ofrecidos en el aplicativo web.
 * 
 * @author John Montoya
 * @author Juan Gil
 * @author Issa Cooper
 * @author Luis Martinez
 */
@Data
@Entity
@Table(name = "CATEGORIAS")
public class CategoriasModel {

    /**
     * Identificador único de la categoría.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCATEGORIAS;

    /**
     * Nombre de la categoría.
     * Debe ser único y no nulo, con una longitud máxima de 100 caracteres.
     */
    @Column(nullable = false, unique = true, length = 100)
    private String nombre_categoria;

    /**
     * Establece el identificador de la categoría.
     * 
     * @param id el nuevo identificador de la categoría
     */
    public void setId(Integer id) {
        this.idCATEGORIAS = id;
    }
}
