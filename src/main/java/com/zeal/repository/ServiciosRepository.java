package com.zeal.repository;

import com.zeal.model.ServiciosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiciosRepository extends JpaRepository<ServiciosModel, Integer> {
    // Puedes agregar métodos de consulta personalizados aquí si es necesario
}
