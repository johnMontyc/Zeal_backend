package com.zeal.model;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Modelo que representa la entidad USUARIOS en la base de datos.
 * Contiene información relacionada con las credenciales y el estado de los usuarios del sistema.
 * 
 * @author John Montoya
 * @author Juan Gil
 * @author Issa Cooper
 * @author Luis Martinez
 */
@Data
@Entity
@Table(name = "USUARIOS")
public class UsuariosModel {

    /**
     * Identificador único del usuario.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUSUARIOS;

    /**
     * Correo electrónico del usuario.
     * Debe ser único y no nulo, con una longitud máxima de 155 caracteres.
     */
    @Column(nullable = false, unique = true, length = 155)
    private String email;

    /**
     * Contraseña del usuario.
     * Debe ser única y no nula, con una longitud máxima de 15 caracteres.
     */
    @Column(nullable = false, unique = true, length = 15)
    private String pass_user;

    /**
     * Estado del usuario.
     * Representado como un byte, donde 1 indica activo por defecto.
     */
    @Column(nullable = false)
    private byte estado_user = 1;

    /**
     * Establece el identificador del usuario.
     * 
     * @param id el nuevo identificador del usuario
     */
    public void setId(Integer id) {
        this.idUSUARIOS = id;
    }
}

