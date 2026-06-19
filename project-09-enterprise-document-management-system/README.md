# 🚀 Project 09 – Enterprise Document Management System

Enterprise Document Management System (EDMS) built using Spring Boot, REST APIs, MySQL, and Workflow Automation.

---

# Overview

This project provides a centralized platform for managing enterprise documents.

The platform supports:

- Document Upload
- Document Download
- Version Control
- Approval Workflow
- Metadata Management
- Audit Trail
- Search Functionality

---

# Business Scenario

Organizations manage thousands of documents daily including:

- Contracts
- Policies
- Procedures
- Technical Documents
- Project Files
- Compliance Records

An EDMS helps control document lifecycle and governance.

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

↓

File Storage

---

# Features

## Document Management

- Upload Documents
- Download Documents
- Delete Documents
- Search Documents

---

## Version Control

- Version Tracking
- Revision History
- Change Management

---

## Approval Workflow

Statuses:

- Draft
- Submitted
- Under Review
- Approved
- Rejected

---

## Audit Trail

Tracks:

- User Actions
- Document Changes
- Approval Activities
- Download History

---

# API Endpoints

## Documents

GET /api/documents

GET /api/documents/{id}

POST /api/documents/upload

DELETE /api/documents/{id}

---

## Workflow

POST /api/workflow/submit

POST /api/workflow/approve

POST /api/workflow/reject

GET /api/workflow/history

---

## Audit

GET /api/audit/logs

GET /api/audit/document/{id}

---

# Database Design

Document

- Document ID
- Document Name
- Version
- Status
- Upload Date
- Uploaded By

Workflow

- Workflow ID
- Document ID
- Status
- Reviewer
- Comments

Audit Log

- Audit ID
- Action
- User
- Timestamp

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

- Enterprise Content Management
- Document Control
- Workflow Automation
- Version Control
- Audit Trail Design
- REST API Development
- Enterprise Architecture

---

# Future Enhancements

- JWT Authentication
- SharePoint Integration
- Aconex Integration
- OCR Processing
- Electronic Signatures
- Document Classification AI

---

# Author

Alhanoof Alabdullah
