# 🚀 Project 07 – Banking Transaction Management System

Enterprise Banking Transaction Management System built using Spring Boot, Spring Security, REST APIs, and MySQL.

---

# Overview

This project provides a banking backend platform for managing customer accounts and financial transactions.

The platform supports:

- Customer Management
- Account Management
- Money Transfers
- Deposit Transactions
- Withdrawals
- Transaction History
- Balance Tracking

---

# Business Scenario

Banks need secure systems to manage:

- Customers
- Accounts
- Transfers
- Transactions
- Balances
- Financial Operations

This project demonstrates enterprise banking architecture principles.

---

# Architecture

Customer

↓

REST API

↓

Spring Security

↓

Service Layer

↓

Repository Layer

↓

MySQL Database

---

# Features

## Customer Management

- Create Customer
- View Customer Details
- Update Customer Profile

---

## Account Management

- Open Account
- View Balance
- Account Status Tracking

---

## Transaction Management

- Deposit
- Withdraw
- Transfer Funds
- Transaction History

---

## Security

- Spring Security
- Password Encryption
- Secure Endpoints

---

# API Endpoints

## Customers

GET /api/customers

POST /api/customers

GET /api/customers/{id}

---

## Accounts

GET /api/accounts

POST /api/accounts

GET /api/accounts/{id}

---

## Transactions

POST /api/transactions/deposit

POST /api/transactions/withdraw

POST /api/transactions/transfer

GET /api/transactions/history

---

# Database Design

Customer

- Customer ID
- Full Name
- Email
- National ID

Account

- Account Number
- Account Type
- Balance
- Status

Transaction

- Transaction ID
- Transaction Type
- Amount
- Date
- Reference Number

---

# Technologies Used

- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA
- MySQL
- Maven

---

# Skills Demonstrated

- Banking Systems Development
- Financial Transaction Processing
- Secure API Design
- Database Relationships
- Enterprise Architecture
- Backend Engineering

---

# Future Enhancements

- JWT Authentication
- Multi-Factor Authentication
- Loan Management
- Credit Card Services
- Fraud Detection
- Audit Logging

---

# Author

Alhanoof Alabdullah
