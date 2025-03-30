package com.zeal.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "DATOSPERSONALES")
public class DatosPersonalesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_datos_personales;

    @Column(nullable = false, unique = true, length = 255)
    private String nombre_completo;

    @Column(nullable = false, unique = true, length = 45)
    private String cedula;

    @Column(nullable = false, unique = true, length = 255)
    private String direccion;

    @Column(nullable = false, unique = true, length = 15)
    private String telefono;

    @Column(nullable = false, unique = true)
    private Integer id_usuario;

    @Column(nullable = false, unique = true)
    private Integer id_tipo_documento;

    

}
