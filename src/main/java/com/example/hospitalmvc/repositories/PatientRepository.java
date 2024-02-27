package com.example.hospitalmvc.repositories;

import com.example.hospitalmvc.entites.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
