package com.hotel.HotelService.services;

import com.hotel.HotelService.entities.Hotel;

import java.util.List;

public interface IHotelService {

    public Hotel createHotel(Hotel hotel);

    public Hotel getHotel(String id);

    public List<Hotel> getHotelList();
}
