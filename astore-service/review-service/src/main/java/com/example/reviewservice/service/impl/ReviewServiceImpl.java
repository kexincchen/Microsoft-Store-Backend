package com.example.reviewservice.service.impl;

import com.example.reviewservice.entity.Review;
import com.example.reviewservice.mapper.ReviewMapper;
import com.example.reviewservice.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    private final ReviewMapper reviewMapper;

    @Autowired
    public ReviewServiceImpl(ReviewMapper reviewMapper) {
        this.reviewMapper = reviewMapper;
    }

    public void addReview(Review review) {
        reviewMapper.insert(review);
    }

    public List<Review> getReviewsByApplicationId(Long applicationId) {
        return reviewMapper.findByApplicationId(applicationId);
    }


    // Method to calculate average rating could be added here
}

