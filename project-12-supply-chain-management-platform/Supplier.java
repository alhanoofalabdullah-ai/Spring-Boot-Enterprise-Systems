package com.alhanoof.supplychain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "suppliers")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String supplierName;

    private String contactEmail;

    private String phoneNumber;

    private String country;

    public Supplier() {
    }

    // Getters and Setters
}
