package com.microservice.hotel.service.repository;

import com.microservice.hotel.service.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel,String>
{

}
