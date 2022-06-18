package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Hotel;
import com.example.demo.entity.Hotelreq;
import com.example.demo.Repository.HotelRepository;

@Service
public class HotelService {
	@Autowired
	HotelRepository HotelRepository;
	

	
	
	public void addHotelreq(Hotelreq abc) {
		ArrayList<Hotelreq> hot = new ArrayList<Hotelreq>();
		hot.add(abc);
	
		
		for (Hotelreq employee : hot) {
		HotelRepository.save(employee);
		}
	}
	
	public void save(Hotelreq details) {
		HotelRepository.save(details);
	}
	
	public void deleteAllData() {
  		HotelRepository.deleteAll();
  		
  		}
}

