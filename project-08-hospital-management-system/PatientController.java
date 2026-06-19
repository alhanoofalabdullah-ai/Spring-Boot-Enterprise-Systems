package com.alhanoof.hospital.controller;

import com.alhanoof.hospital.entity.Patient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    @GetMapping
    public List<Patient> getPatients() {
        return List.of();
    }

    @PostMapping
    public String createPatient(
            @RequestBody Patient patient
    ) {
        return "Patient Created Successfully";
    }
}
