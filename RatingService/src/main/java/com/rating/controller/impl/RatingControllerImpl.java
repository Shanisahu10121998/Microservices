package com.rating.controller.impl;

import com.rating.controller.IRatingController;
import com.rating.entities.Rating;
import com.rating.service.IRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RatingControllerImpl implements IRatingController {

    @Autowired
    private IRatingService service;

    @Override
    public ResponseEntity<Rating> createRating(Rating rating) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createRating(rating));
    }

    @Override
    public ResponseEntity<List<Rating>> getAllRatings() {
        return ResponseEntity.ok(service.getAllRating());
    }

    @Override
    public ResponseEntity<List<Rating>> getByUserId(String userId) {
        return ResponseEntity.ok(service.getAllRatingByUserId(userId));
    }

    @Override
    public ResponseEntity<List<Rating>> getByHotelId(String hotelId) {
        return ResponseEntity.ok(service.getAllRatingByHotelId(hotelId));
    }
}
