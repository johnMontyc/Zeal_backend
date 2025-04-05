package com.zeal.service;

import com.zeal.model.ReviewsModel;
import com.zeal.repository.ReviewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReviewsService {

    @Autowired
    private ReviewsRepository reviewsRepository;

    public List<ReviewsModel> findAll() {
        return reviewsRepository.findAll();
    }

    public ReviewsModel findById(Integer id) {
        return reviewsRepository.findById(id).orElse(null);
    }

    public ReviewsModel save(ReviewsModel reviewsModel) {
        return reviewsRepository.save(reviewsModel);
    }

    public void deleteById(Integer id) {
        reviewsRepository.deleteById(id);
    }
}
