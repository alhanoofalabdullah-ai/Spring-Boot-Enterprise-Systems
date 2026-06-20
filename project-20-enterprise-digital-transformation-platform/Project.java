package com.alhanoof.digitaltransformation.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String projectName;

    private String projectStatus;

    private LocalDate startDate;

    private LocalDate endDate;

    // Getters and Setters
}
