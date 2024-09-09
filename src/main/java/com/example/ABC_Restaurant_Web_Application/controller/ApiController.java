package com.example.ABC_Restaurant_Web_Application.controller;

import com.example.ABC_Restaurant_Web_Application.model.AdminUser;
import com.example.ABC_Restaurant_Web_Application.model.Staff;
import com.example.ABC_Restaurant_Web_Application.model.Users;
import com.example.ABC_Restaurant_Web_Application.repository.AdminUserRepository;
import com.example.ABC_Restaurant_Web_Application.repository.StaffRepository;
import com.example.ABC_Restaurant_Web_Application.repository.UsersRepository;
import com.example.ABC_Restaurant_Web_Application.utils.PasswordUtils;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@RequestMapping("/api")
@RestController
public class ApiController {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private AdminUserRepository adminUserRepository;

    @Autowired
    private StaffRepository staffRepository;

    @PostMapping("register")
    public RedirectView register(@ModelAttribute Users users, HttpSession session) {
        users.setPassword(PasswordUtils.hashPassword(users.getPassword()));
        usersRepository.save(users);
        session.setAttribute("message", "User Registration Successful!");

        return new RedirectView("/login");
    }

    @PostMapping("login")
    public RedirectView login(@RequestParam String email, @RequestParam String password, HttpSession session) {
        Users users = usersRepository.findByEmail(email);
        if (users == null) {
            session.setAttribute("error", "Invalid email or password!");
            return new RedirectView("/login");
        }

        boolean isValid = PasswordUtils.checkPassword(password, users.getPassword());
        if (isValid) {
            session.setAttribute("user", users);
            session.setAttribute("message", "Login Successful!");

            return new RedirectView("/reservation");
        } else {
            session.setAttribute("error", "Invalid email or password!");
            return new RedirectView("/login");
        }
    }

    @PostMapping("adminlogin")
    public RedirectView adminlogin(@RequestParam String email, @RequestParam String password, HttpSession session) {
        AdminUser adminUser = adminUserRepository.findByEmail(email);
        if (adminUser == null) {
            session.setAttribute("error", "Invalid email or password!");
            return new RedirectView("/adminlog");
        }

        boolean isValid = PasswordUtils.checkPassword(password, adminUser.getPassword());
        if (isValid) {
            session.setAttribute("user", adminUser);
            session.setAttribute("message", "Login Successful!");

            return new RedirectView("/admin");
        } else {
            session.setAttribute("error", "Invalid email or password!");
            return new RedirectView("/adminlog");
        }
    }

    @PostMapping("stafflogin")
    public RedirectView stafflogin(@RequestParam String email, @RequestParam String password, HttpSession session) {
        Staff staff = staffRepository.findByEmail(email);
        if (staff == null) {
            session.setAttribute("error", "Invalid email or password!");
            return new RedirectView("/stafflog");
        }

        boolean isValid = PasswordUtils.checkPassword(password, staff.getPassword());
        if (isValid) {
            session.setAttribute("user", staff);
            session.setAttribute("message", "Login Successful!");

            return new RedirectView("/staff");
        } else {
            session.setAttribute("error", "Invalid email or password!");
            return new RedirectView("/stafflog");
        }
    }

    @GetMapping("clearMessage")
    @ResponseBody
    public void clearMessage(HttpSession session) {
        session.removeAttribute("message");
    }
}
