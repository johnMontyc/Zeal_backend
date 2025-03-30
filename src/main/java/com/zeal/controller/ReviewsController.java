package com.zeal.controller;

import com.zeal.model.ReviewsModel;
import com.zeal.service.ReviewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewsController {

    @Autowired
    private ReviewsService reviewsService;

    @GetMapping
    public List<ReviewsModel> findAll() {
        return reviewsService.findAll();
    }

    @GetMapping("/{id}")
    public ReviewsModel findById(@PathVariable Integer id) {
        return reviewsService.findById(id);
    }

    @PostMapping
    public ReviewsModel save(@RequestBody ReviewsModel reviewsModel) {
        return reviewsService.save(reviewsModel);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        reviewsService.deleteById(id);
    }
}
