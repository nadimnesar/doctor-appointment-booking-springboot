package com.nadimnesar.drappointment.service;

import com.nadimnesar.drappointment.entity.UserClass;
import com.nadimnesar.drappointment.repository.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginData {
    public static UserRepo userRepo;

    public LoginData(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public static boolean validateUser(String email, String password) {
        List<UserClass> userClassList = userRepo.findByEmail(email);
        if (userClassList.isEmpty()) return false;
        if (userClassList.get(0).getPassword().equals(password)) return true;
        return false;
    }
}