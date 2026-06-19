# 🚀 Project 12 – Supply Chain Management Platform

Enterprise Supply Chain Management Platform built using Spring Boot, REST APIs, JPA, and MySQL.

---

# Overview

This project provides a centralized platform for managing end-to-end supply chain operations.

The platform supports:

- Supplier Management
- Purchase Orders
- Warehouse Operations
- Inventory Tracking
- Shipment Management
- Supply Chain Analytics

---

# Business Scenario

Organizations require supply chain visibility to manage:

- Suppliers
- Procurement
- Inventory
- Warehouses
- Logistics
- Deliveries

This project demonstrates enterprise-grade supply chain architecture.

---

# Architecture

Suppliers

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

## Supplier Management

- Register Supplier
- Update Supplier Details
- Supplier Performance Tracking
- Supplier Search

---

## Procurement

- Create Purchase Orders
- Track Orders
- Approve Orders
- Order History

---

## Inventory Management

- Inventory Tracking
- Stock Monitoring
- Reorder Alerts
- Product Availability

---

## Warehouse Management

- Warehouse Tracking
- Storage Locations
- Capacity Monitoring

---

## Shipment Management

- Shipment Tracking
- Delivery Status
- Logistics Monitoring

---

# API Endpoints

## Suppliers

GET /api/suppliers

GET /api/suppliers/{id}

POST /api/suppliers

PUT /api/suppliers/{id}

DELETE /api/suppliers/{id}

---

## Purchase Orders

GET /api/orders

POST /api/orders

PUT /api/orders/{id}

DELETE /api/orders/{id}

---

## Inventory

GET /api/inventory

POST /api/inventory

PUT /api/inventory/{id}

---

## Shipments

GET /api/shipments

POST /api/shipments

GET /api/shipments/{id}

---

# Database Design

Supplier

- Supplier ID
- Supplier Name
- Contact Email
- Phone Number
- Country

Purchase Order

- Order ID
- Supplier ID
- Order Date
- Total Amount
- Status

Inventory

- Product ID
- Product Name
- Quantity
- Reorder Level

Warehouse

- Warehouse ID
- Warehouse Name
- Location

Shipment

- Shipment ID
- Tracking Number
- Delivery Status

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

- Supply Chain Systems
- Procurement Management
- Inventory Management
- Logistics Tracking
- REST API Design
- Database Relationships
- Enterprise Architecture

---

# Future Enhancements

- Vendor Portal
- Demand Forecasting
- AI Inventory Prediction
- RFID Integration
- Transportation Management
- Supply Chain Analytics Dashboard

---

# Author

Alhanoof Alabdullah
