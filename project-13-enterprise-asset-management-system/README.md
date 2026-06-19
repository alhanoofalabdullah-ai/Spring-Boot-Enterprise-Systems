# 🚀 Project 13 – Enterprise Asset Management System

Enterprise Asset Management (EAM) System built using Spring Boot, REST APIs, JPA, and MySQL.

---

# Overview

This project provides a centralized platform for managing enterprise assets throughout their lifecycle.

The platform supports:

- Asset Registration
- Asset Tracking
- Maintenance Scheduling
- Asset Depreciation
- Asset Auditing
- Lifecycle Management
- Reporting & Analytics

---

# Business Scenario

Organizations manage thousands of physical and digital assets including:

- Computers
- Servers
- Vehicles
- Machinery
- Network Equipment
- Office Equipment

Effective asset management helps reduce costs and improve operational efficiency.

---

# Architecture

Assets

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

## Asset Management

- Register Assets
- Update Asset Information
- Asset Search
- Asset Disposal

---

## Maintenance Management

- Preventive Maintenance
- Corrective Maintenance
- Maintenance History
- Work Orders

---

## Asset Depreciation

- Straight Line Method
- Depreciation Tracking
- Asset Valuation

---

## Asset Auditing

- Physical Verification
- Audit Reports
- Compliance Tracking

---

# API Endpoints

## Assets

GET /api/assets

GET /api/assets/{id}

POST /api/assets

PUT /api/assets/{id}

DELETE /api/assets/{id}

---

## Maintenance

GET /api/maintenance

POST /api/maintenance

PUT /api/maintenance/{id}

---

## Depreciation

GET /api/depreciation

POST /api/depreciation/calculate

---

## Audits

GET /api/audits

POST /api/audits

---

# Database Design

Asset

- Asset ID
- Asset Name
- Asset Category
- Purchase Date
- Purchase Cost
- Asset Status

Maintenance Record

- Maintenance ID
- Asset ID
- Maintenance Type
- Scheduled Date
- Status

Depreciation Record

- Record ID
- Asset ID
- Current Value
- Depreciation Amount

Asset Audit

- Audit ID
- Asset ID
- Audit Date
- Audit Result

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

- Enterprise Asset Management
- Asset Lifecycle Management
- Maintenance Tracking
- Financial Asset Control
- REST API Development
- Database Relationships
- Enterprise Operations Architecture

---

# Future Enhancements

- QR Code Tracking
- RFID Integration
- Predictive Maintenance
- Mobile Asset Tracking
- Power BI Dashboard
- SAP Asset Integration

---

# Author

Alhanoof Alabdullah
