package com.alhanoof.hrpayroll.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "attendance")
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long employeeId;

    private LocalDateTime checkInTime;

    private LocalDateTime checkOutTime;

    public Attendance() {
    }

    // Getters and Setters
}
