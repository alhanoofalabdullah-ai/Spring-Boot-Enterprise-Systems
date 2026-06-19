package com.alhanoof.supplychain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "inventory")
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;

    private Integer quantity;

    private Integer reorderLevel;

    public Inventory() {
    }

    // Getters and Setters
}
