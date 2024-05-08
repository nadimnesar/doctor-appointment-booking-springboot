package com.drappointment.main.controller;

import com.drappointment.main.service.SearchElement;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String rootPage(Model model) {
        SearchElement searchElement = SearchElement.getInstance();
        model.addAttribute(searchElement);
        return "/index.html";
    }

    @GetMapping("/index.html")
    public String indexPage(Model model) {
        SearchElement searchElement = SearchElement.getInstance();
        model.addAttribute(searchElement);
        return "/index.html";
    }

    @GetMapping("/login.html")
    public String loginPage() {
        return "/login.html";
    }

    @GetMapping("/registration.html")
    public String registrationPage() {
        return "/registration.html";
    }
}