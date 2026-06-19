package com.alhanoof.hospital.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime appointmentDate;

    private String status;

    public Appointment() {
    }

    public Appointment(
            LocalDateTime appointmentDate,
            String status
    ) {
        this.appointmentDate = appointmentDate;
        this.status = status;
    }

    // Getters and Setters
}
