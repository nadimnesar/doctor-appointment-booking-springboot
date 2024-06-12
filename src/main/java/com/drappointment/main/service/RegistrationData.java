package com.drappointment.main.service;

import com.drappointment.main.model.UserClass;
import com.drappointment.main.repository.UserRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RegistrationData {

    private static UserRepo userRepo;

    public RegistrationData(UserRepo userRepo) {
        RegistrationData.userRepo = userRepo;
    }

    public static boolean validate(UserClass userClass) {
        List<Object> obj = new ArrayList<>();
        obj.addAll(userRepo.findByEmail(userClass.getEmail()));
        if (obj.isEmpty()) return true;
        return false;
    }

    public static void save(UserClass userClass) {
        userRepo.save(userClass);
    }
}
