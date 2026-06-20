package com.alhanoof.product.entity;

import jakarta.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy =
            GenerationType.IDENTITY)
    private Long id;

    private String productName;

    private Double price;

    // Getters and Setters
}
