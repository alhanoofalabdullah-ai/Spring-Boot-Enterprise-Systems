# 🚀 Project 08 – Hospital Management System

Enterprise Hospital Management System built using Spring Boot, REST APIs, JPA, and MySQL.

---

# Overview

This project provides a healthcare management platform for hospitals and medical centers.

The platform supports:

- Patient Management
- Doctor Management
- Appointment Scheduling
- Medical Records
- Billing Management
- Healthcare Operations

---

# Business Scenario

Hospitals need centralized systems to manage:

- Patients
- Doctors
- Appointments
- Medical History
- Billing
- Clinical Operations

This project demonstrates enterprise healthcare application architecture.

---

# Architecture

Patients

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

## Patient Management

- Register Patient
- Update Patient Details
- Patient Search
- Medical History Tracking

---

## Doctor Management

- Doctor Profiles
- Specialty Management
- Availability Tracking

---

## Appointment Management

- Schedule Appointment
- Update Appointment
- Cancel Appointment
- Appointment History

---

## Billing System

- Generate Bills
- Payment Tracking
- Invoice History

---

# API Endpoints

## Patients

GET /api/patients

GET /api/patients/{id}

POST /api/patients

PUT /api/patients/{id}

DELETE /api/patients/{id}

---

## Doctors

GET /api/doctors

POST /api/doctors

GET /api/doctors/{id}

---

## Appointments

GET /api/appointments

POST /api/appointments

PUT /api/appointments/{id}

DELETE /api/appointments/{id}

---

## Billing

GET /api/bills

POST /api/bills

GET /api/bills/{id}

---

# Database Design

Patient

- Patient ID
- Full Name
- Date Of Birth
- Gender
- Phone Number
- Medical History

Doctor

- Doctor ID
- Full Name
- Specialty
- Department

Appointment

- Appointment ID
- Appointment Date
- Status

Bill

- Bill ID
- Amount
- Payment Status

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

- Healthcare Systems Development
- REST API Design
- Database Relationships
- Appointment Scheduling
- Billing Management
- Enterprise Architecture

---

# Future Enhancements

- JWT Authentication
- Electronic Medical Records (EMR)
- Prescription Management
- Laboratory Integration
- Insurance Management
- Healthcare Analytics

---

# Author

Alhanoof Alabdullah
