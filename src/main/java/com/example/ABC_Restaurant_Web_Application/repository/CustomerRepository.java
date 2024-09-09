package com.example.ABC_Restaurant_Web_Application.repository;

import com.example.ABC_Restaurant_Web_Application.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
