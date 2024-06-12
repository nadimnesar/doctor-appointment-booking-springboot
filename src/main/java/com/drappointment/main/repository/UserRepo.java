package com.drappointment.main.repository;

import com.drappointment.main.model.UserClass;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<UserClass, Integer> {
    List<UserClass> findByEmail(String email);
}