package com.zeal.repository;

import com.zeal.model.ReviewsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewsRepository extends JpaRepository<ReviewsModel, Integer> {

}
