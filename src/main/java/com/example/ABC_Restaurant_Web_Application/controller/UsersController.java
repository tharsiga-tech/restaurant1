//package com.example.ABC_Restaurant_Web_Application.controller;
//
//import com.example.ABC_Restaurant_Web_Application.model.Users;
//import com.example.ABC_Restaurant_Web_Application.service.UsersService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@Controller
//@CrossOrigin(origins = "*")
//public class UsersController {
//    @Autowired
//    UsersService usersService;
//
//    @PostMapping("/addUsers")
//    public Users addUsers(@RequestBody Users users)
//    {
//        return usersService.addUsers(users);
//    }
//
//    @GetMapping("/getUsers/{id}")
//    public Users getUsers(@PathVariable Long id)
//    {
//        return usersService.getUsers(id);
//    }
//
//    @GetMapping("/getAllUsers")
//    public List<Users> getAllUsers() {
//        return usersService.getAllUsers();
//    }
//
//    @DeleteMapping("/deleteUsers/{id}")
//    public String deleteUsers(@PathVariable Long id) {
//        return usersService.deleteUsers(id);
//    }
//
//    @PutMapping("/updateUsers/{id}")
//    public Users updateUsers(@PathVariable Long id, @RequestBody Users users) {
//        return usersService.updateUsers(id, users);
//    }
//}
