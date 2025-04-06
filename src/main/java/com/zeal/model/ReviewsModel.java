package com.zeal.model;

import java.sql.Timestamp;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Modelo que representa la entidad REVIEWS en la base de datos.
 * Contiene información relacionada con las calificaciones y comentarios de los usuarios sobre los servicios.
 * 
 * @author John Montoya
 * @author Juan Gil
 * @author Issa Cooper
 * @author Luis Martinez
 */
@Data
@Entity
@Table(name = "REVIEWS")
public class ReviewsModel {

    /**
     * Identificador único de la review.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idREVIEWS;

    /**
     * Calificación otorgada por el usuario al servicio.
     */
    @Column(nullable = false)
    private float calificacion;

    /**
     * Comentario descriptivo asociado a la calificación del servicio.
     */
    @Column(nullable = false, unique = true, length = 255)
    private String comentario;

    /**
     * Fecha y hora en que fue creada la review.
     * Este campo se asigna automáticamente al momento de la creación.
     */
    @Column(updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp creado;

    /**
     * Identificador del usuario que realizó la review.
     */
    @Column(nullable = false)
    private Integer idUSUARIOS;

    /**
     * Identificador del servicio al cual se le realiza la review.
     */
    @Column(nullable = false)
    private Integer idSERVICIOS;

    /**
     * Establece el ID de la review.
     * 
     * @param id nuevo identificador
     */
    public void setId(Integer id) {
        this.idREVIEWS = id;
    }

    /**
     * Asigna automáticamente la fecha de creación si no ha sido definida previamente.
     * Este método se ejecuta antes de persistir la entidad.
     */
    @PrePersist
    protected void onCreate() {
        if (creado == null) {
            creado = new Timestamp(System.currentTimeMillis());
        }
    }

}


