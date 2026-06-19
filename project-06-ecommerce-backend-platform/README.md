# 🚀 Project 06 – E-Commerce Backend Platform

Enterprise E-Commerce Backend Platform built using Spring Boot, REST APIs, JPA, and MySQL.

---

# Overview

This project provides a complete backend platform for online shopping systems.

The platform supports:

- Product Management
- Customer Management
- Shopping Cart
- Order Processing
- Inventory Tracking
- Sales Management

---

# Business Scenario

Modern e-commerce companies need systems for:

- Product Catalog Management
- Customer Accounts
- Shopping Cart Operations
- Order Processing
- Inventory Monitoring
- Revenue Tracking

This project demonstrates enterprise-grade e-commerce architecture.

---

# Architecture

Customer

↓

REST API

↓

Controller Layer

↓

Service Layer

↓

Repository Layer

↓

MySQL Database

---

# Features

## Product Management

- Create Product
- Update Product
- Delete Product
- Product Search

---

## Customer Management

- Register Customer
- Update Profile
- View Orders

---

## Shopping Cart

- Add Products
- Remove Products
- Update Quantity
- Calculate Total

---

## Order Management

- Create Orders
- Order Tracking
- Order History
- Order Status

---

# API Endpoints

## Products

GET /api/products

POST /api/products

PUT /api/products/{id}

DELETE /api/products/{id}

---

## Customers

GET /api/customers

POST /api/customers

---

## Cart

POST /api/cart/add

DELETE /api/cart/remove/{id}

GET /api/cart

---

## Orders

POST /api/orders

GET /api/orders

GET /api/orders/{id}

---

# Database Design

Product

- Product ID
- Name
- Description
- Price
- Quantity

Customer

- Customer ID
- Full Name
- Email
- Phone

Order

- Order ID
- Customer ID
- Total Amount
- Order Status

Cart

- Cart ID
- Product ID
- Quantity

---

# Technologies Used

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Maven

---

# Skills Demonstrated

- E-Commerce Architecture
- REST API Development
- Database Relationships
- Inventory Management
- Order Processing
- Backend Engineering
- Enterprise Application Design

---

# Future Enhancements

- Payment Gateway Integration
- JWT Authentication
- Product Reviews
- Coupons & Discounts
- Email Notifications
- Microservices Migration

---

# Author

Alhanoof Alabdullah
