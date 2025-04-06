package com.zeal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.zeal.model.TipoUsuariosModel;
import org.springframework.stereotype.Repository;

/**
 * Repositorio para la entidad {@link TipoUsuariosModel}.
 * Proporciona métodos CRUD y operaciones adicionales gracias a {@link JpaRepository}.
 * 
 * Este repositorio permite interactuar con la tabla TIPO_USUARIOS en la base de datos.
 * 
 * @author John Montoya
 * @author Juan Gil
 * @author Issa Cooper
 * @author Luis Martinez
 */
@Repository
public interface TipoUsuariosRepository extends JpaRepository<TipoUsuariosModel, Integer> {
    
}