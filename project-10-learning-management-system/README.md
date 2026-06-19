# 🚀 Project 10 – Learning Management System (LMS)

Enterprise Learning Management System built using Spring Boot, REST APIs, JPA, and MySQL.

---

# Overview

This project provides a centralized education platform for managing students, courses, instructors, enrollments, and assessments.

The platform supports:

- Student Management
- Course Management
- Instructor Management
- Enrollment Processing
- Exam Management
- Progress Tracking
- Academic Reporting

---

# Business Scenario

Educational institutions need systems to manage:

- Students
- Courses
- Instructors
- Assessments
- Learning Progress
- Academic Performance

This project demonstrates enterprise-level LMS architecture.

---

# Architecture

Students

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

## Student Management

- Register Students
- Update Profiles
- Track Progress
- Academic Records

---

## Course Management

- Create Courses
- Assign Instructors
- Course Enrollment
- Course Catalog

---

## Instructor Management

- Instructor Profiles
- Course Assignments
- Teaching Schedule

---

## Enrollment Management

- Student Registration
- Course Enrollment
- Enrollment History

---

## Exam Management

- Create Exams
- Record Scores
- Generate Results
- Progress Evaluation

---

# API Endpoints

## Students

GET /api/students

GET /api/students/{id}

POST /api/students

PUT /api/students/{id}

DELETE /api/students/{id}

---

## Courses

GET /api/courses

POST /api/courses

PUT /api/courses/{id}

DELETE /api/courses/{id}

---

## Enrollments

POST /api/enrollments

GET /api/enrollments

---

## Exams

POST /api/exams

GET /api/exams

GET /api/exams/results/{studentId}

---

# Database Design

Student

- Student ID
- Full Name
- Email
- Major
- GPA

Course

- Course ID
- Course Name
- Credits
- Department

Instructor

- Instructor ID
- Full Name
- Specialty

Enrollment

- Enrollment ID
- Student ID
- Course ID

Exam

- Exam ID
- Course ID
- Student ID
- Score

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

- Education Systems Development
- REST API Design
- Database Relationships
- Academic Management
- Enterprise Architecture
- Backend Development

---

# Future Enhancements

- JWT Authentication
- Online Learning Portal
- Video Integration
- Assignment Submission
- Certificates Generation
- AI-Based Learning Analytics

---

# Author

Alhanoof Alabdullah
