package com.alhanoof.digitaltransformation.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "documents")
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String documentNumber;

    private String revision;

    private String status;

    // Getters and Setters
}
