# 🚀 Project 15 – Microservices Order Processing Platform

Enterprise Order Processing Platform built using Spring Boot, Spring Cloud, Eureka, API Gateway, Docker, and Microservices Architecture.

---

# Overview

This project demonstrates a complete enterprise microservices ecosystem.

The platform consists of:

- Customer Service
- Product Service
- Order Service
- Inventory Service
- Notification Service
- API Gateway
- Service Discovery
- Centralized Configuration

---

# Business Scenario

Large organizations require scalable systems capable of handling:

- Customer Management
- Product Catalogs
- Orders
- Inventory
- Notifications

Microservices allow independent deployment and scaling of services.

---

# Architecture

Client

↓

API Gateway

↓

Service Discovery (Eureka)

↓

Microservices

├── Customer Service

├── Product Service

├── Order Service

├── Inventory Service

└── Notification Service

↓

Databases

---

# Components

## API Gateway

Responsibilities:

- Single Entry Point
- Request Routing
- Load Balancing
- Security Integration

---

## Service Discovery

Responsibilities:

- Service Registration
- Service Discovery
- Health Monitoring

---

## Customer Service

Responsibilities:

- Customer Management
- Customer Profiles
- Customer APIs

---

## Product Service

Responsibilities:

- Product Catalog
- Product Search
- Inventory Visibility

---

## Order Service

Responsibilities:

- Order Processing
- Order Status
- Order History

---

## Inventory Service

Responsibilities:

- Inventory Tracking
- Stock Management
- Availability Checks

---

## Notification Service

Responsibilities:

- Email Notifications
- SMS Notifications
- Event Processing

---

# API Endpoints

## Customer Service

GET /api/customers

POST /api/customers

---

## Product Service

GET /api/products

POST /api/products

---

## Order Service

GET /api/orders

POST /api/orders

---

## Inventory Service

GET /api/inventory

PUT /api/inventory

---

## Notification Service

POST /api/notifications

---

# Technologies Used

- Java 21
- Spring Boot
- Spring Cloud
- Eureka Server
- Spring Cloud Gateway
- OpenFeign
- MySQL
- Docker
- Maven

---

# Skills Demonstrated

- Microservices Architecture
- Service Discovery
- API Gateway Design
- Distributed Systems
- Service Communication
- Cloud Native Development
- Enterprise Architecture

---

# Future Enhancements

- Kubernetes Deployment
- Kafka Event Streaming
- Distributed Tracing
- Circuit Breaker
- OAuth2 Security
- CI/CD Pipeline

---

# Author

Alhanoof Alabdullah
