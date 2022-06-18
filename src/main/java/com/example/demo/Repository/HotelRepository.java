package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Hotel;
import com.example.demo.entity.Hotelreq;

public interface HotelRepository extends JpaRepository <Hotelreq, String> {

}
