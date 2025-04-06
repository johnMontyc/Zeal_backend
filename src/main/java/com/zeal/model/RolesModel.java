package com.zeal.model;


import java.sql.Timestamp;
import jakarta.persistence.*;
import lombok.Data;



@Data
@Entity 
@Table(name = "ROLES")
public class RolesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idROLES;

    @Column(nullable = false, columnDefinition ="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp creado;

    @Column(nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp modificado;

    @Column(nullable = false, unique = true)
    private Integer idUSUARIOS;

    @Column(nullable = false, unique = true)
    private Integer idTIPOUSUARIO;

    public void setId(Integer id) {
        this.idROLES = id;
    }

    @PrePersist
    protected void onCreate() {
        if (creado == null || modificado == null) {
            creado = new Timestamp(System.currentTimeMillis());
            modificado = new Timestamp(System.currentTimeMillis());
        }
    }

    
}
   