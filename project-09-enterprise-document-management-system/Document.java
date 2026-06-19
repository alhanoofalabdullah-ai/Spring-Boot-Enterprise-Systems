package com.alhanoof.edms.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "documents")
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String documentName;

    private String version;

    private String status;

    private String uploadedBy;

    private LocalDateTime uploadDate;

    public Document() {
    }

    public Document(
            String documentName,
            String version,
            String status,
            String uploadedBy,
            LocalDateTime uploadDate
    ) {
        this.documentName = documentName;
        this.version = version;
        this.status = status;
        this.uploadedBy = uploadedBy;
        this.uploadDate = uploadDate;
    }

    // Getters and Setters
}
