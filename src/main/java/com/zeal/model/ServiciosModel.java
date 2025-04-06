package com.zeal.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Modelo que representa la entidad SERVICIOS en la base de datos.
 * Contiene información sobre los servicios ofrecidos por los proveedores en la plataforma.
 * 
 * @author John Montoya
 * @author Juan Gil
 * @author Issa Cooper
 * @author Luis Martinez
 */
@Data
@Entity
@Table(name = "SERVICIOS")
public class ServiciosModel {
    
    /**
     * Identificador único del servicio.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSERVICIOS;

    /**
     * Título del servicio.
     * No puede ser nulo, debe ser único y tiene una longitud máxima de 255 caracteres.
     */
    @Column(nullable = false, unique = true, length = 255)
    private String titulo;

    /**
     * Descripción detallada del servicio.
     * No puede ser nulo, debe ser único y tiene una longitud máxima de 15 caracteres.
     */
    @Column(nullable = false, unique = true, length = 15)
    private String descripcion;

    /**
     * Precio del servicio.
     * Se almacena como DECIMAL(10,2) para permitir valores monetarios con dos decimales.
     */
    @Column(name = "precio", columnDefinition = "DECIMAL(10,2)")
    private BigDecimal precio;  

    /**
     * Estado de disponibilidad del servicio.
     * No puede ser nulo (0 = no disponible, 1 = disponible).
     */
    @Column(nullable = false)
    private byte disponibilidad;

    /**
     * Fecha y hora de creación del servicio.
     * No puede ser actualizado y por defecto usa el timestamp actual al crearse.
     */
    @Column(updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp creado;

    /**
     * Identificador único del usuario/proveedor asociado al servicio.
     * No puede ser nulo y debe ser único.
     */
    @Column(nullable = false, unique = true)
    private Integer idUSUARIOS;

    /**
     * Identificador único de la categoría asociada al servicio.
     * No puede ser nulo y debe ser único.
     */
    @Column(nullable = false, unique = true)
    private Integer idCATEGORIAS;

    /**
     * Establece el identificador del servicio.
     * 
     * @param id el nuevo identificador del servicio
     */
    public void setId(Integer id) {
        this.idSERVICIOS = id;
    }

    /**
     * Método que se ejecuta antes de persistir la entidad.
     * Establece la fecha de creación con el timestamp actual si no está definida.
     */
    @PrePersist
    protected void onCreate() {
        if (creado == null) {
            creado = new Timestamp(System.currentTimeMillis());
        }
    }
}