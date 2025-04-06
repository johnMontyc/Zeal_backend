package com.zeal.repository;

import com.zeal.model.DatosPersonalesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio para la entidad {@link DatosPersonalesModel}.
 * Proporciona métodos para realizar operaciones CRUD sobre la tabla DATOSPERSONALES.
 * Extiende {@link JpaRepository} para heredar funcionalidades de persistencia.
 * 
 * @author John Montoya
 * @author Juan Gil
 * @author Issa Cooper
 * @author Luis Martinez
 */
@Repository
public interface DatosPersonalesRepository extends JpaRepository<DatosPersonalesModel, Integer> {

}

