package com.microservice.rating.service.repository;

import com.microservice.rating.service.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepository extends JpaRepository<Rating, String>
{

    //Custom finder Method
    List<Rating> findByUserId(String userId);

    List<Rating> findByHotelId(String hotelId);
}
