package com.alhanoof.hospital.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "doctors")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    private String specialty;

    private String department;

    public Doctor() {
    }

    public Doctor(
            String fullName,
            String specialty,
            String department
    ) {
        this.fullName = fullName;
        this.specialty = specialty;
        this.department = department;
    }

    // Getters and Setters
}
