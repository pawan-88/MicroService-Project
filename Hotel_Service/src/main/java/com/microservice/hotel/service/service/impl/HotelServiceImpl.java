package com.microservice.hotel.service.service.impl;

import com.microservice.hotel.service.entity.Hotel;
import com.microservice.hotel.service.exception.ResourceNotFoundException;
import com.microservice.hotel.service.repository.HotelRepository;
import com.microservice.hotel.service.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;
    @Override
    public Hotel createHotel(Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();
        hotel.setHotelId(hotelId);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotel() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getHotel(String hotelId) {
        return hotelRepository.findById(hotelId).orElseThrow(()
                -> new ResourceNotFoundException("hotel with given hotelId is not found !!"));
    }
}
