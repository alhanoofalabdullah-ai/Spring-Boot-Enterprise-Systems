package com.alhanoof.notification.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "notifications")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String channel;

    private String recipient;

    private String subject;

    private String message;

    private String status;

    private LocalDateTime createdDate;

    // Getters and Setters
}
