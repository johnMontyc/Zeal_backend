package com.zeal.repository;
import com.zeal.model.CategoriasModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriasRepository extends JpaRepository<CategoriasModel, Integer> {

}
