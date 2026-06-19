package com.alhanoof.supplychain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "shipments")
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String trackingNumber;

    private String deliveryStatus;

    public Shipment() {
    }

    // Getters and Setters
}
