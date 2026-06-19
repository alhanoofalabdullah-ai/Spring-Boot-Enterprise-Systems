package com.alhanoof.eam.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "assets")
public class Asset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String assetName;

    private String assetCategory;

    private Double purchaseCost;

    private LocalDate purchaseDate;

    private String assetStatus;

    public Asset() {
    }

    // Getters and Setters
}
