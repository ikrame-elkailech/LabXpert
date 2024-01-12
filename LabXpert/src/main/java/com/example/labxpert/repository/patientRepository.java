package com.example.labxpert.repository;

import com.example.labxpert.entities.patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface patientRepository extends JpaRepository<patient, Integer> {
}
