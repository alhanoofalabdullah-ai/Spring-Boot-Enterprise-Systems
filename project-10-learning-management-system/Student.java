package com.alhanoof.lms.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    @Column(unique = true)
    private String email;

    private String major;

    private Double gpa;

    public Student() {
    }

    public Student(
            String fullName,
            String email,
            String major,
            Double gpa
    ) {
        this.fullName = fullName;
        this.email = email;
        this.major = major;
        this.gpa = gpa;
    }

    // Getters and Setters
}
