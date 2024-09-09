package com.example.ABC_Restaurant_Web_Application.repository;

import com.example.ABC_Restaurant_Web_Application.model.AdminUser;
import com.example.ABC_Restaurant_Web_Application.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminUserRepository extends JpaRepository<AdminUser, Long> {
    //AdminUser findByUsername(String username);
    AdminUser findByEmail(String email);
}
