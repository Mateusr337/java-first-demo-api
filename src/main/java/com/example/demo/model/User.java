package com.example.demo.model;

import javax.persistence.*;

@Entity (name = "users")
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false)
    private String name;

    public Long getId () {
        return id;
    }

    public String getName () {
        return name;
    }

}
