package com.alhanoof.taskmanager.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private String assignedUser;

    private String priority;

    private String status;

    private LocalDate dueDate;

    private LocalDate createdDate;

    public Task() {
    }

    public Task(
            String title,
            String description,
            String assignedUser,
            String priority,
            String status,
            LocalDate dueDate,
            LocalDate createdDate
    ) {
        this.title = title;
        this.description = description;
        this.assignedUser = assignedUser;
        this.priority = priority;
        this.status = status;
        this.dueDate = dueDate;
        this.createdDate = createdDate;
    }

    // Getters and Setters
}
