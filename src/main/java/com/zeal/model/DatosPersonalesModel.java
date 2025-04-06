package com.zeal.model;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Modelo de entidad que representa los datos personales de un usuario.
 * Esta clase está mapeada a la tabla "DATOSPERSONALES" en la base de datos.
 * 
 * Incluye información como nombre completo, número de identificación,
 * dirección, teléfono, y las claves foráneas que relacionan al usuario y tipo de documento.
 * 
 * @author John Montoya
 * @author Juan Gil
 * @author Issa Cooper
 * @author Luis Martinez
 */
@Data
@Entity
@Table(name = "DATOSPERSONALES")
public class DatosPersonalesModel {

    /**
     * Identificador único de los datos personales (clave primaria).
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDATOSPERSONALES;

    /**
     * Nombre completo de la persona o empresa.
     */
    @Column(nullable = false, unique = true, length = 255)
    private String nombre_completo;

    /**
     * Número de identificación personal o de empresa.
     */
    @Column(nullable = false, unique = true, length = 45)
    private String numero_identificacion;

    /**
     * Dirección de residencia de la persona o empresa.
     */
    @Column(nullable = false, unique = true, length = 255)
    private String direccion;

    /**
     * Número de teléfono de contacto.
     */
    @Column(nullable = false, unique = true, length = 15)
    private String telefono;

    /**
     * ID del usuario relacionado (clave foránea).
     */
    @Column(nullable = false, unique = true)
    private Integer idUSUARIOS;

    /**
     * ID del tipo de documento relacionado (clave foránea).
     */
    @Column(nullable = false, unique = true)
    private Integer idTIPODOCUMENTOS;

    /**
     * Establece el ID de los datos personales.
     * 
     * @param id ID a establecer.
     */
    public void setId(Integer id) {
        this.idDATOSPERSONALES = id;
    }

}

