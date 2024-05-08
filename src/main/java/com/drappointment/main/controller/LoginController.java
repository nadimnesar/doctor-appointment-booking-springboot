package com.drappointment.main.controller;

import com.drappointment.main.model.AdminClass;
import com.drappointment.main.model.DoctorClass;
import com.drappointment.main.model.PatientClass;
import com.drappointment.main.service.LoginData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {
    @PostMapping("/loginuser")
    public String loginUser(@RequestParam("email") String email,
                            @RequestParam("password") String password, RedirectAttributes redirectAttributes) {

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

        redirectAttributes.addFlashAttribute("loginerror", "This email or password is incorrect!");
        return "redirect:/login";
    }
}