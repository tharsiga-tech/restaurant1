//package com.example.ABC_Restaurant_Web_Application.service;
//
//import com.example.ABC_Restaurant_Web_Application.model.Users;
//import com.example.ABC_Restaurant_Web_Application.repository.UsersRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class UsersService {
//    @Autowired
//    UsersRepository usersRepository;
//
//
//    public Users addUsers(Users users)
//    {
//        return usersRepository.save(users);
//    }
//
//    public Users getUsers(Long id)
//    {
//        return usersRepository.findById(id).orElse(null);
//    }
//
//    public List<Users> getAllUsers() {
//        return usersRepository.findAll();
//    }
//
//    public String deleteUsers(Long id) {
//        usersRepository.deleteById(id);
//        return "User Deleted Successfully!";
//    }
//
//    public Users updateUsers(Long id, Users users)
//    {
//        users.setId(id);
//        return usersRepository.save(users);
//    }
//}
