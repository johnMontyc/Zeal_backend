package com.zeal.model;

import java.sql.Date;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity 
@Table(name = "ROLES")
public class RolesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_rol;

    @Column(nullable = false, unique = true, length = 50)
    private Date creado_rol;

    @Column(nullable = false, length = 255)
    private Date modificado_rol;

    
}
   