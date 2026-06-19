package com.alhanoof.hospital.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "bills")
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    private String paymentStatus;

    public Bill() {
    }

    public Bill(
            Double amount,
            String paymentStatus
    ) {
        this.amount = amount;
        this.paymentStatus = paymentStatus;
    }

    // Getters and Setters
}
