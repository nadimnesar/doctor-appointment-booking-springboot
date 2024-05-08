package com.drappointment.main.repository;

import com.drappointment.main.model.PatientClass;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepo extends JpaRepository<PatientClass, Integer> {
    List<PatientClass> findByEmail(String email);
}