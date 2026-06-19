package com.alhanoof.ecommerce.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double totalAmount;

    private String orderStatus;

    public Order() {
    }

    public Order(
            Double totalAmount,
            String orderStatus
    ) {
        this.totalAmount = totalAmount;
        this.orderStatus = orderStatus;
    }

    // Getters and Setters
}
