package com.hotel.HotelService.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "HOTELS")
public class Hotel {

    @Id
    private  String id;
    private String name;
    private String  about;
    private String location;
}
