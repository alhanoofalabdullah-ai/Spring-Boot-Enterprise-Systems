# 🚀 Project 16 – API Gateway & Service Discovery Platform

Enterprise API Gateway Platform built using Spring Cloud Gateway, Eureka Server, Load Balancing, Rate Limiting, and Monitoring.

---

# Overview

This project demonstrates centralized API management for enterprise microservices.

The platform provides:

- API Gateway
- Service Discovery
- Load Balancing
- Rate Limiting
- Request Logging
- Security Gateway
- Monitoring & Metrics

---

# Business Scenario

Large organizations often operate dozens of microservices.

Challenges include:

- Service Discovery
- Traffic Routing
- Security Enforcement
- Request Monitoring
- API Governance

API Gateway solves these challenges by providing a single entry point.

---

# Architecture

Client

↓

API Gateway

↓

Eureka Discovery Server

↓

Microservices

├── Customer Service

├── Product Service

├── Order Service

└── Payment Service

↓

Databases

---

# Features

## API Gateway

- Centralized Routing
- Request Forwarding
- URL Rewriting
- Header Management

---

## Service Discovery

- Dynamic Registration
- Dynamic Discovery
- Service Health Monitoring

---

## Load Balancing

- Traffic Distribution
- Service Availability
- Fault Tolerance

---

## Security Gateway

- JWT Validation
- Authentication Filters
- Authorization Rules

---

## Monitoring

- Request Metrics
- API Usage Statistics
- Performance Tracking

---

# API Endpoints

## Gateway Routes

/api/customers/**

/api/products/**

/api/orders/**

/api/payments/**

---

## Discovery

/eureka

---

## Monitoring

/actuator/health

/actuator/metrics

/actuator/prometheus

---

# Technologies Used

- Java 21
- Spring Boot
- Spring Cloud Gateway
- Eureka Server
- Spring Security
- Micrometer
- Prometheus
- Grafana
- Docker

---

# Skills Demonstrated

- API Gateway Design
- Service Discovery
- Load Balancing
- Distributed Systems
- Monitoring & Observability
- Cloud Native Architecture
- Enterprise Integration

---

# Future Enhancements

- OAuth2 Integration
- Kubernetes Deployment
- Distributed Tracing
- API Monetization
- Web Application Firewall
- Service Mesh Integration

---

# Author

Alhanoof Alabdullah
