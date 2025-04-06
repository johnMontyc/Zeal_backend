package com.zeal.repository;

import com.zeal.model.MensajesModel;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensajesRepository extends JpaRepository<MensajesModel, Integer> {

   
    
}