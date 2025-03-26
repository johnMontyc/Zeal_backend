package com.zeal.repository;

import com.zeal.model.ReviewsModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewsRepository extends JpaRepository<ReviewsModel, Integer> {

}
