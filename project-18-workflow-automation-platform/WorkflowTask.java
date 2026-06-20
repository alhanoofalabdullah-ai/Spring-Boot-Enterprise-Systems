package com.alhanoof.workflow.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "workflow_tasks")
public class WorkflowTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String taskName;

    private String assignedUser;

    private String status;

    // Getters and Setters
}
