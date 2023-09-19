package com.microservice.hotel.service.controller;

import com.microservice.hotel.service.entity.Hotel;
import com.microservice.hotel.service.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    //Create method
    @PostMapping("/createHotel")
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
        Hotel hotel1 = hotelService.createHotel(hotel);
            return ResponseEntity.status(HttpStatus.CREATED).body(hotel1);
    }


    //get Single Hotel
    @GetMapping("/getSingleHotel/{hotelId}")
    public ResponseEntity<Hotel> getSingleUser(@PathVariable String hotelId){
        Hotel hotel = hotelService.getHotel(hotelId);
        return ResponseEntity.ok(hotel);
    }

    //Get all Hotel
    @GetMapping("/getAllHotel")
    public ResponseEntity<List<Hotel>> getAllHotel(){
        List<Hotel> allHotel = hotelService.getAllHotel();
        return ResponseEntity.ok(allHotel);
    }
}
