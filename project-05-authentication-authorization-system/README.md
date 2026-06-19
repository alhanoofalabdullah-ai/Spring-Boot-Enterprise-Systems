# 🚀 Project 05 – Authentication & Authorization System

Enterprise Authentication and Authorization System built using Spring Boot, Spring Security, JWT, RBAC, and MySQL.

---

# Overview

This project provides enterprise-grade authentication and authorization capabilities.

The system allows:

- User Registration
- User Login
- JWT Authentication
- Role Management
- Authorization Control
- Secure REST APIs

---

# Business Scenario

Every enterprise application requires:

- User Authentication
- Identity Management
- Access Control
- Secure APIs
- Permission Management

This project demonstrates modern enterprise security architecture.

---

# Architecture

Client

↓

Authentication API

↓

Spring Security

↓

JWT Token Validation

↓

Role Based Access Control

↓

MySQL Database

---

# Features

## Authentication

- User Registration
- User Login
- Password Encryption
- JWT Generation

---

## Authorization

Roles:

- ADMIN
- MANAGER
- USER

---

## Security

- BCrypt Password Encoding
- JWT Authentication
- Stateless Sessions
- Protected Endpoints

---

# API Endpoints

## Authentication APIs

POST /api/auth/register

POST /api/auth/login

---

## User APIs

GET /api/users

GET /api/users/{id}

DELETE /api/users/{id}

---

# Database Design

User

- User ID
- Username
- Email
- Password
- Role
- Created Date

Role

- Role ID
- Role Name

---

# Technologies Used

- Java 21
- Spring Boot
- Spring Security
- JWT
- Spring Data JPA
- MySQL
- Maven

---

# Skills Demonstrated

- Authentication Design
- Authorization Design
- JWT Security
- Spring Security
- Password Encryption
- Secure API Development
- Enterprise Security Architecture

---

# Future Enhancements

- Refresh Tokens
- Multi-Factor Authentication (MFA)
- OAuth2
- SSO Integration
- Audit Logging
- API Rate Limiting

---

# Author

Alhanoof Alabdullah
