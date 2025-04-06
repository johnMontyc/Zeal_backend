package com.zeal.repository;

import com.zeal.model.UsuariosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio para la entidad {@link UsuariosModel}.
 * Proporciona métodos para realizar operaciones CRUD sobre la tabla USUARIOS.
 * Extiende {@link JpaRepository} para heredar funcionalidades de persistencia.
 * 
 * @author John Montoya
 * @author Juan Gil
 * @author Issa Cooper
 * @author Luis Martinez
 */
@Repository
public interface UsuariosRepository extends JpaRepository<UsuariosModel, Integer> {

}

