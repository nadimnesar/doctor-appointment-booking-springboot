package com.nadimnesar.drappointment.controller;

import com.nadimnesar.drappointment.service.SearchElement;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String rootPage(HttpServletRequest request, Model model) {
        SearchElement searchElement = SearchElement.getInstance();
        model.addAttribute(searchElement);

        String role;
        if(request.isUserInRole("ROLE_ADMIN")) role = "ADMIN";
        else if(request.isUserInRole("ROLE_PATIENT"))  role = "PATIENT";
        else if (request.isUserInRole("ROLE_DOCTOR")) role = "DOCTOR";
        else role = "NO";

        System.out.println(role);

        model.addAttribute("role", role);
        return "index";
    }
}