package com.Product.Models;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    @OneToOne
     private Author author;

}
