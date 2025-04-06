package com.zeal.repository;

import com.zeal.model.ContratosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratosRepository extends JpaRepository<ContratosModel, Integer> {
    // Puedes agregar métodos de consulta personalizados aquí si es necesario
}
