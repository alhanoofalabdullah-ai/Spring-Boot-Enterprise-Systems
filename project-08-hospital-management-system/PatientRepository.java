package com.alhanoof.hospital.repository;

import com.alhanoof.hospital.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository
        extends JpaRepository<Patient, Long> {
}
