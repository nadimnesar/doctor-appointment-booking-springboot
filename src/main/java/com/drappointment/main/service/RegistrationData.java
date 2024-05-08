package com.drappointment.main.service;

import com.drappointment.main.model.AdminClass;
import com.drappointment.main.model.DoctorClass;
import com.drappointment.main.model.PatientClass;
import com.drappointment.main.model.UserClass;
import com.drappointment.main.repository.AdminRepo;
import com.drappointment.main.repository.DoctorRepo;
import com.drappointment.main.repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RegistrationData {

    private static PatientRepo patientRepo;
    private static AdminRepo adminRepo;
    private static DoctorRepo doctorRepo;

    @Autowired
    public RegistrationData(PatientRepo patientRepo, AdminRepo adminRepo, DoctorRepo doctorRepo) {
        RegistrationData.patientRepo = patientRepo;
        RegistrationData.adminRepo = adminRepo;
        RegistrationData.doctorRepo = doctorRepo;
    }

    public static boolean validate(UserClass userClass) {
        List<Object> obj = new ArrayList<>();
        obj.addAll(patientRepo.findByEmail(userClass.getEmail()));
        obj.addAll(adminRepo.findByEmail(userClass.getEmail()));
        obj.addAll(doctorRepo.findByEmail(userClass.getEmail()));
        if (obj.isEmpty()) return true;
        return false;
    }

    public static void save(UserClass userClass) {
        String type = userClass.getType();
        if ("patient".equals(type)) {
            PatientClass patientClass = new PatientClass();
            patientClass.setName(userClass.getName());
            patientClass.setEmail(userClass.getEmail());
            patientClass.setPassword(userClass.getPassword());
            patientRepo.save(patientClass);
        } else if ("admin".equals(type)) {
            AdminClass adminClass = new AdminClass();
            adminClass.setName(userClass.getName());
            adminClass.setEmail(userClass.getEmail());
            adminClass.setPassword(userClass.getPassword());
            adminRepo.save(adminClass);
        } else {
            DoctorClass doctorClass = new DoctorClass();
            doctorClass.setName(userClass.getName());
            doctorClass.setEmail(userClass.getEmail());
            doctorClass.setPassword(userClass.getPassword());
            doctorRepo.save(doctorClass);
        }
    }
}
