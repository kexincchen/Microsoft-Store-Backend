package com.example.reviewservice.service;

import com.example.reviewservice.entity.Review;

import java.util.List;

public interface ReviewService {

    void addReview(Review review);

    List<Review> getReviewsByApplicationId(Long applicationId);
}
