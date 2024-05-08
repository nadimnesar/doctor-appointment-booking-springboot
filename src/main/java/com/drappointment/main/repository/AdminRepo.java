package com.drappointment.main.repository;

import com.drappointment.main.model.AdminClass;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdminRepo extends JpaRepository<AdminClass, Integer> {
    List<AdminClass> findByEmail(String email);
}