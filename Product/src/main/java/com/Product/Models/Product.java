package com.Product.Models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private float price;

    public Product() {
    }
    public Product(Integer id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}