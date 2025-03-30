package com.zeal.repository;

import com.zeal.model.TipoDocumentosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDocumentosRepository extends JpaRepository<TipoDocumentosModel, Integer> {

}
