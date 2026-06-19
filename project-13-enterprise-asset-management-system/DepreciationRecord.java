package com.alhanoof.eam.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "depreciation_records")
public class DepreciationRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long assetId;

    private Double depreciationAmount;

    private Double currentValue;

    public DepreciationRecord() {
    }

    // Getters and Setters
}
