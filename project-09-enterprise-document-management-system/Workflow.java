package com.alhanoof.edms.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "workflows")
public class Workflow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long documentId;

    private String reviewer;

    private String status;

    private String comments;

    // Getters and Setters
}
