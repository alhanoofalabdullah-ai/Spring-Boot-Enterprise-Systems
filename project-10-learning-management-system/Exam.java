package com.alhanoof.lms.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "exams")
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long studentId;

    private Long courseId;

    private Double score;

    public Exam() {
    }

    public Exam(
            Long studentId,
            Long courseId,
            Double score
    ) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.score = score;
    }

    // Getters and Setters
}
