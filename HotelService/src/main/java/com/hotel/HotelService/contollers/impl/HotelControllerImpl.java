package com.hotel.HotelService.contollers.impl;

import com.hotel.HotelService.contollers.IHotelController;
import com.hotel.HotelService.entities.Hotel;
import com.hotel.HotelService.services.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotelControllerImpl implements IHotelController {

    @Autowired
    IHotelService hotelService;

    @Override
    public ResponseEntity<Hotel> createHotel(Hotel hotel) {
        return ResponseEntity.status(HttpStatus.CREATED).body( hotelService.createHotel(hotel));
    }

    @Override
    public ResponseEntity<Hotel> getHotel(String id) {
        return ResponseEntity.ok(hotelService.getHotel(id));
    }

    @Override
    public ResponseEntity<List<Hotel>> getHotelList() {
        return ResponseEntity.ok(hotelService.getHotelList());
    }
}
