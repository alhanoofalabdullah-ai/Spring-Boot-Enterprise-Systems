# 🚀 Project 17 – Enterprise Notification Center

Enterprise Notification Center built using Spring Boot, Kafka, REST APIs, and Event-Driven Architecture.

---

# Overview

This project provides a centralized communication platform for enterprise applications.

The platform supports:

- Email Notifications
- SMS Notifications
- Push Notifications
- Notification Templates
- Delivery Tracking
- Event-Driven Messaging
- Communication Analytics

---

# Business Scenario

Organizations need reliable communication systems for:

- Customer Notifications
- Order Updates
- Password Resets
- Security Alerts
- Workflow Notifications
- System Announcements

This project demonstrates enterprise messaging architecture.

---

# Architecture

Applications

↓

Kafka Events

↓

Notification Center

↓

Notification Services

├── Email Service

├── SMS Service

└── Push Service

↓

Recipients

---

# Features

## Email Notifications

- Welcome Emails
- Password Reset Emails
- Order Confirmations
- Marketing Campaigns

---

## SMS Notifications

- OTP Messages
- Delivery Updates
- Security Alerts

---

## Push Notifications

- Mobile Notifications
- Real-Time Alerts
- App Announcements

---

## Notification Templates

- Dynamic Templates
- Personalization
- Template Management

---

## Delivery Tracking

- Sent Status
- Delivered Status
- Failed Messages
- Retry Mechanism

---

# API Endpoints

## Notifications

POST /api/notifications/send

GET /api/notifications

GET /api/notifications/{id}

---

## Emails

POST /api/emails/send

---

## SMS

POST /api/sms/send

---

## Push Notifications

POST /api/push/send

---

# Database Design

Notification

- Notification ID
- Channel
- Recipient
- Message
- Status
- Created Date

Notification Template

- Template ID
- Template Name
- Template Type
- Content

Delivery Status

- Delivery ID
- Notification ID
- Status
- Delivery Date

---

# Technologies Used

- Java 21
- Spring Boot
- Spring Kafka
- Spring Data JPA
- MySQL
- Docker
- Maven
- Swagger

---

# Skills Demonstrated

- Event-Driven Architecture
- Kafka Integration
- Notification Systems
- Messaging Platforms
- REST APIs
- Enterprise Communication Systems
- Microservices Communication

---

# Future Enhancements

- RabbitMQ Integration
- WhatsApp Notifications
- Microsoft Teams Integration
- Slack Integration
- AI Smart Messaging
- Notification Analytics Dashboard

---

# Author

Alhanoof Alabdullah
