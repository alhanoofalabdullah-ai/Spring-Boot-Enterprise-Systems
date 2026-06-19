package com.alhanoof.ecommerce.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    private String email;

    private String phone;

    public Customer() {
    }

    public Customer(
            String fullName,
            String email,
            String phone
    ) {
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
    }

    // Getters and Setters
}
