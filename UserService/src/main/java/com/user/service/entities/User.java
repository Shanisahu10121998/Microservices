package com.user.service.entities;

import jdk.jfr.Enabled;
import jdk.jfr.Name;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Enabled
@Entity
@Data
@Table(name = "MICRO_USER")
public class User {

    @Id
    @Column(name = "ID")
    private  String userId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "ABOUT")
    private String about;

    @Transient
    private List<Rating> ratings = new ArrayList<>();

}
