package com.alhanoof.eam.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "asset_audits")
public class AssetAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long assetId;

    private LocalDate auditDate;

    private String auditResult;

    public AssetAudit() {
    }

    // Getters and Setters
}
