package com.zeal.model;

import java.sql.Timestamp;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Modelo que representa la entidad CONTRATOS en la base de datos.
 * Contiene información sobre los contratos establecidos entre clientes y proveedores de servicios.
 * 
 * @author John Montoya
 * @author Juan Gil
 * @author Issa Cooper
 * @author Luis Martinez
 */
@Data
@Entity
@Table(name = "CONTRATOS")
public class ContratosModel {

    /**
     * Identificador único del contrato.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCONTRATOS;

    /**
     * Estado del contrato.
     * Valor por defecto 1, no puede ser nulo y debe ser único.
     */
    @Column(nullable = false, unique = true, length = 100)
    private byte estado = 1;

    /**
     * Fecha y hora de creación del contrato.
     * No puede ser nulo y tiene una longitud máxima de 255 caracteres.
     */
    @Column(nullable = false, length = 255)
    private Timestamp creado;

    /**
     * Fecha y hora de completado del contrato.
     * Longitud máxima de 50 caracteres.
     */
    @Column(length = 50)
    private Timestamp completado;

    /**
     * Identificador único del cliente asociado al contrato.
     * No puede ser nulo y debe ser único.
     */
    @Column(nullable = false, unique = true)
    private Integer idCLIENTE;

    /**
     * Identificador único del proveedor asociado al contrato.
     * No puede ser nulo y debe ser único.
     */
    @Column(nullable = false, unique = true)
    private Integer idPROVEDOR;

    /**
     * Identificador único del servicio asociado al contrato.
     * No puede ser nulo y debe ser único.
     */
    @Column(nullable = false, unique = true)
    private Integer idSERVICIOS;

    /**
     * Establece el identificador del contrato.
     * 
     * @param id el nuevo identificador del contrato
     */
    public void setId(Integer id) {
        this.idCONTRATOS = id;
    }

    /**
     * Método que se ejecuta antes de persistir la entidad.
     * Establece la fecha de creación si no está definida.
     */
    @PrePersist
    protected void onCreate() {
        if (creado == null) {
            creado = new Timestamp(System.currentTimeMillis());
        }
    }

}