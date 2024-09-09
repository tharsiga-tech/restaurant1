package com.example.ABC_Restaurant_Web_Application.service;

import com.example.ABC_Restaurant_Web_Application.model.Customer;
import com.example.ABC_Restaurant_Web_Application.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;


    public Customer addCustomer(Customer customer)
    {
        return customerRepository.save(customer);
    }

    public Customer getCustomer(Long id)
    {
        return customerRepository.findById(id).orElse(null);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public String deleteCustomer(Long id) {
        customerRepository.deleteById(id);
        return "Customer Deleted Successfully!";
    }

    public Customer updateCustomer(Long id, Customer customer)
    {
        customer.setId(id);
        return customerRepository.save(customer);
    }
}
