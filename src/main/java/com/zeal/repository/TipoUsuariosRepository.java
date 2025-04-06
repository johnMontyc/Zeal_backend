package com.zeal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.zeal.model.TipoUsuariosModel;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoUsuariosRepository extends JpaRepository<TipoUsuariosModel, Integer> {
    // atributos de interface:
}
