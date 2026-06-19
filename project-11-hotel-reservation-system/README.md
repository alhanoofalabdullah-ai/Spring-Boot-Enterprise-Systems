# 🚀 Project 11 – Hotel Reservation System

Enterprise Hotel Reservation System built using Spring Boot, REST APIs, JPA, and MySQL.

---

# Overview

This project provides a complete hospitality management platform for hotels and resorts.

The platform supports:

- Guest Management
- Room Management
- Reservation Management
- Check-In / Check-Out
- Payment Tracking
- Occupancy Monitoring
- Revenue Reporting

---

# Business Scenario

Hotels require a centralized system to manage:

- Guests
- Reservations
- Rooms
- Payments
- Availability
- Hospitality Operations

This project demonstrates enterprise hospitality management architecture.

---

# Architecture

Guests

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

## Guest Management

- Register Guest
- Update Guest Information
- Guest History
- Contact Management

---

## Room Management

- Room Availability
- Room Categories
- Room Pricing
- Room Status

---

## Reservation Management

- Create Reservation
- Modify Reservation
- Cancel Reservation
- Reservation History

---

## Check-In / Check-Out

- Guest Check-In
- Guest Check-Out
- Occupancy Tracking

---

## Payment Management

- Payment Processing
- Invoice Generation
- Payment History

---

# API Endpoints

## Guests

GET /api/guests

GET /api/guests/{id}

POST /api/guests

PUT /api/guests/{id}

DELETE /api/guests/{id}

---

## Rooms

GET /api/rooms

GET /api/rooms/{id}

POST /api/rooms

PUT /api/rooms/{id}

---

## Reservations

GET /api/reservations

POST /api/reservations

PUT /api/reservations/{id}

DELETE /api/reservations/{id}

---

## Payments

GET /api/payments

POST /api/payments

GET /api/payments/{id}

---

# Database Design

Guest

- Guest ID
- Full Name
- Email
- Phone Number
- Nationality

Room

- Room ID
- Room Number
- Room Type
- Price Per Night
- Availability

Reservation

- Reservation ID
- Guest ID
- Room ID
- Check-In Date
- Check-Out Date
- Reservation Status

Payment

- Payment ID
- Amount
- Payment Method
- Payment Status

---

# Technologies Used

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Maven
- Swagger

---

# Skills Demonstrated

- Hospitality Systems Development
- Reservation Management
- REST API Design
- Database Relationships
- Payment Tracking
- Enterprise Application Architecture

---

# Future Enhancements

- JWT Authentication
- Online Booking Portal
- Email Notifications
- Loyalty Program
- Dynamic Pricing Engine
- Hotel Analytics Dashboard

---

# Author

Alhanoof Alabdullah
