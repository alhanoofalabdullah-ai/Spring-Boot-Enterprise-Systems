# 🚀 Project 04 – Task Management Platform

Enterprise Task Management Platform built using Spring Boot, REST APIs, MySQL, and Workflow Management principles.

---

# Overview

This project provides a centralized task management platform for teams and organizations.

The system allows users to:

- Create Tasks
- Assign Tasks
- Track Progress
- Update Status
- Monitor Deadlines
- Generate Productivity Reports

---

# Business Scenario

Organizations need an efficient platform for:

- Team Collaboration
- Task Assignment
- Project Tracking
- Productivity Monitoring
- Workload Management

This project demonstrates enterprise-grade task management architecture.

---

# Architecture

Users

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

## Task Management

- Create Task
- Update Task
- Delete Task
- View Task Details

---

## Assignment Management

- Assign Users
- Change Ownership
- Track Responsibility

---

## Status Workflow

Available Statuses:

- New
- In Progress
- Pending Review
- Completed
- Cancelled

---

## Priority Levels

- Low
- Medium
- High
- Critical

---

# API Endpoints

GET /api/tasks

GET /api/tasks/{id}

POST /api/tasks

PUT /api/tasks/{id}

DELETE /api/tasks/{id}

GET /api/tasks/status/{status}

GET /api/tasks/priority/{priority}

---

# Database Design

Task

- Task ID
- Title
- Description
- Assigned User
- Priority
- Status
- Due Date
- Created Date

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

- Task Management Systems
- Workflow Design
- REST API Development
- Database Design
- Enterprise Architecture
- Spring Boot Development
- Productivity Systems

---

# Future Enhancements

- JWT Authentication
- Notifications
- Email Alerts
- Dashboard Analytics
- Team Management
- Kanban Board

---

# Author

Alhanoof Alabdullah
