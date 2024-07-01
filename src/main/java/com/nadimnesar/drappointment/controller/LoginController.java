package com.nadimnesar.drappointment.controller;

import com.nadimnesar.drappointment.service.LoginData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {
    @PostMapping("/loginUser")
    public String loginUser(@RequestParam String email,
                            @RequestParam String password, RedirectAttributes redirectAttributes) {

        boolean status = LoginData.validateUser(email, password);
        if (status) {
            return "redirect:/";
        } else {
            redirectAttributes.addFlashAttribute("loginError", "This email or password is incorrect!");
            return "redirect:/login";
        }
    }
}