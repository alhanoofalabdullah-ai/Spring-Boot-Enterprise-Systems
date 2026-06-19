package com.alhanoof.banking.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    private String email;

    private String nationalId;

    public Customer() {
    }

    public Customer(
            String fullName,
            String email,
            String nationalId
    ) {
        this.fullName = fullName;
        this.email = email;
        this.nationalId = nationalId;
    }

    // Getters and Setters
}
