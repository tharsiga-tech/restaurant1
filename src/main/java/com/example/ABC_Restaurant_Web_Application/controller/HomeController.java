package com.example.ABC_Restaurant_Web_Application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "redirect:/home1.html";
    }

    @GetMapping("/about")
    public String about() {
        return "redirect:/About.html";
    }

    @GetMapping("/contact")
    public String contact() {
        return "redirect:/contact.html";
    }

    @GetMapping("/menu")
    public String menu() {
        return "redirect:/menu.html";
    }

    @GetMapping("/services")
    public String services() {
        return "redirect:/services.html";
    }

    @GetMapping("/gallery")
    public String gallery() {
        return "redirect:/gallery.html";
    }

    @GetMapping("/userlogin")
    public String userlogin() {
        return "redirect:/userlogin1.html";
    }

    @GetMapping("/feedback")
    public String feedback() {
        return "redirect:/feedback.html";
    }

//    @GetMapping("/adminlog")
//    public String adminlog() {
//        return "redirect:/adminlog.html";
//    }

    @GetMapping("/stafflogin")
    public String stafflog() {
        return "redirect:/stafflogin.html";
    }

    @GetMapping("/customerregister")
    public String customerregister() {
        return "redirect:/customerregister.html";
    }

    @GetMapping("/tablereservation")
    public String table() {
        return "redirect:/tablereservation.html";
    }

    @GetMapping("/log")
    public String login() {
        return "redirect:/login.html";
    }

    @GetMapping("/reservation")
    public String reservation() {
        return "redirect:/makereservation.html";
    }

    @GetMapping("/deliveryorder")
    public String delivery() {
        return "redirect:/deliveryorder.html";
    }

    @GetMapping("/admin")
    public String admin() {
        return "redirect:/adminpage.html";
    }

    @GetMapping("/staff")
    public String staff() {
        return "redirect:/staffpanel.html";
    }

    @PostMapping("/adminlogin")
    public String adminLogin(@RequestParam String username, @RequestParam String password, Model model) {
        // Authentication logic here
        if ("Tharsi".equals(username) && "12345678".equals(password)) {
            return "redirect:/adminpage";
        }
        model.addAttribute("error", "Invalid username or password");
        return "adminlog";
    }



}
