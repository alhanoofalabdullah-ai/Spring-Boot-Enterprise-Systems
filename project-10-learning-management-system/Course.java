package com.alhanoof.lms.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String courseName;

    private Integer credits;

    private String department;

    public Course() {
    }

    public Course(
            String courseName,
            Integer credits,
            String department
    ) {
        this.courseName = courseName;
        this.credits = credits;
        this.department = department;
    }

    // Getters and Setters
}
