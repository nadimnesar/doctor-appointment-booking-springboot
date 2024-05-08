package com.drappointment.main.service;

import com.drappointment.main.model.AdminClass;
import com.drappointment.main.model.DoctorClass;
import com.drappointment.main.model.PatientClass;
import com.drappointment.main.repository.AdminRepo;
import com.drappointment.main.repository.DoctorRepo;
import com.drappointment.main.repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginData {
    private static PatientRepo patientRepo;
    private static AdminRepo adminRepo;
    private static DoctorRepo doctorRepo;

    @Autowired
    public LoginData(PatientRepo patientRepo, AdminRepo adminRepo, DoctorRepo doctorRepo) {
        this.patientRepo = patientRepo;
        this.adminRepo = adminRepo;
        this.doctorRepo = doctorRepo;
    }

    public static PatientClass validatePatient(String email, String password) {
        List<PatientClass> patientClassList = patientRepo.findByEmail(email);
        if (patientClassList.isEmpty()) return null;
        if (patientClassList.get(0).getPassword().equals(password)) return patientClassList.get(0);
        return null;
    }

    public static DoctorClass validateDoctor(String email, String password) {
        List<DoctorClass> doctorClassList = doctorRepo.findByEmail(email);
        if (doctorClassList.isEmpty()) return null;
        if (doctorClassList.get(0).getPassword().equals(password)) return doctorClassList.get(0);
        return null;
    }

    public static AdminClass validateAdmin(String email, String password) {
        List<AdminClass> adminClassList = adminRepo.findByEmail(email);
        if (adminClassList.isEmpty()) return null;
        if (adminClassList.get(0).getPassword().equals(password)) return adminClassList.get(0);
        return null;
    }
}