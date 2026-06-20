package com.alhanoof.hrpayroll.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "payroll")
public class Payroll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long employeeId;

    private Double basicSalary;

    private Double allowances;

    private Double deductions;

    private Double netSalary;

    public Payroll() {
    }

    // Getters and Setters
}
