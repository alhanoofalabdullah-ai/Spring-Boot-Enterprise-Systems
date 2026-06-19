package com.alhanoof.eam.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "maintenance_records")
public class MaintenanceRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long assetId;

    private String maintenanceType;

    private LocalDate scheduledDate;

    private String status;

    public MaintenanceRecord() {
    }

    // Getters and Setters
}
