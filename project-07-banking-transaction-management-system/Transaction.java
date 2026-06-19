package com.alhanoof.banking.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String transactionType;

    private Double amount;

    private String referenceNumber;

    private LocalDateTime transactionDate;

    public Transaction() {
    }

    public Transaction(
            String transactionType,
            Double amount,
            String referenceNumber,
            LocalDateTime transactionDate
    ) {
        this.transactionType = transactionType;
        this.amount = amount;
        this.referenceNumber = referenceNumber;
        this.transactionDate = transactionDate;
    }

    // Getters and Setters
}
