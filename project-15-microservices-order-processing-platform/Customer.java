package com.alhanoof.customer.entity;

import jakarta.persistence.*;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy =
            GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    private String email;

    // Getters and Setters
}
