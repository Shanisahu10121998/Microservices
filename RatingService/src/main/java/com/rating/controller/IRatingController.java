package com.rating.controller;

import com.rating.entities.Rating;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/rating")
public interface IRatingController {

    @PostMapping(path = "/create")
    public ResponseEntity<Rating> createRating(@RequestBody(required = true) Rating rating);

    @GetMapping(path = "/getAllRatings")
    public ResponseEntity<List<Rating>> getAllRatings();

    @GetMapping(path = "/getByUserId/{userId}")
    public ResponseEntity<List<Rating>> getByUserId(@PathVariable String userId);

    @GetMapping(path = "/getByHotelId/{hotelId}")
    public ResponseEntity<List<Rating>> getByHotelId(@PathVariable String hotelId);

}
