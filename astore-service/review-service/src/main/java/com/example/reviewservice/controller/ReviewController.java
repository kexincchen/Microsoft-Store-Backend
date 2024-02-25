package com.example.reviewservice.controller;

import com.example.reviewservice.entity.Review;
import com.example.reviewservice.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    @Autowired
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping("/add")
    public void addReview(@RequestBody String comment, @RequestParam Integer rating, @RequestParam Long userid, @RequestParam Long appid) {
        Review review = new Review(appid, userid, comment, rating, new Date());
        reviewService.addReview(review);
    }

    @GetMapping("/getByApp/{applicationId}")
    public List<Review> getReviewsByApplicationId(@PathVariable Long applicationId) {
        return reviewService.getReviewsByApplicationId(applicationId);
    }
}
