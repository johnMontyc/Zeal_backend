package com.zeal.model;

import java.sql.Timestamp;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Modelo que representa la entidad MENSAJES en la base de datos.
 * Contiene información sobre los mensajes intercambiados entre usuarios en el aplicativo.
 * 
 * @author John Montoya
 * @author Juan Gil
 * @author Issa Cooper
 * @author Luis Martinez
 */
@Data
@Entity 
@Table(name = "MENSAJES")
public class MensajesModel {

    /**
     * Identificador único del mensaje.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMENSAJES;

    /**
     * Contenido del mensaje.
     * No puede ser nulo y tiene una longitud máxima de 255 caracteres.
     */
    @Column(nullable = false, length = 255)
    private String mensaje;

    /**
     * Estado de lectura del mensaje.
     * Valor por defecto 0 (no leído), no puede ser nulo y tiene una longitud máxima de 50 caracteres.
     */
    @Column(nullable = false, length = 50)
    private byte leido = 0;

    /**
     * Fecha y hora en que fue enviado el mensaje.
     * No puede ser nulo y por defecto usa el timestamp actual al crearse.
     */
    @Column(nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp enviado;

    /**
     * Identificador único del usuario emisor del mensaje.
     * No puede ser nulo y debe ser único.
     */
    @Column(nullable = false, unique = true)
    private Integer idEMISOR;

    /**
     * Identificador único del usuario receptor del mensaje.
     * No puede ser nulo y debe ser único.
     */
    @Column(nullable = false, unique = true)
    private Integer idRECEPTOR;

    /**
     * Establece el identificador del mensaje.
     * 
     * @param id el nuevo identificador del mensaje
     */
    public void setId(Integer id) {
        this.idMENSAJES = id;
    }

    /**
     * Método que se ejecuta antes de persistir la entidad.
     * Establece la fecha de envío con el timestamp actual si no está definida.
     */
    @PrePersist
    protected void onCreate() {
        if (enviado == null) {
            enviado = new Timestamp(System.currentTimeMillis());
        }
    }
   
}