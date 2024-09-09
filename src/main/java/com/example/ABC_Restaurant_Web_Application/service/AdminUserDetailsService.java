//package com.example.ABC_Restaurant_Web_Application.service;
//
//import com.example.ABC_Restaurant_Web_Application.model.AdminUser;
//import com.example.ABC_Restaurant_Web_Application.repository.AdminUserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class AdminUserDetailsService implements UserDetailsService {
//
//    @Autowired
//    private AdminUserRepository adminUserRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        AdminUser user = adminUserRepository.findByUsername(username);
//        if (user == null) {
//            throw new UsernameNotFoundException("User not found");
//        }
//        return org.springframework.security.core.userdetails.User
//                .withUsername(user.getUsername())
//                .password(user.getPassword())
//                .authorities("ROLE_ADMIN")
//                .build();
//    }
//}
