package com.hotel.HotelService.contollers;


import com.hotel.HotelService.entities.Hotel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/hotel")
public interface IHotelController {

    @PostMapping(path = "/create")
    public ResponseEntity<Hotel> createHotel(
            @RequestBody(required = true) Hotel hotel);

    @GetMapping(path = "/get/{id}")
    public ResponseEntity<Hotel> getHotel(
            @PathVariable String id);

    @GetMapping(path = "/getList")
    public ResponseEntity<List<Hotel>> getHotelList();
}
