package com.nadimnesar.drappointment.controller;

import com.nadimnesar.drappointment.model.User;
import com.nadimnesar.drappointment.service.UserService;
import jakarta.annotation.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginRegController {

    private final UserService userService;

    public LoginRegController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/registration")
    public String registrationPage() {
        return "registration";
    }

    @GetMapping("/login")
    public String loginPage(@RequestParam @Nullable String loginError, Model model) {
        if (loginError != null && loginError.equals("true")) {
            model.addAttribute("loginError", "This email or password is incorrect!");
        }
        return "login";
    }

    @PostMapping("/registration/addUser")
    public String addUser(@ModelAttribute User user, RedirectAttributes redirectAttributes) {
        if (userService.findUserByUsername(user.getUsername()) != null) {
            redirectAttributes.addFlashAttribute("regError", "This email already exists.");
            return "redirect:/registration";
        }

        userService.saveUser(user);
        redirectAttributes.addFlashAttribute("regSuccess", "Registration successful, login now.");
        return "redirect:/login";
    }
}