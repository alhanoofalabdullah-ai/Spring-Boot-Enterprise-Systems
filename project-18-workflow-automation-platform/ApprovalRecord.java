package com.alhanoof.workflow.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "approval_records")
public class ApprovalRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String approver;

    private String decision;

    private String comments;

    // Getters and Setters
}
