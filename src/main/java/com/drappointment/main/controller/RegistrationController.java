package com.drappointment.main.controller;

import com.drappointment.main.model.UserClass;
import com.drappointment.main.service.RegistrationData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RegistrationController {
    @PostMapping("/adduser")
    public String addUser(@ModelAttribute UserClass userClass, RedirectAttributes redirectAttributes) {
        if (!RegistrationData.validate(userClass)) {
            redirectAttributes.addFlashAttribute("regerror", "This email already exists.");
            return "redirect:/registration";
        }
        RegistrationData.save(userClass);
        redirectAttributes.addFlashAttribute("regsuccess", "Registration successful, login now.");
        return "redirect:/login";
    }
}