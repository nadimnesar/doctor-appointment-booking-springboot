package com.drappointment.main.controller;

import com.drappointment.main.model.AdminClass;
import com.drappointment.main.model.DoctorClass;
import com.drappointment.main.model.PatientClass;
import com.drappointment.main.service.LoginData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @PostMapping("/loginuser")
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model) {
        AdminClass adminClass = LoginData.validateAdmin(email, password);
        if (adminClass != null) {
            return "redirect:/";
        }

        DoctorClass doctorClass = LoginData.validateDoctor(email, password);
        if (doctorClass != null) {
            return "redirect:/";
        }

        PatientClass patientClass = LoginData.validatePatient(email, password);
        if (patientClass != null) {
            return "redirect:/";
        }

        model.addAttribute("loginerror", "This email or password is incorrect!");
        return "/login.html";
    }
}