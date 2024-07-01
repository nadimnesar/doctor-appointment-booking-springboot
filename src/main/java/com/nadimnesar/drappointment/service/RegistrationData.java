package com.nadimnesar.drappointment.service;

import com.nadimnesar.drappointment.entity.UserClass;
import com.nadimnesar.drappointment.repository.UserRepo;
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
