package com.user.service.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Table(name = "RATING")
public class Rating {

    private String ratingId;
    private String userId;
    private String hotelId;
    private String feedback;
    private int ratings;
}