package com.alhanoof.analytics.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "dashboards")
public class Dashboard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dashboardName;

    private String dashboardType;

    // Getters and Setters
}
