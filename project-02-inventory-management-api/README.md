# Project 02 – Inventory Management API

Enterprise Inventory Management API built using Spring Boot, REST APIs, Spring Data JPA, and MySQL.

---

# Overview

This project provides backend APIs for managing product inventory in an enterprise environment.

The system supports:

- Add Products
- View Products
- Update Product Details
- Delete Products
- Track Stock Quantity
- Monitor Low Stock Items
- Manage Product Categories

---

# Business Scenario

Companies need accurate inventory visibility to manage:

- Products
- Stock Levels
- Warehouses
- Product Categories
- Reorder Points
- Inventory Availability

This project demonstrates a scalable backend inventory API.

---

# Architecture

Client

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

# API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/products` | Get all products |
| GET | `/api/products/{id}` | Get product by ID |
| POST | `/api/products` | Create product |
| PUT | `/api/products/{id}` | Update product |
| DELETE | `/api/products/{id}` | Delete product |
| GET | `/api/products/low-stock` | Get low stock products |

---

# Technologies Used

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Maven

---

# Skills Demonstrated

- REST API Development
- Inventory System Design
- Database Integration
- CRUD Operations
- Service Layer Pattern
- Repository Pattern
- Enterprise Backend Development

---

# Author

Alhanoof Alabdullah
