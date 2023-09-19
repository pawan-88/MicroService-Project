package com.microservice.rating.service.controller;

import com.microservice.rating.service.entity.Rating;
import com.microservice.rating.service.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {
    @Autowired
    private RatingService ratingService;


    //Create Rating method
    @PostMapping("/createRating")
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating){
            Rating rating1 = ratingService.createRating(rating);
            return ResponseEntity.status(HttpStatus.CREATED).body(rating1);
            //           OR
// return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.createRating(rating1));
    }

    // Get all Rating
    @GetMapping("/getAllRating")
    public ResponseEntity<List<Rating>> getAllRating(){
       List<Rating> allRating = ratingService.getAllRating();
       return ResponseEntity.ok(allRating);
    }

    //Get rating by UserId
    @GetMapping("/userRating/{userId}")
    public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String userId){
        List<Rating> userRating = ratingService.getRatingByUserId(userId);
        return ResponseEntity.ok(userRating);
    }

    //Get rating by hotelId
    @GetMapping("/hotelRating/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String hotelId){
        List<Rating> hotelRating = ratingService.getRatingByHotelId(hotelId);
        return ResponseEntity.ok(hotelRating);
    }
}
