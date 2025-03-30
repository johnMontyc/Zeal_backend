package com.zeal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.zeal.model.TipoUsuarioModel;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoUsuarioRepository extends JpaRepository<TipoUsuarioModel, Integer> {
    // atributos de interface:
}
