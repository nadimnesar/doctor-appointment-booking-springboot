package com.drappointment.main.repository;

import com.drappointment.main.model.DoctorClass;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorRepo extends JpaRepository<DoctorClass, Integer> {
    List<DoctorClass> findByEmail(String email);
}