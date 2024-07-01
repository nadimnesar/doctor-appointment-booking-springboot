package com.nadimnesar.drappointment.controller;

import com.nadimnesar.drappointment.service.SearchElement;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String rootPage(Model model) {
        SearchElement searchElement = SearchElement.getInstance();
        model.addAttribute(searchElement);
        return "/index";
    }

    @GetMapping("/index")
    public String indexPage(Model model) {
        SearchElement searchElement = SearchElement.getInstance();
        model.addAttribute(searchElement);
        return "/index";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "/login";
    }

    @GetMapping("/registration")
    public String registrationPage() {
        return "/registration";
    }
}