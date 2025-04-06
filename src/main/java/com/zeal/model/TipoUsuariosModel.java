package com.zeal.model;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Modelo que representa la entidad TIPOUSUARIO en la base de datos.
 * Contiene información sobre los diferentes tipos de usuarios del sistema.
 * 
 * @author John Montoya
 * @author Juan Gil
 * @author Issa Cooper
 * @author Luis Martinez
 */
@Data
@Entity
@Table(name = "TIPOUSUARIO")
public class TipoUsuariosModel {

    /**
     * Identificador único del tipo de usuario.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTIPOUSUARIO;

    /**
     * Nombre del tipo de usuario.
     * No puede ser nulo, debe ser único y tiene una longitud máxima de 45 caracteres.
     */
    @Column(nullable = false, unique = true, length = 45)
    private String nombre_tipo_usuario;

    /**
     * Estado del tipo de usuario (activo/inactivo).
     * No puede ser nulo, valor por defecto 1 (activo) y tiene una longitud máxima de 255.
     */
    @Column(nullable = false, length = 255)
    private byte estado_tipo_user = 1;

    /**
     * Establece el identificador del tipo de usuario.
     * 
     * @param id el nuevo identificador del tipo de usuario
     */
    public void setId(Integer id) {
        this.idTIPOUSUARIO = id;
    }
}