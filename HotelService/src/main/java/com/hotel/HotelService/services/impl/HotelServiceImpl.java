package com.hotel.HotelService.services.impl;

import com.hotel.HotelService.entities.Hotel;
import com.hotel.HotelService.exception.ResourceNotFoundException;
import com.hotel.HotelService.repositories.IHotelRepository;
import com.hotel.HotelService.services.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements IHotelService {

    @Autowired
    private IHotelRepository iHotelRepository;

    @Override
    public Hotel createHotel(Hotel hotel) {
        String randomUniqueID = UUID.randomUUID().toString();
        hotel.setId(randomUniqueID);
        return iHotelRepository.save(hotel);
    }

    @Override
    public Hotel getHotel(String id) {
        return iHotelRepository.findById(id).orElseThrow( () -> new ResourceNotFoundException("Not found hotel by this id: " + id));
    }

    @Override
    public List<Hotel> getHotelList() {
        return iHotelRepository.findAll();
    }
}
