package com.zeal.repository;

import com.zeal.model.RolesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends JpaRepository<RolesModel, Integer> {
    // Puedes agregar métodos de consulta personalizados aquí si es necesario
}
