package com.nadimnesar.drappointment.controller;

import com.nadimnesar.drappointment.entity.UserClass;
import com.nadimnesar.drappointment.service.RegistrationData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RegistrationController {
    @PostMapping("/addUser")
    public String addUser(@ModelAttribute UserClass userClass, RedirectAttributes redirectAttributes) {
        if (!RegistrationData.validate(userClass)) {
            redirectAttributes.addFlashAttribute("regError", "This email already exists.");
            return "redirect:/registration";
        }
        RegistrationData.save(userClass);
        redirectAttributes.addFlashAttribute("regSuccess", "Registration successful, login now.");
        return "redirect:/login";
    }
}