package com.drappointment.main.controller;

import com.drappointment.main.model.UserClass;
import com.drappointment.main.service.RegistrationData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
    @PostMapping("/adduser")
    public String addUser(@ModelAttribute UserClass userClass, Model model) {
        if (!RegistrationData.validate(userClass)) {
            model.addAttribute("regerror", "This email already exists");
            return "/registration.html";
        }
        RegistrationData.save(userClass);
        return "redirect:/login.html";
    }
}