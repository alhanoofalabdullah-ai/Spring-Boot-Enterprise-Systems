package com.alhanoof.hotel.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "rooms")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String roomNumber;

    private String roomType;

    private Double pricePerNight;

    private Boolean available;

    public Room() {
    }

    public Room(
            String roomNumber,
            String roomType,
            Double pricePerNight,
            Boolean available
    ) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.available = available;
    }

    // Getters and Setters
}
