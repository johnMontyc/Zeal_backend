package com.zeal.repository;

import com.zeal.model.ServiciosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio para la entidad {@link ServiciosModel}.
 * Proporciona métodos CRUD y operaciones adicionales gracias a {@link JpaRepository}.
 * 
 * Este repositorio permite interactuar con la tabla SERVICIOS en la base de datos.
 * 
 * @author John Montoya
 * @author Juan Gil
 * @author Issa Cooper
 * @author Luis Martinez
 */
@Repository
public interface ServiciosRepository extends JpaRepository<ServiciosModel, Integer> {
    
}