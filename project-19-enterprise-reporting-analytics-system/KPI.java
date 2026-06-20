package com.alhanoof.analytics.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "kpis")
public class KPI {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String kpiName;

    private Double kpiValue;

    private Double targetValue;

    // Getters and Setters
}
