package com.alhanoof.supplychain.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "purchase_orders")
public class PurchaseOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long supplierId;

    private LocalDate orderDate;

    private Double totalAmount;

    private String status;

    public PurchaseOrder() {
    }

    // Getters and Setters
}
