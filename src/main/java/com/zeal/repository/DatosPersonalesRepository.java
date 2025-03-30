package com.zeal.repository;


import com.zeal.model.DatosPersonalesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatosPersonalesRepository extends JpaRepository<DatosPersonalesModel, Integer> {

}
