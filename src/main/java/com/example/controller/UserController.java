package com.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class UserController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Hello, Spring Boot with HTML and CSS!");
        return "index";
    }
}

