package com.Product.Models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "STUDENT")
public class StudentInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentId;
    private  String name;
    private String about;

    @OneToOne(mappedBy = "studentInfo")
    private Laptop laptop;

}
