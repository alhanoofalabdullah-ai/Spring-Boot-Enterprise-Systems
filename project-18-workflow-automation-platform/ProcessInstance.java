package com.alhanoof.workflow.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "process_instances")
public class ProcessInstance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String processName;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private String status;

    // Getters and Setters
}
