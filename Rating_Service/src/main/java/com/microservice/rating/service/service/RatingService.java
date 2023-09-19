package com.microservice.rating.service.service;

import com.microservice.rating.service.entity.Rating;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RatingService {

    //Create rating
    Rating createRating(Rating rating);



    //get all rating
    List<Rating> getAllRating();


    //get user wise rating
    List<Rating> getRatingByUserId(String userId);

    //get all hotel rating
    List<Rating> getRatingByHotelId(String hotelId);
}
