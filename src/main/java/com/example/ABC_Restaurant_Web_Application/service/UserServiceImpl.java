//package com.example.ABC_Restaurant_Web_Application.service;
//
//import com.example.ABC_Restaurant_Web_Application.Dto.UserDto;
//import com.example.ABC_Restaurant_Web_Application.model.User;
//import com.example.ABC_Restaurant_Web_Application.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserServiceImpl implements UserService {
////    @Autowired
////    private PasswordEncoder passwordEncoder;
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Override
//    public User save(UserDto userDto) {
//        User user = new User(userDto.getEmail(), userDto.getPassword() , userDto.getRole(), userDto.getFullname());
//        return userRepository.save(user);
//    }
//}
