package com.alhanoof.lms.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "instructors")
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    private String specialty;

    public Instructor() {
    }

    public Instructor(
            String fullName,
            String specialty
    ) {
        this.fullName = fullName;
        this.specialty = specialty;
    }

    // Getters and Setters
}
