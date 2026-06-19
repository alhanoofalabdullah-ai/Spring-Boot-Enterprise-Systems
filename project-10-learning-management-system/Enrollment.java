package com.alhanoof.lms.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "enrollments")
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long studentId;

    private Long courseId;

    public Enrollment() {
    }

    public Enrollment(
            Long studentId,
            Long courseId
    ) {
        this.studentId = studentId;
        this.courseId = courseId;
    }

    // Getters and Setters
}
