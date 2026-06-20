package com.alhanoof.notification.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "notification_templates")
public class NotificationTemplate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String templateName;

    private String templateType;

    @Column(length = 5000)
    private String content;

    // Getters and Setters
}
