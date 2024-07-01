package com.nadimnesar.drappointment.repository;

import com.nadimnesar.drappointment.entity.UserClass;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<UserClass, Integer> {
    List<UserClass> findByEmail(String email);
}