package com.alhanoof.workflow.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "workflows")
public class Workflow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String workflowName;

    private String status;

    private LocalDateTime createdDate;

    // Getters and Setters
}
