package com.zeal.repository;

import com.zeal.model.TipoDocumentosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio para la entidad {@link TipoDocumentosModel}.
 * Proporciona métodos para realizar operaciones CRUD sobre la tabla TIPODOCUMENTOS.
 * Extiende {@link JpaRepository} para heredar funcionalidades de persistencia.
 * 
 * @author John Montoya
 * @author Juan Gil
 * @author Issa Cooper
 * @author Luis Martinez
 */
@Repository
public interface TipoDocumentosRepository extends JpaRepository<TipoDocumentosModel, Integer> {

}

