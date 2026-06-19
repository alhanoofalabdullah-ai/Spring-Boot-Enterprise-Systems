# 🚀 Project 14 – HR & Payroll Management System

Enterprise HR & Payroll Management System built using Spring Boot, REST APIs, JPA, and MySQL.

---

# Overview

This project provides a centralized Human Resources and Payroll platform for organizations.

The platform supports:

- Employee Management
- Payroll Processing
- Attendance Tracking
- Leave Management
- Benefits Administration
- HR Reporting
- Workforce Analytics

---

# Business Scenario

Organizations need integrated HR systems to manage:

- Employees
- Salaries
- Attendance
- Leave Requests
- Benefits
- Workforce Performance

This project demonstrates enterprise HR architecture and payroll automation.

---

# Architecture

Employees

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

## Employee Management

- Register Employees
- Update Employee Records
- Department Assignment
- Employee Search

---

## Payroll Management

- Salary Processing
- Overtime Calculation
- Deductions
- Payroll Reports

---

## Leave Management

- Annual Leave
- Sick Leave
- Emergency Leave
- Leave Approval Workflow

---

## Attendance Tracking

- Check-In
- Check-Out
- Attendance Reports
- Late Arrival Tracking

---

## Benefits Management

- Medical Insurance
- Housing Allowance
- Transportation Allowance
- Employee Benefits Tracking

---

# API Endpoints

## Employees

GET /api/employees

GET /api/employees/{id}

POST /api/employees

PUT /api/employees/{id}

DELETE /api/employees/{id}

---

## Payroll

GET /api/payroll

POST /api/payroll/process

GET /api/payroll/{employeeId}

---

## Attendance

GET /api/attendance

POST /api/attendance/check-in

POST /api/attendance/check-out

---

## Leave Requests

GET /api/leaves

POST /api/leaves

PUT /api/leaves/{id}/approve

PUT /api/leaves/{id}/reject

---

# Database Design

Employee

- Employee ID
- Full Name
- Department
- Position
- Salary
- Hire Date

Payroll

- Payroll ID
- Employee ID
- Basic Salary
- Allowances
- Deductions
- Net Salary

Attendance

- Attendance ID
- Employee ID
- Check-In Time
- Check-Out Time

Leave Request

- Leave ID
- Employee ID
- Leave Type
- Start Date
- End Date
- Status

Benefit

- Benefit ID
- Benefit Type
- Amount

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

- Human Resources Systems
- Payroll Automation
- Attendance Tracking
- Leave Management
- REST API Development
- Database Relationships
- Enterprise HR Architecture

---

# Future Enhancements

- JWT Authentication
- Employee Self-Service Portal
- Performance Management
- Recruitment Module
- Integration with Oracle HCM
- Power BI HR Dashboard

---

# Author

Alhanoof Alabdullah
