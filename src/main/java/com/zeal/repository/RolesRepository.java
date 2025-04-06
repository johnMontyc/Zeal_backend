package com.zeal.repository;

import com.zeal.model.RolesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio para la entidad {@link RolesModel}.
 * Proporciona métodos CRUD y operaciones adicionales gracias a {@link JpaRepository}.
 * 
 * Este repositorio permite interactuar con la tabla ROLES en la base de datos.
 * 
 * @author John Montoya
 * @author Juan Gil
 * @author Issa Cooper
 * @author Luis Martinez
 */
@Repository
public interface RolesRepository extends JpaRepository<RolesModel, Integer> {
    
}