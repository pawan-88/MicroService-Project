package com.microservice.hotel.service.service;

import com.microservice.hotel.service.entity.Hotel;

import java.util.List;

public interface HotelService {

    //create method

    Hotel createHotel(Hotel hotel);



    //get All method

    List<Hotel> getAllHotel();



    //get single hotel

    Hotel getHotel(String hotelId);
}
