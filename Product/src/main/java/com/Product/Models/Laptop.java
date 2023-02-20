package com.Product.Models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "LAPTOP")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer laptopId;
    private String modeNumber;
    private String brand;

    @OneToOne
    @JoinColumn(name = "student_id")
    private StudentInfo studentInfo;
}
