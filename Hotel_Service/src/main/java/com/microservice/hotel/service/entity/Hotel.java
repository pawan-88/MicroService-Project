package com.microservice.hotel.service.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "micro_hotels")
public class Hotel {

    @Id
    private String hotelId;
    private String name;
    private String location;
    private String about;
}
