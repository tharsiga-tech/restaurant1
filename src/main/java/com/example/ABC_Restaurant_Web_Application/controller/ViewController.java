package com.example.ABC_Restaurant_Web_Application.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    @GetMapping("/index")
    public String home1() {
        return "index";
    }

    @GetMapping("/login")
    public String showLoginPage() {
        return "login1";
    }

    @GetMapping("/adminlog")
    public String adminlog() {
        return "adminlog";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login1.html";
    }
}
