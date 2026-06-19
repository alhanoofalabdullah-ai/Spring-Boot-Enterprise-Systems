package com.alhanoof.lms.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @GetMapping
    public String getCourses() {
        return "Courses Retrieved Successfully";
    }
}
