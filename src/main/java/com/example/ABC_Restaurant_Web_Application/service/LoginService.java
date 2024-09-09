//package com.example.ABC_Restaurant_Web_Application.service;
//
//import com.example.ABC_Restaurant_Web_Application.Dto.LoginDto;
//import com.example.ABC_Restaurant_Web_Application.model.User;
//import com.example.ABC_Restaurant_Web_Application.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//
//public class LoginService {
//    @Autowired
//    private UserRepository userRepository;
//
//    public User loginUser(LoginDto loginDto) {
//        // Find user by username and password
//        return userRepository.findByUsernameAndPassword(loginDto.getUsername(), loginDto.getPassword());
//    }
//}
