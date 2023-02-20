package com.hotel.HotelService.exception;

import net.bytebuddy.implementation.bind.annotation.Super;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(){
        super("Resource not found on server !! ");
    }
    public ResourceNotFoundException(String message){
        super(message);
    }
}
