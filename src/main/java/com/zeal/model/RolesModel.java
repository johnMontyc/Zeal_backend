package com.zeal.model;

import java.sql.Timestamp;
import jakarta.persistence.*;
import lombok.Data;

/**
 * Modelo que representa la entidad ROLES en la base de datos.
 * Contiene información sobre los roles y permisos asignados a los usuarios del sistema.
 * 
 * @author John Montoya
 * @author Juan Gil
 * @author Issa Cooper
 * @author Luis Martinez
 */
@Data
@Entity 
@Table(name = "ROLES")
public class RolesModel {

    /**
     * Identificador único del rol.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idROLES;

    /**
     * Fecha y hora de creación del rol.
     * No puede ser nulo y por defecto usa el timestamp actual al crearse.
     */
    @Column(nullable = false, columnDefinition ="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp creado;

    /**
     * Fecha y hora de la última modificación del rol.
     * No puede ser nulo y por defecto usa el timestamp actual al crearse.
     */
    @Column(nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp modificado;

    /**
     * Identificador único del usuario asociado al rol.
     * No puede ser nulo y debe ser único.
     */
    @Column(nullable = false, unique = true)
    private Integer idUSUARIOS;

    /**
     * Identificador único del tipo de usuario asociado al rol.
     * No puede ser nulo y debe ser único.
     */
    @Column(nullable = false, unique = true)
    private Integer idTIPOUSUARIO;

    /**
     * Establece el identificador del rol.
     * 
     * @param id el nuevo identificador del rol
     */
    public void setId(Integer id) {
        this.idROLES = id;
    }

    /**
     * Método que se ejecuta antes de persistir la entidad.
     * Establece las fechas de creación y modificación con el timestamp actual si no están definidas.
     */
    @PrePersist
    protected void onCreate() {
        if (creado == null || modificado == null) {
            creado = new Timestamp(System.currentTimeMillis());
            modificado = new Timestamp(System.currentTimeMillis());
        }
    }
}