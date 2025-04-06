package com.zeal.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "SERVICIOS")
public class ServiciosModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSERVICIOS;

    @Column(nullable = false, unique = true, length = 255)
    private String titulo;

    @Column(nullable = false, unique = true,length = 15)
    private String descripcion;

    @Column(name = "precio", columnDefinition = "DECIMAL(10,2)")
    private BigDecimal precio;  

    @Column(nullable = false)
    private byte disponibilidad;

    @Column(updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp creado;

    @Column(nullable = false, unique = true)
    private Integer idUSUARIOS;

    @Column(nullable = false, unique = true)
    private Integer idCATEGORIAS;

    public void setId(Integer id) {
        this.idSERVICIOS = id;
    }

    @PrePersist
    protected void onCreate() {
        if (creado == null) {
            creado = new Timestamp(System.currentTimeMillis());
        }
    }

}
