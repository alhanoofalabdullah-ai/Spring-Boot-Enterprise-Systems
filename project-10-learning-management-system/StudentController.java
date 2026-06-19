package com.alhanoof.lms.controller;

import com.alhanoof.lms.entity.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @GetMapping
    public List<Student> getStudents() {
        return List.of();
    }

    @PostMapping
    public String createStudent(
            @RequestBody Student student
    ) {
        return "Student Created Successfully";
    }
}
