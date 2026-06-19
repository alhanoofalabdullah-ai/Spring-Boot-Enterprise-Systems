package com.alhanoof.banking.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String accountNumber;

    private String accountType;

    private Double balance;

    private String status;

    public Account() {
    }

    public Account(
            String accountNumber,
            String accountType,
            Double balance,
            String status
    ) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.status = status;
    }

    // Getters and Setters
}
