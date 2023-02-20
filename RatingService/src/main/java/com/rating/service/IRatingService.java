package com.rating.service;

import com.rating.entities.Rating;

import java.util.List;

public interface IRatingService {

    //create
    Rating createRating(Rating  rating);


    //get All Ratings
    List<Rating> getAllRating();


    //get all Ratings by user id
    List<Rating> getAllRatingByUserId(String userId);

    //get all Ratings by hotel id
    List<Rating>  getAllRatingByHotelId(String hotelId);
}
