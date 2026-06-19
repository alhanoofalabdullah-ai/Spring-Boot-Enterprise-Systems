package com.alhanoof.hotel.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "guests")
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    private String email;

    private String phoneNumber;

    private String nationality;

    public Guest() {
    }

    public Guest(
            String fullName,
            String email,
            String phoneNumber,
            String nationality
    ) {
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.nationality = nationality;
    }

    // Getters and Setters
}
