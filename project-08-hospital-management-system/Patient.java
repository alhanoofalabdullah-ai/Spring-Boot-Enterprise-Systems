package com.alhanoof.hospital.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    private String dateOfBirth;

    private String gender;

    private String phoneNumber;

    @Column(length = 2000)
    private String medicalHistory;

    public Patient() {
    }

    public Patient(
            String fullName,
            String dateOfBirth,
            String gender,
            String phoneNumber,
            String medicalHistory
    ) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.medicalHistory = medicalHistory;
    }

    // Getters and Setters
}
