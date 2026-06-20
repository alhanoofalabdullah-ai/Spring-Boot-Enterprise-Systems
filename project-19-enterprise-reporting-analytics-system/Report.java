package com.alhanoof.analytics.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "reports")
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String reportName;

    private String reportType;

    private LocalDateTime generatedDate;

    // Getters and Setters
}
