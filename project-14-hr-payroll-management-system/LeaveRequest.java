package com.alhanoof.hrpayroll.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "leave_requests")
public class LeaveRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long employeeId;

    private String leaveType;

    private LocalDate startDate;

    private LocalDate endDate;

    private String status;

    public LeaveRequest() {
    }

    // Getters and Setters
}
