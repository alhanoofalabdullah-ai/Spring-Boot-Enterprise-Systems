package com.alhanoof.hrpayroll.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    private String department;

    private String position;

    private Double salary;

    private LocalDate hireDate;

    public Employee() {
    }

    // Getters and Setters
}
